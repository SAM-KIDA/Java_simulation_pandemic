package fina;

import javax.swing.JOptionPane;

public class SeverContact extends NewContact{
	public void DeathRate(double oneC, double twoD, double threeN) 
	{
		try {
			double death = ((oneC / threeN) * twoD) * 2.0;
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
