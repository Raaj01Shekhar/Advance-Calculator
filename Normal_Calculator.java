import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Normal_Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField t_in;
	private JTextField t_out;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Normal_Calculator frame = new Normal_Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	int choice ;
	double num ,result;
	public Normal_Calculator() {
		setResizable(false);
		setFont(new Font("Times New Roman", Font.BOLD, 14));
		setIconImage(Toolkit.getDefaultToolkit().getImage(Normal_Calculator.class.getResource("/Calculator/Normal_calculator .png")));
		setTitle("Normal Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 408, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		t_in = new JTextField();
		t_in.setFont(new Font("Times New Roman", Font.BOLD, 14));
		t_in.setEditable(false);
		t_in.setHorizontalAlignment(SwingConstants.RIGHT);
		t_in.setBounds(10, 10, 368, 25);
		contentPane.add(t_in);
		t_in.setColumns(10);
		
		t_out = new JTextField();
		t_out.setFont(new Font("Times New Roman", Font.BOLD, 14));
		t_out.setEditable(false);
		t_out.setHorizontalAlignment(SwingConstants.RIGHT);
		t_out.setBounds(10, 40, 368, 25);
		contentPane.add(t_out);
		t_out.setColumns(10);
		
		
		JButton b_0 = new JButton("0");
		b_0.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b_0.setBounds(105, 225, 85, 25);
		contentPane.add(b_0);
		b_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_in.setText(t_in.getText()+"0");
				t_out.setText(t_out.getText()+"0");
			}
		});
		
		
		JButton b_1 = new JButton("1");
		b_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b_1.setBounds(10, 190, 85, 25);
		contentPane.add(b_1);
		b_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_in.setText(t_in.getText()+"1");
				t_out.setText(t_out.getText()+"1");
			}
		});
		
		JButton b_2 = new JButton("2");
		b_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b_2.setBounds(105, 190, 85, 25);
		contentPane.add(b_2);
		b_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_in.setText(t_in.getText()+"2");
				t_out.setText(t_out.getText()+"2");
			}
		});
		
		JButton b_3 = new JButton("3");
		b_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b_3.setBounds(200, 190, 85, 25);
		contentPane.add(b_3);
		b_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_in.setText(t_in.getText()+"3");
				t_out.setText(t_out.getText()+"3");
			}
		});
		
		JButton b_4 = new JButton("4");
		b_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b_4.setBounds(10, 155, 85, 25);
		contentPane.add(b_4);
		b_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_in.setText(t_in.getText()+"4");
				t_out.setText(t_out.getText()+"4");
			}
		});
		
		JButton b_5 = new JButton("5");
		b_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b_5.setBounds(105, 155, 85, 25);
		contentPane.add(b_5);
		b_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_in.setText(t_in.getText()+"5");
				t_out.setText(t_out.getText()+"5");
			}
		});
		
		JButton b_6 = new JButton("6");
		b_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b_6.setBounds(200, 155, 85, 25);
		contentPane.add(b_6);
		b_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_in.setText(t_in.getText()+"6");
				t_out.setText(t_out.getText()+"6");
			}
		});
		
		JButton b_7 = new JButton("7");
		b_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b_7.setBounds(10, 120, 85, 25);
		contentPane.add(b_7);
		b_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_in.setText(t_in.getText()+"7");
				t_out.setText(t_out.getText()+"7");
			}
		});
		
		JButton b_8 = new JButton("8");
		b_8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b_8.setBounds(105, 120, 85, 25);
		contentPane.add(b_8);
		b_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_in.setText(t_in.getText()+"8");
				t_out.setText(t_out.getText()+"8");
			}
		});
		
		JButton b_9 = new JButton("9");
		b_9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b_9.setBounds(200, 120, 85, 25);
		contentPane.add(b_9);
		b_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_in.setText(t_in.getText()+"9");
				t_out.setText(t_out.getText()+"9");
			}
		});
		
		JButton b_decimal = new JButton(".");
		b_decimal.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b_decimal.setBounds(200, 225, 85, 25);
		contentPane.add(b_decimal);
		b_decimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_in.setText(t_in.getText()+".");
				t_out.setText(t_out.getText()+".");
			}
		});
		
		JButton b_sum = new JButton("+");
		b_sum.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b_sum.setBounds(295, 190, 85, 25);
		contentPane.add(b_sum);
		b_sum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(t_out.getText());
				choice = 1;
				t_in.setText(num +"+");
				t_out.setText("");
			}	
		});
		
		JButton b_sub = new JButton("-");
		b_sub.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b_sub.setBounds(295, 155, 85, 25);
		contentPane.add(b_sub);
		b_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(t_out.getText());
				choice = 2;
				t_in.setText(num +"-");
				t_out.setText("");
			}
		});
				
		JButton b_mul = new JButton("*");
		b_mul.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b_mul.setBounds(295, 120, 85, 25);
		contentPane.add(b_mul);
		b_mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(t_out.getText());
				choice = 3;
				t_in.setText(num +"*");
				t_out.setText("");
			}
		});

		JButton b_div = new JButton("/");
		b_div.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b_div.setBounds(295, 85, 85, 25);
		contentPane.add(b_div);
		b_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(t_out.getText());
				choice = 4;
				t_in.setText(num +"/");
				t_out.setText("");
			}
		});
		

		JButton b_mod = new JButton("%");
		b_mod.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b_mod.setBounds(105, 85, 85, 25);
		contentPane.add(b_mod);
		b_mod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(t_out.getText());
				choice = 5;
				t_in.setText(num +"%");
				t_out.setText("");
			}
		});
		
		JButton b_ac = new JButton("AC");
		b_ac.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b_ac.setBounds(10, 225, 85, 25);
		contentPane.add(b_ac);
		b_ac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_in.setText("");
				t_out.setText("");
			}
		});
		
		JButton b_clear = new JButton("X");
		b_clear.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b_clear.setBounds(200, 85, 85, 25);
		contentPane.add(b_clear);
		b_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int length_in = t_in.getText().length();
				int num_in = t_in.getText().length()-1;
				String store_in;
				
				if (length_in>0) {
					StringBuilder back = new StringBuilder(t_in.getText());
					back.deleteCharAt(num_in);
					store_in = back.toString();
					t_in.setText(store_in);
				}
				
				int length_out = t_out.getText().length();
				int num_out = t_out.getText().length()-1;
				String store_out;
				
				if (length_out>0) {
					StringBuilder back = new StringBuilder(t_out.getText());
					back.deleteCharAt(num_out);
					store_out = back.toString();
					t_out.setText(store_out);
				}
			}
		});
		
		JButton b_back = new JButton("Back");
		b_back.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b_back.setBounds(10, 85, 85, 25);
		contentPane.add(b_back);
		b_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = JOptionPane.showConfirmDialog(b_back, "Are you sure?");
                JOptionPane.setRootFrame(null);
                if (a == JOptionPane.YES_OPTION) {
                	My_Calculator mc = new My_Calculator();
    				mc.setVisible(true);
                    dispose();
                }
			}
		});

		JButton b_equal = new JButton("=");
		b_equal.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b_equal.setBounds(295, 225, 85, 25);
		contentPane.add(b_equal);
		b_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(choice) {
				case 1:
					result= num+Double.parseDouble(t_out.getText());
					t_in.setText(num+"+"+Double.parseDouble(t_out.getText()));
					t_out.setText(Double.toString(result));
					break;
					
				case 2:
					result= num-Double.parseDouble(t_out.getText());
					t_in.setText(num+"-"+Double.parseDouble(t_out.getText()));
					t_out.setText(Double.toString(result));
					break;
					
				case 3:
					result= num*Double.parseDouble(t_out.getText());
					t_in.setText(num+"*"+Double.parseDouble(t_out.getText()));
					t_out.setText(Double.toString(result));
					break;
					
				case 4:
					result= num/Double.parseDouble(t_out.getText());
					t_in.setText(num+"/"+Double.parseDouble(t_out.getText()));
					t_out.setText(Double.toString(result));
					break;
					
				case 5:
					result= num%Double.parseDouble(t_out.getText());
					t_in.setText(num+"%"+Double.parseDouble(t_out.getText()));
					t_out.setText(Double.toString(result));
					break;
				}
			}
		});
		
	}
}
