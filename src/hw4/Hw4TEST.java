package hw4;

// Author: Amber Settle
// CSC 281

import java.util.Scanner;

public class Hw4TEST {

	public static void main(String[] args) 
	{
		Weight mine = new Weight();
		mine.set();
		
		Weight firstW = new Weight();
		Weight secondW = new Weight(-3.0, 'p');
		Weight thirdW = new Weight(3, '%');
		System.out.println(firstW.getP() + " pounds is " +
				firstW.getK() + " kilos.");
		System.out.println(secondW.getP() + " pounds is " +
				secondW.getK() + " kilos.");
		System.out.println(thirdW.getP() + " pounds is " +
				thirdW.getK() + " kilos.");
		System.out.println();
		
		String rText;
		char reply;
		boolean done = false;
		Scanner wScan = new Scanner(System.in);
		
		while (!done) 
		{

			System.out.println("Entering first temp ...");
			firstW.set();
			System.out.println("Entering second temp ...");
			secondW.set();

			System.out.println(firstW.getP() + " pounds is " +
								firstW.getK() + " kilos.");
			System.out.println(secondW.getP() + " pounds is " +
								secondW.getK() + " kilos.");

			System.out.print("Do you wish to continue (y/n)? ");
			rText = wScan.next();
			reply = rText.charAt(0);

			System.out.println();
			
			if (reply == 'n' || reply == 'N')
				done = true;

	    }

		System.out.println("Goodbye!");
		wScan.close();
		
	}
}
