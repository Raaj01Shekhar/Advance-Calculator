import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class Login_Page extends JFrame {

	private JPanel contentPane;
	private JTextField t_uname;
	private JPasswordField p_pass;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Page frame = new Login_Page();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login_Page() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login_Page.class.getResource("/Calculator/login.png")));
		setResizable(false);
		setTitle("Login Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1 = new JLabel("Please fill the given details to get logged in.");
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		l1.setBounds(10, 10, 410, 25);
		contentPane.add(l1);
		
		JLabel l_uname = new JLabel("User Name");
		l_uname.setFont(new Font("Times New Roman", Font.BOLD, 12));
		l_uname.setBounds(10, 55, 80, 25);
		contentPane.add(l_uname);
		
		t_uname = new JTextField();
		t_uname.setFont(new Font("Times New Roman", Font.BOLD, 12));
		t_uname.setBounds(90, 55, 330, 25);
		contentPane.add(t_uname);
		t_uname.setColumns(10);
		
		JLabel l_pass = new JLabel("Password");
		l_pass.setFont(new Font("Times New Roman", Font.BOLD, 12));
		l_pass.setBounds(10, 85, 80, 25);
		contentPane.add(l_pass);
		
		p_pass = new JPasswordField();
		p_pass.setFont(new Font("Times New Roman", Font.BOLD, 12));
		p_pass.setText("");
		p_pass.setBounds(90, 85, 330, 25);
		contentPane.add(p_pass);
		
		JButton b_back = new JButton("Back");
		b_back.setFont(new Font("Times New Roman", Font.BOLD, 12));
		b_back.setBounds(10, 125, 105, 25);
		contentPane.add(b_back);
		b_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Welcome_Page wp = new Welcome_Page();
				wp.setVisible(true);
				dispose();
			}
		});
		
		JButton b_registration = new JButton("Registration");
		b_registration.setFont(new Font("Times New Roman", Font.BOLD, 12));
		b_registration.setBounds(315, 125, 105, 25);
		contentPane.add(b_registration);
		b_registration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registration_Page rp = new Registration_Page();
				rp.setVisible(true);
				dispose();
			}
		});
		
		JLabel l2 = new JLabel("Have you forgotten your pasword. Please click on bellow given button.");
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		l2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		l2.setBounds(10, 170, 410, 25);
		contentPane.add(l2);
		
		JButton b_fpass = new JButton("Forgot Password");
		b_fpass.setFont(new Font("Times New Roman", Font.BOLD, 12));
		b_fpass.setBounds(144, 195, 125, 25);
		contentPane.add(b_fpass);
		b_fpass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Forgot_Password_Page fpp = new Forgot_Password_Page();
				fpp.setVisible(true);
				dispose();
			}
		});
		
		JLabel l3 = new JLabel("Do you want to change your password. Please click on bellow given button.");
		l3.setHorizontalAlignment(SwingConstants.CENTER);
		l3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		l3.setBounds(10, 235, 410, 25);
		contentPane.add(l3);
		
		JButton b_cpass = new JButton("Change Password");
		b_cpass.setFont(new Font("Times New Roman", Font.BOLD, 12));
		b_cpass.setBounds(144, 262, 145, 25);
		contentPane.add(b_cpass);
		b_cpass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Change_Password_Page cpp = new Change_Password_Page();
				cpp.setVisible(true);
				dispose();
			}
		});
		
		JButton b_submit = new JButton("Submit");
		b_submit.setFont(new Font("Times New Roman", Font.BOLD, 12));
		b_submit.setBounds(164, 125, 105, 25);
		contentPane.add(b_submit);
		b_submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String userName = t_uname.getText();
                String password = p_pass.getText();
                
                try {
                	 Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/my_calculator_database", "root", "root");
                	 PreparedStatement st =  connection.prepareStatement("Select user_name, password from registered_people where user_name=? and password=?");

                    st.setString(1, userName);
                    st.setString(2, password);
                    
                    ResultSet rs = st.executeQuery();
                    
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(b_submit, "You have successfully logged in.");
                        My_Calculator mc = new My_Calculator();
        				mc.setVisible(true);
        				dispose();
                    } 
                    else {
                        JOptionPane.showMessageDialog(b_submit, "Wrong Username or Password.");
                    }
                    
                    st.close();
                    connection.close();
                } 
                catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }
				
			}
		});
		
		
	}
}
