package fina;

import javax.swing.JOptionPane;

public class NewContact{
	public void DeathRate(double oneC, double twoD, double threeN) 
	{
		try {
		double death = ((oneC / threeN) * twoD) * 0.5;
		Looping(death);
		}
		//return death;
		catch(ArithmeticException ex) 
		{
			JOptionPane.showMessageDialog(null, "Please enter the population value other than zero" );
			return;
		}
	}
	public void Looping(double lop) 
	{
		double mild = 0.002;
		for (int i =0; i < 7; i++) 
		{
			mild*= lop;
			System.out.println("month " + (i+1)+ " "+ mild);
			
		}
	}
}
