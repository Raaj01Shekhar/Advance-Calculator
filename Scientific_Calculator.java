import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Scientific_Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField t_in;
	private JTextField t_out;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scientific_Calculator frame = new Scientific_Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	int choice ;
	double num ,result;
	public Scientific_Calculator() {
		setResizable(false);
		setTitle("Scientific Calculator");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Scientific_Calculator.class.getResource("/Calculator/scientific_calculator.png")));
		setFont(new Font("Times New Roman", Font.BOLD, 14));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		t_in = new JTextField();
		t_in.setFont(new Font("Times New Roman", Font.BOLD, 14));
		t_in.setEditable(false);
		t_in.setHorizontalAlignment(SwingConstants.RIGHT);
		t_in.setBounds(10, 10, 560, 25);
		contentPane.add(t_in);
		t_in.setColumns(10);
		
		t_out = new JTextField();
		t_out.setFont(new Font("Times New Roman", Font.BOLD, 14));
		t_out.setEditable(false);
		t_out.setHorizontalAlignment(SwingConstants.RIGHT);
		t_out.setBounds(10, 40, 560, 25);
		contentPane.add(t_out);
		t_out.setColumns(10);
		
		
		JButton b_0 = new JButton("0");
		b_0.setBounds(105, 225, 85, 25);
		b_0.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_0);
		b_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_in.setText(t_in.getText()+"0");
				t_out.setText(t_out.getText()+"0");
			}
		});
		
		
		JButton b_1 = new JButton("1");
		b_1.setBounds(10, 190, 85, 25);
		b_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_1);
		b_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_in.setText(t_in.getText()+"1");
				t_out.setText(t_out.getText()+"1");
			}
		});
		
		JButton b_2 = new JButton("2");
		b_2.setBounds(105, 190, 85, 25);
		b_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_2);
		b_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_in.setText(t_in.getText()+"2");
				t_out.setText(t_out.getText()+"2");
			}
		});
		
		JButton b_3 = new JButton("3");
		b_3.setBounds(200, 190, 85, 25);
		b_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_3);
		b_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_in.setText(t_in.getText()+"3");
				t_out.setText(t_out.getText()+"3");
			}
		});
		
		JButton b_4 = new JButton("4");
		b_4.setBounds(10, 155, 85, 25);
		b_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_4);
		b_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_in.setText(t_in.getText()+"4");
				t_out.setText(t_out.getText()+"4");
			}
		});
		
		JButton b_5 = new JButton("5");
		b_5.setBounds(105, 155, 85, 25);
		b_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_5);
		b_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_in.setText(t_in.getText()+"5");
				t_out.setText(t_out.getText()+"5");
			}
		});
		
		JButton b_6 = new JButton("6");
		b_6.setBounds(200, 155, 85, 25);
		b_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_6);
		b_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_in.setText(t_in.getText()+"6");
				t_out.setText(t_out.getText()+"6");
			}
		});
		
		JButton b_7 = new JButton("7");
		b_7.setBounds(10, 120, 85, 25);
		b_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_7);
		b_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_in.setText(t_in.getText()+"7");
				t_out.setText(t_out.getText()+"7");
			}
		});
		
		JButton b_8 = new JButton("8");
		b_8.setBounds(105, 120, 85, 25);
		b_8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_8);
		b_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_in.setText(t_in.getText()+"8");
				t_out.setText(t_out.getText()+"8");
			}
		});
		
		JButton b_9 = new JButton("9");
		b_9.setBounds(200, 120, 85, 25);
		b_9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_9);
		b_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_in.setText(t_in.getText()+"9");
				t_out.setText(t_out.getText()+"9");
			}
		});
		
		JButton b_ac = new JButton("AC");
		b_ac.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b_ac.setBounds(200, 85, 85, 25);
		contentPane.add(b_ac);
		b_ac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_in.setText("");
				t_out.setText("");
			}
		});
		
		JButton b_clear = new JButton("X");
		b_clear.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b_clear.setBounds(105, 85, 85, 25);
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
		
		JButton b_decimal = new JButton(".");
		b_decimal.setBounds(10, 225, 85, 25);
		b_decimal.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_decimal);
		b_decimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_in.setText(t_in.getText()+".");
				t_out.setText(t_out.getText()+".");
			}
		});

		JButton b_m_power_n = new JButton("m^n");
		b_m_power_n.setBounds(295, 225, 85, 25);
		b_m_power_n .setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_m_power_n);
		b_m_power_n.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(t_out.getText());
				choice = 1;
				t_in.setText(num +"^");
				t_out.setText("");
			}
		});
		
		JButton b_m_root_n = new JButton("m Root n");
		b_m_root_n.setBounds(295, 190, 85, 25);
		b_m_root_n.setFont(new Font("Times New Roman", Font.BOLD, 13));
		contentPane.add(b_m_root_n);
		b_m_root_n.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(t_out.getText());
				choice = 2;
				t_in.setText(num +" root ");
				t_out.setText("");
			}
		});
		JButton b_fact = new JButton("n!");
		b_fact.setBounds(295, 155, 85, 25);
		b_fact.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_fact);
		b_fact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(t_out.getText());
				choice = 3;
				t_in.setText(num +"!");
				t_out.setText("");
			}
		});
		
		JButton b_log = new JButton("log n");
		b_log.setBounds(295, 120, 85, 25);
		b_log.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_log);
		b_log.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(t_out.getText());
				choice = 4;
				t_in.setText(num +" log");
				t_out.setText("");
			}
		});
		
		JButton b_antilog = new JButton("Antilog n");
		b_antilog.setBounds(295, 85, 85, 25);
		b_antilog.setFont(new Font("Times New Roman", Font.BOLD, 13));
		contentPane.add(b_antilog);
		b_antilog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(t_out.getText());
				choice = 4;
				t_in.setText(num +"antilog");
				t_out.setText("");
			}
		});
		
		JButton b_nCr = new JButton("nCr");
		b_nCr.setBounds(390, 85, 85, 25);
		b_nCr.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_nCr);
		b_nCr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(t_out.getText());
				choice = 5;
				t_in.setText(num +"C");
				t_out.setText("");
			}
		});
		
		JButton b_nPr = new JButton("nPr");
		b_nPr.setBounds(390, 120, 85, 25);
		b_nPr.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_nPr);
		b_nPr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(t_out.getText());
				choice = 6;
				t_in.setText(num +"P");
				t_out.setText("");
			}
		});
		
		JButton b_ex = new JButton("e^x");
		b_ex.setBounds(390, 155, 85, 25);
		b_ex.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_ex);
		b_ex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(t_out.getText());
				choice = 7;
				t_in.setText("e^"+num );
				t_out.setText("");
			}
		});
		
		JButton b_a_plus_b_whole_square = new JButton("(a+b)^2");
		b_a_plus_b_whole_square.setBounds(390, 190, 85, 25);
		b_a_plus_b_whole_square.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_a_plus_b_whole_square);
		b_a_plus_b_whole_square.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(t_out.getText());
				choice = 8;
				t_in.setText("("+num+" + ");
				t_out.setText("");
			}
		});
		
		JButton b_a_minus_b_whole_square = new JButton("(a-b)^2");
		b_a_minus_b_whole_square.setBounds(390, 225, 85, 25);
		b_a_minus_b_whole_square.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_a_minus_b_whole_square);
		b_a_minus_b_whole_square.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(t_out.getText());
				choice = 9;
				t_in.setText("("+num+" - ");
				t_out.setText("");
			}
		});
		
		JButton b_a_square_minus_b_square = new JButton("a^2-b^2");
		b_a_square_minus_b_square.setBounds(485, 85, 85, 25);
		b_a_square_minus_b_square.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_a_square_minus_b_square);
		b_a_square_minus_b_square.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(t_out.getText());
				choice = 10;
				t_in.setText("("+num+"^2 - ");
				t_out.setText("");
			}
		});
		
		JButton b_a_plus_b_whole_qube = new JButton("(a+b)^3");
		b_a_plus_b_whole_qube.setBounds(485, 120, 85, 25);
		b_a_plus_b_whole_qube.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_a_plus_b_whole_qube);
		b_a_plus_b_whole_qube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(t_out.getText());
				choice = 11;
				t_in.setText("("+num+" + ");
				t_out.setText("");
			}
		});
		
		JButton b_a_minus_b_whole_qube = new JButton("(a-b)^3");
		b_a_minus_b_whole_qube.setBounds(485, 155, 85, 25);
		b_a_minus_b_whole_qube.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_a_minus_b_whole_qube);
		b_a_minus_b_whole_qube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(t_out.getText());
				choice = 12;
				t_in.setText("("+num+" - ");
				t_out.setText("");
			}
		});
		
		JButton b_a_qube_plus_b_qube = new JButton("a^3+b^3");
		b_a_qube_plus_b_qube.setBounds(485, 190, 85, 25);
		b_a_qube_plus_b_qube.setFont(new Font("Times New Roman", Font.BOLD, 13));
		contentPane.add(b_a_qube_plus_b_qube);
		b_a_qube_plus_b_qube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(t_out.getText());
				choice = 13;
				t_in.setText("("+num+"^3 + ");
				t_out.setText("");
			}
		});
		
		JButton b_a_qube_minus_b_qube = new JButton("a^3-b^3");
		b_a_qube_minus_b_qube.setBounds(485, 225, 85, 25);
		b_a_qube_minus_b_qube.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_a_qube_minus_b_qube);
		b_a_qube_minus_b_qube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(t_out.getText());
				choice = 14;
				t_in.setText("("+num+"^3 - ");
				t_out.setText("");
			}
		});
		
		JButton b_ans = new JButton("Ans");
		b_ans.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b_ans.setBounds(200, 225, 85, 25);
		contentPane.add(b_ans);
		b_ans.addActionListener(new ActionListener() {

			private double fact(double num) {
				 if (num == 0) {
					 return 1;  
				 }  
				else {
					 return(num * fact(num-1)); 
				}
			}
			
			public void actionPerformed(ActionEvent e) {
				switch(choice) {
				case 1:
					result= Math.pow(num, Double.parseDouble(t_out.getText()));
					t_in.setText(num+"^"+Double.parseDouble(t_out.getText()));
					t_out.setText(Double.toString(result));
					break;
					
				case 2:
					result = Math.round(Math.pow(num, (1/Double.parseDouble(t_out.getText()))));
					t_in.setText(num+" root "+Double.parseDouble(t_out.getText()));
					t_out.setText(Double.toString(result));
					break;
					
				case 3:
					result = fact(num);    
					t_in.setText(num+"!");
					t_out.setText(Double.toString(result));
					break;
					
				case 4:
					result= Math.pow(num, Double.parseDouble(t_out.getText()));
					t_in.setText("antilog"+num+" at base "+Double.parseDouble(t_out.getText()));
					t_out.setText(Double.toString(result));
					break;
					
				case 5:
					result = (fact(num) / (fact(Double.parseDouble(t_out.getText()))*fact(num - Double.parseDouble(t_out.getText()))));
					t_in.setText(num+"C"+Double.parseDouble(t_out.getText()));
					t_out.setText(Double.toString(result));
					break;

				case 6:
					result = (fact(num) / fact(num - Double.parseDouble(t_out.getText())));
					t_in.setText(num+"P"+Double.parseDouble(t_out.getText()));
					t_out.setText(Double.toString(result));
					break;

				case 7:
					result =Math.exp(num);
					t_in.setText("e^"+num);
					t_out.setText(Double.toString(result));
					break;
				
				case 8:
					result =Math.pow(num+Double.parseDouble(t_out.getText()),2);
					t_in.setText("("+num+" + "+Double.parseDouble(t_out.getText())+")^2");
					t_out.setText(Double.toString(result));
					break;
					
				case 9:
					result =Math.pow(num-Double.parseDouble(t_out.getText()),2);
					t_in.setText("("+num+" - "+Double.parseDouble(t_out.getText())+")^2");
					t_out.setText(Double.toString(result));
					break;

				case 10:
					result =Math.pow(num,2)-Math.pow(Double.parseDouble(t_out.getText()),2);
					t_in.setText("("+num+"^2 - "+Double.parseDouble(t_out.getText())+"^2)");
					t_out.setText(Double.toString(result));
					break;

				case 11:
					result =Math.pow(num+Double.parseDouble(t_out.getText()),3);
					t_in.setText("("+num+" + "+Double.parseDouble(t_out.getText())+")^3");
					t_out.setText(Double.toString(result));
					break;

				case 12:
					result =Math.pow(num-Double.parseDouble(t_out.getText()),3);
					t_in.setText("("+num+" - "+Double.parseDouble(t_out.getText())+")^3");
					t_out.setText(Double.toString(result));
					break;

				case 13:
					result =Math.pow(num,3)+Math.pow(Double.parseDouble(t_out.getText()),3);
					t_in.setText("("+num+"^3 + "+Double.parseDouble(t_out.getText())+"^3)");
					t_out.setText(Double.toString(result));
					break;

				case 14:
					result =Math.pow(num,3)-Math.pow(Double.parseDouble(t_out.getText()),3);
					t_in.setText("("+num+"^3 - "+Double.parseDouble(t_out.getText())+"^3)");
					t_out.setText(Double.toString(result));
					break;
				}
			}
		});
	}
}
