import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Programming_Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField t_in;
	private JTextField t_out;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Programming_Calculator frame = new Programming_Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	int choice, num,temp,remainder,result=0,flag=0,count=0;
	public Programming_Calculator() {
		setResizable(false);
		setTitle("Programming Calculator");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Programming_Calculator.class.getResource("/Calculator/Programming_calculator.png")));
		setFont(new Font("Times New Roman", Font.BOLD, 14));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 304);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		t_in = new JTextField();
		t_in.setFont(new Font("Times New Roman", Font.BOLD, 14));
		t_in.setEditable(false);
		t_in.setHorizontalAlignment(SwingConstants.RIGHT);
		t_in.setBounds(10, 10, 728, 25);
		contentPane.add(t_in);
		t_in.setColumns(10);
		
		t_out = new JTextField();
		t_out.setFont(new Font("Times New Roman", Font.BOLD, 14));
		t_out.setEditable(false);
		t_out.setHorizontalAlignment(SwingConstants.RIGHT);
		t_out.setBounds(10, 40, 728, 25);
		contentPane.add(t_out);
		t_out.setColumns(10);
		
		
		JButton b_0 = new JButton("0");
		b_0.setBounds(565, 225, 85, 25);
		b_0.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_0);
		b_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_in.setText(t_in.getText()+"0");
				t_out.setText(t_out.getText()+"0");
			}
		});
		
		
		JButton b_1 = new JButton("1");
		b_1.setBounds(475, 190, 85, 25);
		b_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_1);
		b_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_in.setText(t_in.getText()+"1");
				t_out.setText(t_out.getText()+"1");
			}
		});
		
		JButton b_2 = new JButton("2");
		b_2.setBounds(565, 190, 85, 25);
		b_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_2);
		b_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_in.setText(t_in.getText()+"2");
				t_out.setText(t_out.getText()+"2");
			}
		});
		
		JButton b_3 = new JButton("3");
		b_3.setBounds(655, 190, 85, 25);
		b_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_3);
		b_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_in.setText(t_in.getText()+"3");
				t_out.setText(t_out.getText()+"3");
			}
		});
		
		JButton b_4 = new JButton("4");
		b_4.setBounds(475, 155, 85, 25);
		b_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_4);
		b_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_in.setText(t_in.getText()+"4");
				t_out.setText(t_out.getText()+"4");
			}
		});
		
		JButton b_5 = new JButton("5");
		b_5.setBounds(565, 155, 85, 25);
		b_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_5);
		b_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_in.setText(t_in.getText()+"5");
				t_out.setText(t_out.getText()+"5");
			}
		});
		
		JButton b_6 = new JButton("6");
		b_6.setBounds(655, 155, 85, 25);
		b_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_6);
		b_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_in.setText(t_in.getText()+"6");
				t_out.setText(t_out.getText()+"6");
			}
		});
		
		JButton b_7 = new JButton("7");
		b_7.setBounds(475, 120, 85, 25);
		b_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_7);
		b_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_in.setText(t_in.getText()+"7");
				t_out.setText(t_out.getText()+"7");
			}
		});
		
		JButton b_8 = new JButton("8");
		b_8.setBounds(565, 120, 85, 25);
		b_8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_8);
		b_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_in.setText(t_in.getText()+"8");
				t_out.setText(t_out.getText()+"8");
			}
		});
		
		JButton b_9 = new JButton("9");
		b_9.setBounds(655, 120, 85, 25);
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
		b_ac.setBounds(655, 85, 85, 25);
		contentPane.add(b_ac);
		b_ac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_in.setText("");
				t_out.setText("");
			}
		});
		
		JButton b_clear = new JButton("X");
		b_clear.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b_clear.setBounds(565, 85, 85, 25);
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
		b_back.setBounds(475, 85, 85, 25);
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
		b_decimal.setBounds(475, 225, 85, 25);
		b_decimal.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(b_decimal);
		b_decimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_in.setText(t_in.getText()+".");
				t_out.setText(t_out.getText()+".");
			}
		});
		
		JButton b_even_odd = new JButton("Even-Odd");
		b_even_odd.setFont(new Font("Times New Roman", Font.BOLD, 12));
		b_even_odd.setBounds(10, 85, 150, 25);
		contentPane.add(b_even_odd);
		b_even_odd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Integer.parseInt(t_out.getText());
				choice = 1;
				t_in.setText(Integer.toString(num));
				t_out.setText("");
			}
		});
		
		JButton b_negative_positive = new JButton("Negative-Positive");
		b_negative_positive.setFont(new Font("Times New Roman", Font.BOLD, 12));
		b_negative_positive.setBounds(10, 120, 150, 25);
		contentPane.add(b_negative_positive);
		b_negative_positive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Integer.parseInt(t_out.getText());
				choice = 2;
				t_in.setText(Integer.toString(num));
				t_out.setText("");
			}
		});
		
		JButton b_prime = new JButton("Prime");
		b_prime.setFont(new Font("Times New Roman", Font.BOLD, 12));
		b_prime.setBounds(10, 155, 150, 25);
		contentPane.add(b_prime);
		b_prime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Integer.parseInt(t_out.getText());
				choice = 3;
				t_in.setText(Integer.toString(num));
				t_out.setText("");
			}
		});
		
		JButton b_reverse = new JButton("Reverse of  No");
		b_reverse.setFont(new Font("Times New Roman", Font.BOLD, 12));
		b_reverse.setBounds(10, 190, 150, 25);
		contentPane.add(b_reverse);
		b_reverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Integer.parseInt(t_out.getText());
				choice = 4;
				t_in.setText(Integer.toString(num));
				t_out.setText("");
			}
		});
		
		JButton b_leap_year = new JButton("Leap Year");
		b_leap_year.setFont(new Font("Times New Roman", Font.BOLD, 12));
		b_leap_year.setBounds(10, 225, 150, 25);
		contentPane.add(b_leap_year);
		b_leap_year.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Integer.parseInt(t_out.getText());
				choice = 5;
				t_in.setText(Integer.toString(num));
				t_out.setText("");
			}
		});
		
		JButton b_palindrome = new JButton("Palindrome No");
		b_palindrome.setFont(new Font("Times New Roman", Font.BOLD, 12));
		b_palindrome.setBounds(165, 85, 150, 25);
		contentPane.add(b_palindrome);
		b_palindrome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Integer.parseInt(t_out.getText());
				choice = 6;
				t_in.setText(Integer.toString(num));
				t_out.setText("");
			}
		});
		
		JButton b_armstrong = new JButton("Armstrong No");
		b_armstrong.setFont(new Font("Times New Roman", Font.BOLD, 12));
		b_armstrong.setBounds(165, 120, 150, 25);
		contentPane.add(b_armstrong);
		b_armstrong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Integer.parseInt(t_out.getText());
				choice = 7;
				t_in.setText(Integer.toString(num));
				t_out.setText("");
			}
		});
		
		JButton b_automorphic = new JButton("Automorphic No");
		b_automorphic.setFont(new Font("Times New Roman", Font.BOLD, 12));
		b_automorphic.setBounds(165, 155, 150, 25);
		contentPane.add(b_automorphic);
		b_automorphic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Integer.parseInt(t_out.getText());
				choice = 8;
				t_in.setText(Integer.toString(num));
				t_out.setText("");
			}
		});
		
		JButton b_peterson = new JButton("Peterson No");
		b_peterson.setFont(new Font("Times New Roman", Font.BOLD, 12));
		b_peterson.setBounds(165, 190, 150, 25);
		contentPane.add(b_peterson);
		b_peterson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Integer.parseInt(t_out.getText());
				choice = 9;
				t_in.setText(Integer.toString(num));
				t_out.setText("");
			}
		});
		
		JButton b_sunny = new JButton("Sunny No");
		b_sunny.setFont(new Font("Times New Roman", Font.BOLD, 12));
		b_sunny.setBounds(165, 225, 150, 25);
		contentPane.add(b_sunny);
		b_sunny.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Integer.parseInt(t_out.getText());
				choice = 10;
				t_in.setText(Integer.toString(num));
				t_out.setText("");
			}
		});
		
		JButton b_tech = new JButton("Tech No");
		b_tech.setFont(new Font("Times New Roman", Font.BOLD, 12));
		b_tech.setBounds(320, 85, 150, 25);
		contentPane.add(b_tech);
		b_tech.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Integer.parseInt(t_out.getText());
				choice = 11;
				t_in.setText(Integer.toString(num));
				t_out.setText("");
			}
		});
		
		JButton b_fascinating = new JButton("Fascinating No");
		b_fascinating.setFont(new Font("Times New Roman", Font.BOLD, 12));
		b_fascinating.setBounds(320, 120, 150, 25);
		contentPane.add(b_fascinating);
		b_fascinating.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Integer.parseInt(t_out.getText());
				choice = 12;
				t_in.setText(Integer.toString(num));
				t_out.setText("");
			}
		});
		
		JButton b_keith = new JButton("Keith No");
		b_keith.setFont(new Font("Times New Roman", Font.BOLD, 12));
		b_keith.setBounds(320, 155, 150, 25);
		contentPane.add(b_keith);
		b_keith.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Integer.parseInt(t_out.getText());
				choice = 13;
				t_in.setText(Integer.toString(num));
				t_out.setText("");
			}
		});
		
		JButton b_neon = new JButton("Neon No");
		b_neon.setFont(new Font("Times New Roman", Font.BOLD, 12));
		b_neon.setBounds(320, 190, 150, 25);
		contentPane.add(b_neon);
		b_neon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Integer.parseInt(t_out.getText());
				choice = 14;
				t_in.setText(Integer.toString(num));
				t_out.setText("");
			}
		});
		
		JButton b_spy = new JButton("Spy No");
		b_spy.setFont(new Font("Times New Roman", Font.BOLD, 12));
		b_spy.setBounds(320, 225, 150, 25);
		contentPane.add(b_spy);
		b_spy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Integer.parseInt(t_out.getText());
				choice = 15;
				t_in.setText(Integer.toString(num));
				t_out.setText("");
			}
		});
	
		JButton b_ans = new JButton("Ans");
		b_ans.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b_ans.setBounds(655, 225, 85, 25);
		contentPane.add(b_ans);
		b_ans.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(choice) {
					case 1:
						if(num%2==0) {
							t_in.setText(Integer.toString(num));
							t_out.setText(num+" is an Even Number.");
						}
						else {
							t_in.setText(Integer.toString(num));
							t_out.setText(num+" is an Odd Number.");
						}
						break;
						
					case 2:
						if(num>0) {
							t_in.setText(Integer.toString(num));
							t_out.setText(num+" is a Positive Number.");
						}
						else if(num<0){
							t_in.setText(Integer.toString(num));
							t_out.setText(num+" is a Negative Number.");
						}
						else {
							t_in.setText(Integer.toString(num));
							t_out.setText(num+" is a Zero Number.");
						}
						break;
						
					case 3:
						temp=(int) (num/2);
						 if(num==0||num==1){  
							 t_in.setText(Integer.toString(num));
							   t_out.setText(num+" is not a Prime Number.");   
							  }
						 else{
							 for(int i=2; i<=temp; i++){      
								 if(num%i==0){
									 t_in.setText(Integer.toString(num));
									 t_out.setText(num+" is not a Prime Number.");;      
							    	flag=1;      
							     break;      
							    }      
							   }      
							   if(flag==0) { 
								   t_in.setText(Integer.toString(num));
								   t_out.setText(num+" is a Prime Number.");
									}  
							  }
						break;
						
					case 4: 
						temp = num;
						while(num != 0){  
						remainder = (int) (num % 10);  
						result = result * 10 + remainder;  
						num = num/10;  
						}  
						t_in.setText(Integer.toString(temp));
						t_out.setText("The reverse of the "+temp+" is: "+result); 
						break;
						
					case 5:
						 if (((num % 4 == 0) && (num % 100!= 0)) || (num%400 == 0)) {
							 t_in.setText(Integer.toString(num));
							 t_out.setText(num+" is a Leap Year.");
						 }
					      else{
					    	  t_in.setText(Integer.toString(num));
					    	  t_out.setText(num+" is not a Leap Year.");
							 }
						break;
						
					case 6: 
						  temp = num;
						  while(num>0){    
						   remainder=num%10;  
						   result=(result*10)+remainder;    
						   num=num/10;    
						  }    
						  if(temp==result) {
							  t_in.setText(Integer.toString(temp));
							  t_out.setText(temp+" is a Palindrome Number.");
						  }
						  else {
							  t_in.setText(Integer.toString(temp));
							  t_out.setText(temp+" is not a Palindrome Number.");
						  }
						break;
						
					case 7:
						int n;
				        temp = num;
				        n = String.valueOf(num).length();
				        while ( num != 0){
				            remainder =  num % 10;
				            result = (int) (result + (Math.pow(remainder, n)));
				            num =  num/10;
				        }
				        if(result ==  temp ) {
				        	 t_in.setText(Integer.toString( temp ));
				        	 t_out.setText( temp  + " is an Armstrong Number.");
				        }
				        else {
				        	 t_in.setText(Integer.toString( temp ));
				        	 t_out.setText( temp  + " is not an Armstrong Number.");
				        }
						break;
						
					case 8:
						int square = num*num;
					    temp = num;
						while(num>0)  {  
							count++;   
							num=num/10;  
						} 
						int lastDigit = (int) (square%(Math.pow(10, count)));  
						if(temp == lastDigit) {
				        	 t_in.setText(Integer.toString(temp));
				        	 t_out.setText(temp + " is an Automorphic Number.");
						}
						else  {
							t_in.setText(Integer.toString(temp));
				        	t_out.setText(temp + " is not an Automorphic Number.");
						}
						break;
						
					case 9:
						temp=num;
				        int fact=1;
				        while(num!=0){
				        	fact=1;
				             remainder=num%10;
				            for(int i=1; i<=remainder;i++)
				            {
				            	fact=fact*i;
				            }
				            result=result+fact;
				            num=num/10;
				        }
				        if(result==temp){
				        	 t_in.setText(Integer.toString(temp));
				        	 t_out.setText(temp + " is a Peterson Number.");
						}
				        else{
							t_in.setText(Integer.toString(temp));
				        	t_out.setText(temp + " is not a Peterson Number.");
						}
						break;
						
					case 10:
						    double sqrt = Math.sqrt(num + 1);
					        if (sqrt%1 == 0) {
					        	t_in.setText(Integer.toString(num));
					        	t_out.setText(num + " is a Sunny Number.");
					        } 
					        else {
					        	t_in.setText(Integer.toString(num));
					        	t_out.setText(num + " is not a Sunny Number.");
					        }
						break;
						
					case 11:
						int firstHalf, secondHalf, digits = 0;  
						temp = num;  
						while (num > 0){       
							digits++;   
							num = num / 10;  
						}  
						if (digits % 2 == 0)  {  
							num = temp;  
							firstHalf = num % (int) Math.pow(10, digits / 2);  
							secondHalf = num / (int) Math.pow(10, digits / 2);  
							result = (firstHalf + secondHalf) * (firstHalf + secondHalf);  
							if (temp ==result){  
								 t_in.setText(Integer.toString(temp));
					        	 t_out.setText(temp + " is a Tech Number.");
							}  
							else{   
								t_in.setText(Integer.toString(temp));
								t_out.setText(temp + " is not a Tech Number.");
							}  
						}  
						else{  
							t_in.setText(Integer.toString(temp));
							t_out.setText(temp + " is not a Tech Number.");
						}  
						break;
						
					case 12:
						int prod1 = num*2;
					    int prod2 = num*3;
					    String concatNum = prod1+""+prod2+num;
					    boolean found = true;
					    for(char c = '1'; c <= '9'; c++)  {  
					    	int co = 0;
					    	for(int i = 0; i < concatNum.length(); i++)  {  
					            char ch = concatNum.charAt(i);  
					            if(ch == c) {
						            co++;  
					            }
					         }
					         if(co > 1 || co == 0)  {  
					        	 found  = false;  
					            break;  
					         }
					      }  
					      if(found) {
					    	  t_in.setText(Integer.toString(num));
					    	  t_out.setText(num + " is a Fascinating Number.");
					      }
					      else {
					    	  t_in.setText(Integer.toString(num));
					    	  t_out.setText(num + " is not a Fascinating Number.");
					      }
						break;	
					
					case 13:
						 temp = num;
					     String s = Integer.toString(num);
					     int d=s.length();
					     int arr[]=new int[num];
					     for(int i=d-1; i>=0; i--)
					     {
					         arr[i]=num % 10;
					         num=num/10;  
					     }
					     int i=d;
					     while(result<temp)
					     {
					         result = 0;
					         for(int j=1; j<=d; j++)
					         {
					             result=result+arr[i-j];
					         }
					         arr[i]=result;
					         i++;
					     }
					    if(result==temp) {
					    	t_in.setText(Integer.toString(temp));
							t_out.setText(temp + " is a Keith Number.");
					    }
					     else {
					    	 t_in.setText(Integer.toString(temp));
					    	 t_out.setText(temp + " is not a Keith Number.");
					     }
						break;
						
					case 14:
						int sq = num * num;  
						while(sq != 0)  {      
							remainder = sq % 10;  
							result = result + remainder;  
							sq = sq / 10;  
						}  
						if(result == num) {
					    	  t_in.setText(Integer.toString(num));
					    	  t_out.setText(num + " is a Neon Number.");
					      }
						else  {
					    	  t_in.setText(Integer.toString(num));
					    	  t_out.setText(num + " is not a Neon Number.");
					      }
						break;
						
					case 15:
						temp = num;
						int product =1;
						while(num>0) {     
						remainder=num%10;  
						result=result+remainder;  
						product=product*remainder;  
						num=num/10;  
						}  
						if(result==product) {
							  t_in.setText(Integer.toString(temp));
					    	  t_out.setText(temp + " is a Spy Number.");
						}
						else  {
							  t_in.setText(Integer.toString(temp));
					    	  t_out.setText(temp+ " is not a Spy Number.");
						}
						break;
				
				}
			}
		});
		
	}
}
