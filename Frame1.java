package fina;

import javax.swing.*;

import fina.IDandPasswords;
import fina.LoginPage;

//import java.awt.FlowLayout;
import java.awt.*;
import java.awt.event.*;

public class Frame1 extends JFrame {
	
	private JLabel plus = new JLabel("Fill in the necessary information");
	private JLabel nextt = new JLabel("Next click on the level of contact you are in");
	
	private JButton neew = new JButton("NEW CONTACT");
	private JButton mild = new JButton("MILD CONTACT");
	private JButton sever = new JButton("SEVER CONTACT");
	
	private JLabel conN = new JLabel("The population of the Country you are in");
	
	private JTextField con = new JTextField(12);
	
	private JLabel disN = new JLabel("the transmission probability of the Disease");
	private JTextField dis = new JTextField(12);
	private JLabel popuN = new JLabel("Number of Affected people so far");
	private JTextField popu = new JTextField(18);
	
	
	public Frame1() 
	{
		// Create a panel to hold buttons 
		//setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5)); 
		setLayout(new GridLayout(11, 2, 5, 5)); 
		add(plus); 
		add(conN);
		add(con);
		add(disN);
		add(dis);
		add(popuN);
		add(popu);
		add(nextt);
		add(neew);
		add(mild);
		add(sever);
		
		OKListenerClass listener1 = new OKListenerClass();
		//CancelListenerClass listener2 = new CancelListenerClass(); 
		neew.addActionListener(listener1); 
		mild.addActionListener(listener1);
		sever.addActionListener(listener1);
		con.addActionListener(listener1); 
		dis.addActionListener(listener1);
		popu.addActionListener(listener1);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLocationRelativeTo(null);
		setVisible(true);//jbtCancel.addActionListener(listener2);
	}

	//public Frame2 {}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IDandPasswords idandPasswords = new IDandPasswords();
				
		LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());
	}
	
	public class OKListenerClass implements ActionListener{
		public void actionPerformed(ActionEvent e) 
		{
			double hagere, beshete, sew;
				if (e.getSource() == neew ) 
				{
					try 
					{
						hagere = Double.valueOf(con.getText()).doubleValue();
						beshete = Double.valueOf(dis.getText()).doubleValue();
						sew = Double.valueOf(popu.getText()).doubleValue();
					}
					catch(NumberFormatException ex)
					{ 
						JOptionPane.showMessageDialog(null, "Please Enter Only Number" );
						return;
					}

						
					NewContact die = new NewContact();
					die.DeathRate(hagere, beshete, sew);
					dispose();
					Iteration wanTo = new Iteration();
					
				}
				else if (e.getSource() == mild ) 
				{
					try 
					{
						hagere = Double.valueOf(con.getText()).doubleValue();
						beshete = Double.valueOf(dis.getText()).doubleValue();
						sew = Double.valueOf(popu.getText()).doubleValue();
					}
					catch(NumberFormatException ex)
					{ 
						JOptionPane.showMessageDialog(null, "Please Enter Only Number" );
						return;
					}
					
					MildContact die = new MildContact();
					die.DeathRate(hagere, beshete, sew);
					dispose();
					Iteration wanTo = new Iteration();
				}
				else if (e.getSource() == sever ) 
				{
					try 
					{
						hagere = Double.valueOf(con.getText()).doubleValue();
						beshete = Double.valueOf(dis.getText()).doubleValue();
						sew = Double.valueOf(popu.getText()).doubleValue();
					}
					catch(NumberFormatException ex)
					{ 
						JOptionPane.showMessageDialog(null, "Please Enter Only Number" );
						return;
					}
					SeverContact die = new SeverContact();
					die.DeathRate(hagere, beshete, sew);
					dispose();
					Iteration wanTo = new Iteration();
				}
				
			}
	}

}


