package fina;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Iteration extends JFrame {
	private JLabel chk = new JLabel("Do you want to check again");
	private JButton okk = new JButton("OK");
	private JButton kancl = new JButton("CANCEL");
	
	public Iteration()
	{
		setLayout(new GridLayout(3, 1, 10, 10)); 
		add(chk); 
		add(okk);
		add(kancl);
		
		OKListenerClass listener1 = new OKListenerClass();

		okk.addActionListener(listener1); 
		kancl.addActionListener(listener1);
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 100);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public class OKListenerClass implements ActionListener{
		public void actionPerformed(ActionEvent e) 
		{
			if (e.getSource() == okk ) 
			{
				dispose();
				Frame1 askingPage = new Frame1();
			}
			else if (e.getSource() == kancl) 
			{
				dispose();
			} 
		}
	}
}
