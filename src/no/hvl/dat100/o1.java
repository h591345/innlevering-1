package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class o1 {

	public static void main(String[] args) {
		
		String bruttoinntekt = showInputDialog("bruttoinntekt?");
		double bruttoinn = Double.parseDouble(bruttoinntekt);
		
		if (bruttoinn>=18401 && bruttoinn<=260100)
		{
		double trinnskatt1 = (bruttoinn*0.017);
		showMessageDialog(null, "din sats er 1,7% og du betaler" + trinnskatt1);
		}
		
		else if (bruttoinn>=260101 && bruttoinn<=651250)
		{
		double trinnskatt2 = (bruttoinn*0.04);
		showMessageDialog(null, "din sats er 4.0% og du betaler" + trinnskatt2);
		}
		
		else if (bruttoinn>=651251 && bruttoinn<=1021550)
		{
		double trinnskatt3 = (bruttoinn*0.13);
		showMessageDialog(null, "din sats er 13.2% og du betaler" + trinnskatt3);
		}
		
		else if (bruttoinn>=1021551)
		{
		double trinnskatt4 = (bruttoinn*0.162);
		showMessageDialog(null, "din sats er 16.2% og du betaler" + trinnskatt4);
		}
		else
		{
			showMessageDialog(null, "du betaler ikke shit");
	
			
		}
		}
		
		
	}
