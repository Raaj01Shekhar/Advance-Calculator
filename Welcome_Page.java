import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Toolkit;

public class Welcome_Page extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome_Page frame = new Welcome_Page();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Welcome_Page() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Welcome_Page.class.getResource("/Calculator/welcome.png")));
		setResizable(false);
		setTitle("Welcome Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1 = new JLabel("Welcome to the registration page.");
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		l1.setBounds(60, 10, 341, 22);
		contentPane.add(l1);
		
		JLabel l2 = new JLabel("Please register yourself to use the Calculator services.");
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		l2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		l2.setBounds(10, 59, 416, 22);
		contentPane.add(l2);
		
		JButton b_registration = new JButton("Registration");
		b_registration.setToolTipText("Click to register yourself.");
		b_registration.setFont(new Font("Times New Roman", Font.BOLD, 12));
		b_registration.setBounds(175, 91, 100, 25);
		contentPane.add(b_registration);
		b_registration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registration_Page rp = new Registration_Page();
				rp.setVisible(true);
				dispose();
			}
		});
		
		JLabel l3 = new JLabel("Registered people please login from here and use Calculator services.");
		l3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		l3.setHorizontalAlignment(SwingConstants.CENTER);
		l3.setBounds(10, 132, 426, 22);
		contentPane.add(l3);
		
		JButton b_login = new JButton("Login");
		b_login.setToolTipText("Click to login into calculator.");
		b_login.setFont(new Font("Times New Roman", Font.BOLD, 12));
		b_login.setBounds(175, 164, 100, 25);
		contentPane.add(b_login);
		b_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_Page lp = new Login_Page();
				lp.setVisible(true);
				dispose();
			}
		});
		
		JButton b_quite = new JButton("Quite");
		b_quite.setToolTipText("Click to close the window.");
		b_quite.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b_quite.setBounds(175, 213, 100, 25);
		contentPane.add(b_quite);
		b_quite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = JOptionPane.showConfirmDialog(b_quite, "Are you sure?");
                JOptionPane.setRootFrame(null);
                if (a == JOptionPane.YES_OPTION) {
                    dispose();
                }
			}
		});
		
	}
}
