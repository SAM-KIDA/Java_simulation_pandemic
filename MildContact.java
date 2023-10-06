package fina;

import javax.swing.JOptionPane;

public class MildContact extends NewContact{
		
	public void DeathRate(double oneC, double twoD, double threeN) 
	{
		try {
		double death = ((oneC / threeN) * twoD) * 0.9;
		Looping(death);
		}
		//return death;
		catch(ArithmeticException ex) 
		{
			JOptionPane.showMessageDialog(null, "Please enter the population value other than zero" );
			return;
		}
	}
}