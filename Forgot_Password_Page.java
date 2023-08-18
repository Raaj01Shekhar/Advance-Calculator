import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Forgot_Password_Page extends JFrame {

	private JPanel contentPane;
	private JTextField t_uname;
	private JTextField t_email;
	private JTextField t_npass;
	private JTextField t_cnpass;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Forgot_Password_Page frame = new Forgot_Password_Page();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Forgot_Password_Page() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Forgot_Password_Page.class.getResource("/Calculator/forgot_password.png")));
		setResizable(false);
		setTitle("Password Reset Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 472, 277);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1 = new JLabel("Here you can reset your password.");
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		l1.setBounds(10, 10, 415, 25);
		contentPane.add(l1);
		
		JLabel l_uname = new JLabel("User Name");
		l_uname.setFont(new Font("Times New Roman", Font.BOLD, 12));
		l_uname.setBounds(10, 45, 130, 25);
		contentPane.add(l_uname);
		
		t_uname = new JTextField();
		t_uname.setFont(new Font("Times New Roman", Font.BOLD, 12));
		t_uname.setBounds(140, 45, 285, 25);
		contentPane.add(t_uname);
		t_uname.setColumns(10);
		
		JLabel l_email = new JLabel("E-Mail ID");
		l_email.setFont(new Font("Times New Roman", Font.BOLD, 12));
		l_email.setBounds(10, 75, 130, 25);
		contentPane.add(l_email);
		
		t_email = new JTextField();
		t_email.setFont(new Font("Times New Roman", Font.BOLD, 12));
		t_email.setBounds(140, 75, 285, 25);
		contentPane.add(t_email);
		t_email.setColumns(10);
		
		JLabel l_npass = new JLabel("New Password");
		l_npass.setFont(new Font("Times New Roman", Font.BOLD, 12));
		l_npass.setBounds(10, 105, 130, 25);
		contentPane.add(l_npass);
		
		t_npass = new JPasswordField();
		t_npass.setFont(new Font("Times New Roman", Font.BOLD, 12));
		t_npass.setBounds(140, 105, 285, 25);
		contentPane.add(t_npass);
		t_npass.setColumns(10);
		
		JLabel l_cnpass = new JLabel("Confirm New Password");
		l_cnpass.setFont(new Font("Times New Roman", Font.BOLD, 12));
		l_cnpass.setBounds(10, 135, 130, 25);
		contentPane.add(l_cnpass);
		
		t_cnpass = new JPasswordField();
		t_cnpass.setFont(new Font("Times New Roman", Font.BOLD, 12));
		t_cnpass.setBounds(140, 135, 285, 25);
		contentPane.add(t_cnpass);
		t_cnpass.setColumns(10);
		
		JButton b_back = new JButton("Back");
		b_back.setFont(new Font("Times New Roman", Font.BOLD, 12));
		b_back.setBounds(140, 182, 85, 25);
		contentPane.add(b_back);
		b_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_Page lp = new Login_Page();
				lp.setVisible(true);
				dispose();
			}
		});
		
		JButton b_submit = new JButton("Submit");
		b_submit.setFont(new Font("Times New Roman", Font.BOLD, 12));
		b_submit.setBounds(341, 182, 85, 25);
		contentPane.add(b_submit);
		b_submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String username = t_uname.getText();
				String email = t_email.getText();
				String new_password = t_npass.getText();
				String retype_new_password = t_cnpass.getText();
				
				  if(new_password.equals(retype_new_password)) {
				  
	                try {
	                    
	                	Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/my_calculator_database", "root", "root");
	                    PreparedStatement st = connection .prepareStatement("Update registered_people set password=? where user_name=? and email_id=?");

	                    st.setString(1, new_password);
	                    st.setString(2, username);
	                    st.setString(3, email);
	                    int rs = st.executeUpdate();
	                    
	                   
	                    if (rs==0) {
	                    JOptionPane.showMessageDialog(b_submit, "Data does not exist.");
	                    }
	                    else {
	                    	JOptionPane.showMessageDialog(b_submit, "Password has been successfully reseted.");
	                    	Login_Page lp = new Login_Page();
	        				lp.setVisible(true);
	        				dispose();
	                    }
	                }

	                 catch (SQLException sqlException) {
	                    sqlException.printStackTrace();
	                }      
				  }
                  else {
                   	JOptionPane.showMessageDialog(b_submit, "New Password & Confirm New Password do not match.");
                  }
			}
		});
		
	}

}
