import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.ImageIcon;

public class My_Calculator extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					My_Calculator frame = new My_Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public My_Calculator() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(My_Calculator.class.getResource("/Calculator/main_calculator  .png")));
		setTitle("Raaj's Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 476, 332);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l_1 = new JLabel("Welcome to Raaj's Calculator.");
		l_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		l_1.setHorizontalAlignment(SwingConstants.CENTER);
		l_1.setBounds(40, 10, 375, 25);
		contentPane.add(l_1);
		
		JLabel lblNewLabel = new JLabel("Please Select one of the Calculators.");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(40, 34, 375, 25);
		contentPane.add(lblNewLabel);
		
		JButton b_normal_cal = new JButton("Normal Maths Calculator");
		b_normal_cal.setToolTipText("This is Normal Calculator. It performs basic mathematics calculations.");
		b_normal_cal.setFont(new Font("Times New Roman", Font.BOLD, 12));
		b_normal_cal.setHorizontalAlignment(SwingConstants.LEFT);
		b_normal_cal.setIcon(new ImageIcon(My_Calculator.class.getResource("/Calculator/Normal_calculator .png")));
		b_normal_cal.setBounds(125, 75, 200, 25);
		contentPane.add(b_normal_cal);
		b_normal_cal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Normal_Calculator nc = new Normal_Calculator();
				nc.setVisible(true);
				dispose();
			}
		});
		
		JButton b_scientific_cal = new JButton("Scientific Calculator");
		b_scientific_cal.setToolTipText("This is Scientific Calculator. It performs some advance mathematics calculations.");
		b_scientific_cal.setFont(new Font("Times New Roman", Font.BOLD, 12));
		b_scientific_cal.setHorizontalAlignment(SwingConstants.LEFT);
		b_scientific_cal.setIcon(new ImageIcon(My_Calculator.class.getResource("/Calculator/scientific_calculator.png")));
		b_scientific_cal.setBounds(125, 110, 200, 25);
		contentPane.add(b_scientific_cal);
		b_scientific_cal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scientific_Calculator sc = new Scientific_Calculator();
				sc.setVisible(true);
				dispose();
			}
		});
		
		JButton b_programming_cal = new JButton("Programming Calculator");
		b_programming_cal.setToolTipText("This is Programming Calculator. It solves some basic programming problems.");
		b_programming_cal.setFont(new Font("Times New Roman", Font.BOLD, 12));
		b_programming_cal.setHorizontalAlignment(SwingConstants.LEFT);
		b_programming_cal.setIcon(new ImageIcon(My_Calculator.class.getResource("/Calculator/Programming_calculator.png")));
		b_programming_cal.setBounds(125, 145, 200, 25);
		contentPane.add(b_programming_cal);
		b_programming_cal.addActionListener(new  ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Programming_Calculator pc = new Programming_Calculator();
				pc.setVisible(true);
				dispose();
			}	
		});
		
		JButton b_trigonometric_cal = new JButton("Trigonometric Calculator");
		b_trigonometric_cal.setToolTipText("This is Trigonometric Calculator. It performs some trigonometric operations.");
		b_trigonometric_cal.setFont(new Font("Times New Roman", Font.BOLD, 12));
		b_trigonometric_cal.setHorizontalAlignment(SwingConstants.LEFT);
		b_trigonometric_cal.setIcon(new ImageIcon(My_Calculator.class.getResource("/Calculator/Trigonometric_Calculator.png")));
		b_trigonometric_cal.setBounds(125, 180, 200, 25);
		contentPane.add(b_trigonometric_cal);
		b_trigonometric_cal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Trigonometric_Calculator tc = new Trigonometric_Calculator();
				tc.setVisible(true);
				dispose();
			}
		});

		
		JButton b_close = new JButton("Close Calculator");
		b_close.setToolTipText("Please! Click it. If you want to close the Calculator.");
		b_close.setFont(new Font("Times New Roman", Font.BOLD, 12));
		b_close.setBounds(125, 215, 200, 25);
		contentPane.add(b_close);
		b_close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = JOptionPane.showConfirmDialog(b_close, "Are you sure?");
                JOptionPane.setRootFrame(null);
                if (a == JOptionPane.YES_OPTION) {
				Welcome_Page wp = new Welcome_Page();
				wp.setVisible(true);
				dispose();
                }
			}
		});
		
	}
}
