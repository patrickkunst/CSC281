package hw4;

// Author: Amber Settle
// CSC 281
// Patrick Kunst
// Worked by myself

import java.util.Scanner;

public class Weight
{
	// Please do not declare any additional members of the class
	// Feel free to use local variables as necessary in each method
	private double wValue;
	// If you like, you can change the type of scale to Character
	private char scale;
	
	private final double FACTOR = 2.2046;
	
	private Scanner vScan = new Scanner(System.in);

 	// The default constructor for the class
 	public Weight()
 	{
     	wValue = 0;
     	scale = 'P';
 	}

 	// The parameterized constructor for the class
	public Weight(double initW, char initS)
	{
		if (initW > 0) wValue = initW;
		else wValue = 0;
		
		if (initS == 'k' || initS == 'K')
		{
			scale = 'K';
		}
		else
		{
			scale = 'P';
			/*I'm not checking to see if it's P because either the user put in P or they put in something thats not P or K
			 *Either way its supposed to make the scale P so it doesn't make sense to check
			 */
		}
	}

 	// Input values for the instance variables using the Scanner vScan
 	public void set()
 	{
 		String setScale = new String("DEFAULT");
 		double setW = -1;
 		System.out.println("Entering the set method.");
 		System.out.println("Please enter the weight scale (P/K)");
 		while (true) 
 		{
 			setScale = vScan.next();
 			if (setScale.equalsIgnoreCase("K") || setScale.equalsIgnoreCase("P")) break;
 			
 			System.out.println("Pounds and kilos are the only valid scales");
 		}
 		//System.out.println("Out of the loop");
 		if (setScale.equalsIgnoreCase("k")) scale = 'K';
 		if (setScale.equalsIgnoreCase("p")) scale = 'P';
 		
 		System.out.println("Please enter a weight measurement");
 		while (setW < 0)
 		{
 			setW = vScan.nextInt();
 			if (setW < 0) System.out.println("The weight measurement cannot be negative");
 		}
 		wValue = setW;
 		
     	System.out.println("Leaving the set method.");
 	}

 	// Return the weight in pounds
	public double getP()
	{
		if (scale == 'P') return wValue;
		return (wValue * FACTOR);
	}

	// Return the weight in kilos
	public double getK()
	{
		if (scale == 'K') return wValue;
		return (wValue / FACTOR);
	}

}

