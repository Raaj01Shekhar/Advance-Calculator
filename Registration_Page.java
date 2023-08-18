import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;

public class Registration_Page extends JFrame {

	private JPanel contentPane;
	private JTextField t_fname;
	private JTextField t_lname;
	private JTextField t_mob;
	private JTextField t_email;
	private JTextField t_uname;
	private JPasswordField p_pass;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration_Page frame = new Registration_Page();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Registration_Page() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Registration_Page.class.getResource("/Calculator/registration.png")));
		setResizable(false);
		setTitle("Registration Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1 = new JLabel("Please fil the bellow given details to get register.");
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		l1.setBounds(10, 10, 416, 27);
		contentPane.add(l1);
		
		JLabel l_fname = new JLabel("First Name");
		l_fname.setFont(new Font("Times New Roman", Font.BOLD, 12));
		l_fname.setBounds(10, 45, 80, 25);
		contentPane.add(l_fname);
		
		t_fname = new JTextField();
		t_fname.setFont(new Font("Times New Roman", Font.BOLD, 12));
		t_fname.setText("");
		t_fname.setBounds(90, 45, 330, 25);
		contentPane.add(t_fname);
		t_fname.setColumns(10);
		
		JLabel l_lname = new JLabel("Last Name");
		l_lname.setFont(new Font("Times New Roman", Font.BOLD, 12));
		l_lname.setBounds(10, 75, 80, 25);
		contentPane.add(l_lname);
		
		t_lname = new JTextField();
		t_lname.setFont(new Font("Times New Roman", Font.BOLD, 12));
		t_lname.setBounds(90, 75, 330, 25);
		contentPane.add(t_lname);
		t_lname.setColumns(10);
		
		JLabel l_mob = new JLabel("Phone Number");
		l_mob.setFont(new Font("Times New Roman", Font.BOLD, 12));
		l_mob.setHorizontalAlignment(SwingConstants.LEFT);
		l_mob.setBounds(10, 105, 80, 25);
		contentPane.add(l_mob);
		
		t_mob = new JTextField();
		t_mob.setFont(new Font("Times New Roman", Font.BOLD, 12));
		t_mob.setBounds(90, 105, 330, 25);
		contentPane.add(t_mob);
		t_mob.setColumns(10);
		
		JLabel l_email = new JLabel("E-Mail ID");
		l_email.setFont(new Font("Times New Roman", Font.BOLD, 12));
		l_email.setBounds(10, 135, 80, 25);
		contentPane.add(l_email);
		
		t_email = new JTextField();
		t_email.setFont(new Font("Times New Roman", Font.BOLD, 12));
		t_email.setBounds(90, 135, 330, 25);
		contentPane.add(t_email);
		t_email.setColumns(10);
		
		JLabel l_uname = new JLabel("User Name");
		l_uname.setFont(new Font("Times New Roman", Font.BOLD, 12));
		l_uname.setBounds(10, 165, 80, 25);
		contentPane.add(l_uname);
		
		t_uname = new JTextField();
		t_uname.setFont(new Font("Times New Roman", Font.BOLD, 12));
		t_uname.setBounds(90, 165, 330, 25);
		contentPane.add(t_uname);
		t_uname.setColumns(10);
		
		JLabel l_pass = new JLabel("Password");
		l_pass.setFont(new Font("Times New Roman", Font.BOLD, 12));
		l_pass.setBounds(10, 195, 80, 25);
		contentPane.add(l_pass);
		
		p_pass = new JPasswordField();
		p_pass.setFont(new Font("Times New Roman", Font.BOLD, 12));
		p_pass.setBounds(90, 195, 330, 25);
		contentPane.add(p_pass);
		
		JButton b_back = new JButton("Back");
		b_back.setFont(new Font("Times New Roman", Font.BOLD, 12));
		b_back.setBounds(10, 250, 85, 25);
		contentPane.add(b_back);
		b_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Welcome_Page wp = new Welcome_Page();
				wp.setVisible(true);
				dispose();
			}
		});
		
		JButton b_login = new JButton("Login");
		b_login.setFont(new Font("Times New Roman", Font.BOLD, 12));
		b_login.setBounds(335, 250, 85, 25);
		contentPane.add(b_login);
		b_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_Page lp = new Login_Page();
				lp.setVisible(true);
				dispose();
			}
		});
		
		JButton b_submit = new JButton("Submit");
		b_submit.setFont(new Font("Times New Roman", Font.BOLD, 12));
		b_submit.setBounds(172, 250, 85, 25);
		contentPane.add(b_submit);
		b_submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String firstName = t_fname.getText();
                String lastName = t_lname.getText();
                String emailId = t_email.getText();
                String userName = t_uname.getText();
                String mobileNumber = t_mob.getText();
                int len = mobileNumber.length();
                String password = p_pass.getText();
                
                //String msg = "" + firstName;
                //msg += " \n";
                
                if (len != 10) {
                    JOptionPane.showMessageDialog(b_submit, "Please, enter a valid mobile number.");
                }
              
                try {
                    Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/my_calculator_database", "root", "root");
                    PreparedStatement st =  connection.prepareStatement("INSERT INTO registered_people values (?, ?, ?, ?, ?,?)");
                    
                    st.setString(1, firstName);
                    st.setString(2, lastName);
                    st.setString(3, mobileNumber);
                    st.setString(4, emailId);
                    st.setString(5, userName);
                    st.setString(6, password);
                    
                    int rs = st.executeUpdate();
                    
                    if (rs==0) {
                    JOptionPane.showMessageDialog(b_submit, "Data does not exist.");
                    }
                    else {
                    	JOptionPane.showMessageDialog(b_submit, "Welcome, " + firstName + " You have successfully registered.");
                    }
                    
                    Login_Page lp = new Login_Page();
    				lp.setVisible(true);
    				dispose();
    				
                    connection.close();
                } 
                
                catch (Exception exception) {
                    exception.printStackTrace();
                }
				
			}
		});
		
	}
}
