import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Trigonometric_Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField t_in;
	private JTextField t_out;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Trigonometric_Calculator frame = new Trigonometric_Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	int choice ;
	double num ,result;
	public Trigonometric_Calculator() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Trigonometric_Calculator.class.getResource("/Calculator/Trigonometric_Calculator.png")));
		setTitle("Trigonometric Calculator");
		setFont(new Font("Times New Roman", Font.BOLD, 14));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 682, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		t_in = new JTextField();
		t_in.setFont(new Font("Times New Roman", Font.BOLD, 14));
		t_in.setEditable(false);
		t_in.setHorizontalAlignment(SwingConstants.RIGHT);
		t_in.setBounds(10, 10, 648, 25);
		contentPane.add(t_in);
		t_in.setColumns(10);
		
		t_out = new JTextField();
		t_out.setFont(new Font("Times New Roman", Font.BOLD, 14));
		t_out.setEditable(false);
		t_out.setHorizontalAlignment(SwingConstants.RIGHT);
		t_out.setBounds(10, 40, 648, 25);
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
		
		JButton b_sin = new JButton("sin x");
		b_sin.setBounds(295, 85, 85, 25);
		b_sin.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_sin);
		b_sin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(t_out.getText());
				choice = 1;
				t_in.setText("sin "+num );
				t_out.setText("");
			}
		});
		
		JButton b_cos = new JButton("cos x");
		b_cos.setBounds(295, 120, 85, 25);
		b_cos.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_cos);
		b_cos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(t_out.getText());
				choice = 2;
				t_in.setText("cos "+num );
				t_out.setText("");
			}
		});

		JButton b_tan = new JButton("tan x");
		b_tan.setBounds(295, 155, 85, 25);
		b_tan.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_tan);
		b_tan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(t_out.getText());
				choice = 3;
				t_in.setText("tan "+num );
				t_out.setText("");
			}
		});
		
		JButton b_cot = new JButton("cot x");
		b_cot.setBounds(295, 190, 85, 25);
		b_cot.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_cot);
		b_cot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(t_out.getText());
				choice = 4;
				t_in.setText("cot "+num );
				t_out.setText("");
			}
		});
		
		JButton b_sec = new JButton("sec x");
		b_sec.setBounds(295, 225, 85, 25);
		b_sec.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_sec);
		b_sec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(t_out.getText());
				choice = 5;
				t_in.setText("sec "+num );
				t_out.setText("");
			}
		});
		
		JButton b_cosec = new JButton("cosec x");
		b_cosec.setBounds(390, 85, 85, 25);
		b_cosec.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_cosec);
		b_cosec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(t_out.getText());
				choice = 6;
				t_in.setText("cosec "+num );
				t_out.setText("");
			}
		});

		JButton b_1bysinx = new JButton("1/sin x");
		b_1bysinx.setBounds(390, 120, 85, 25);
		b_1bysinx.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_1bysinx);
		b_1bysinx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(t_out.getText());
				choice = 7;
				t_in.setText("1/sin "+num );
				t_out.setText("");
			}
		});
		
		JButton b_1bycosx = new JButton("1/cos x");
		b_1bycosx.setBounds(390, 155, 85, 25);
		b_1bycosx.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_1bycosx);
		b_1bycosx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(t_out.getText());
				choice = 8;
				t_in.setText("1/cos "+num );
				t_out.setText("");
			}
		});
		
		JButton b_1bytanx = new JButton("1/tan x");
		b_1bytanx.setBounds(390, 190, 85, 25);
		b_1bytanx.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_1bytanx);
		b_1bytanx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(t_out.getText());
				choice = 9;
				t_in.setText("1/tan "+num );
				t_out.setText("");
			}
		});
		
		JButton b_1bycotx = new JButton("1/cot x");
		b_1bycotx.setBounds(390, 225, 85, 25);
		b_1bycotx.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_1bycotx);
		b_1bycotx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(t_out.getText());
				choice = 10;
				t_in.setText("1/cot "+num );
				t_out.setText("");
			}
		});
		
		JButton b_1bysecx = new JButton("1/sec x");
		b_1bysecx.setBounds(485, 85, 175, 25);
		b_1bysecx.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_1bysecx);
		b_1bysecx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(t_out.getText());
				choice = 11;
				t_in.setText("1/sec "+num );
				t_out.setText("");
			}
		});
		
		JButton b_1bycosecx = new JButton("1/cosec x");
		b_1bycosecx.setBounds(485, 120, 175, 25);
		b_1bycosecx.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_1bycosecx);
		b_1bycosecx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(t_out.getText());
				choice = 12;
				t_in.setText("1/cosec "+num );
				t_out.setText("");
			}
		});
		
		JButton b_sin_cos = new JButton("(sin^2 x) + (cos^2 x)");
		b_sin_cos.setBounds(485, 155, 175, 25);
		b_sin_cos.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_sin_cos);
		b_sin_cos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				choice = 13;
				t_in.setText("(sin^2 x) + (cos^2 x)");
				t_out.setText("1");
			}
		});
		
		JButton b_sec_tan = new JButton("(sec^2 x) - (tan^2 x)");
		b_sec_tan.setBounds(485, 190, 175, 25);
		b_sec_tan.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_sec_tan);
		b_sec_tan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				choice = 14;
				t_in.setText("(sec^2 x) - (tan^2 x)");
				t_out.setText("1");
			}
		});
		
		JButton b_cosec_cot = new JButton("(cosec^2 x) - (cot^2 x)");
		b_cosec_cot.setBounds(485, 225, 175, 25);
		b_cosec_cot.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_cosec_cot);
		b_cosec_cot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				choice = 15;
				t_in.setText("(cosec^2 x) - (cot^2 x)");
				t_out.setText("1");
			}
		});
		
		JButton b_ans = new JButton("Ans");
		b_ans.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b_ans.setBounds(200, 225, 85, 25);
		contentPane.add(b_ans);
		b_ans.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(choice) {

				case 1:
					result =Math.toRadians(num);
					t_in.setText("sin "+num);
					t_out.setText(Double.toString(Math.sin(result)));
					break;

				case 2:
					result =Math.toRadians(num);
					t_in.setText("cos "+num);
					t_out.setText(Double.toString(Math.cos(result)));
					break;

				case 3:
					result =Math.toRadians(num);
					t_in.setText("tan "+num);
					t_out.setText(Double.toString(Math.tan(result)));
					break;

				case 4:
					result =Math.toRadians(num);
					t_in.setText("cot "+num);
					t_out.setText(Double.toString(1/Math.tan(result)));
					break;

				case 5:
					result =Math.toRadians(num);
					t_in.setText("sec "+num);
					t_out.setText(Double.toString(1/Math.sin(result)));
					break;

				case 6:
					result =Math.toRadians(num);
					t_in.setText("cosec "+num);
					t_out.setText(Double.toString(1/Math.cos(result)));
					break;

				case 7:
					result =num;
					t_in.setText("1/sin "+num);
					t_out.setText(Double.toString(Math.asin(result)));
					break;

				case 8:
					result =num;
					t_in.setText("1/cos "+num);
					t_out.setText(Double.toString(Math.acos(result)));
					break;

				case 9:
					result =num;
					t_in.setText("1/tan "+num);
					t_out.setText(Double.toString(Math.atan(result)));
					break;

				case 10:
					result =num;
					t_in.setText("1/cot "+num);
					t_out.setText(Double.toString(1/Math.atan(result)));
					break;

				case 11:
					result =num;
					t_in.setText("1/sec "+num);
					t_out.setText(Double.toString(1/Math.acos(result)));
					break;

				case 12:
					result =num;
					t_in.setText("1/cosec "+num);
					t_out.setText(Double.toString(1/Math.asin(result)));
					break;
				
				case 13:
					t_in.setText("(sin^2 x) + (cos^2 x)");
					t_out.setText("1");
					break;
					
				case 14:
					t_in.setText("(sec^2 x) - (tan^2 x)");
					t_out.setText("1");
					break;
					
				case 15:
					t_in.setText("(cosec^2 x) - (cot^2 x)");
					t_out.setText("1");
					break;
					
				}
			}
		});
		
	}
}
