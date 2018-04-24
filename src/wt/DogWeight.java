// You must use this package
package wt;

// CSC 281
// Patrick Kunst
// I worked by myself

public class DogWeight extends Weight 
{
	
	private final int MAXP = 350;
	private final int MINP = 1;
	private final double MAXK = 158.757;
	private final double MINK = 0.453592;

	private static int numDogs = 0;
	
	public static int getNumDogs() 
	{
		return numDogs;
	}
	
	// The default constructor
	public DogWeight() 
	{
		super();
		numDogs ++;
	}
	
	// The parameterized constructor
	public DogWeight(double initW, char initS) 
	{
		
		if (initS == 'k' || initS == 'K')
		{
			scale = 'K';
			if (initW < MINK || initW > MAXK)
			{
				wValue = MINK;
			}
			else
			{
				wValue = initW;
			}
		}
		
		else
		{
			scale = 'P';
			if (initW < MINP || initW > MAXP)
			{
				wValue = MINP;
			}
			else
			{
				wValue = initW;
			}
		}
		
		numDogs++;
		
	}
	
	public String toString() 
	{
		if (scale == 'P' || scale == 'p')
		{
			return String.format("%.2f pounds", wValue);
		}
		else
		{
			return String.format("%.2f kilograms", wValue);
		}
	}
	
	public boolean equals(DogWeight other) 
	{
		return this.getP() == other.getP();
	}
}
