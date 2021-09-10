package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class o2 
{	

		public static void main(String[] args) 
   {
	
		for (int i = 1; i<=10; i++) 
		 {
			String poengscr = showInputDialog("poeng?");
			int poeng = parseInt(poengscr);
		
			if (poeng<=100 && poeng >0)
			
			{
				
				if (poeng>=90 && poeng<=100)
				{
					showMessageDialog(null,"du fikk"+" "+ poeng + " "+"poeng" + "du får karakter A" );
				}
		
				else if (poeng>=80 && poeng<=89)
				{
					showMessageDialog(null,"du fikk"+" "+ poeng + " "+"poeng" + "du får karakter B" );
				}
				else if (poeng>=60 && poeng<=79)
				{	
					showMessageDialog(null,"du fikk"+" "+ poeng + " "+"poeng" + "du får karakter C" );
				}
		 
				else if (poeng>=50 && poeng<=59)
				{
			
					showMessageDialog(null,"du fikk"+" "+ poeng + " "+"poeng" + "du får karakter D" );
				}
		
				else if (poeng>=40 && poeng<=49)
				{
			
					showMessageDialog(null,"du fikk"+" "+ poeng + " "+"poeng" + "du får karakter E" );
				}
		
				else if (poeng>=0 && poeng<=39)
				{
					showMessageDialog(null,"du fikk"+" "+ poeng + " "+"poeng" + "du får karakter F" );
				}	
			}
			else
			{
			 System.out.println( "ikke gyldig poengsum");
			 i--;
		    }
		 }
   	}
}
