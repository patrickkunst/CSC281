// To use or not as you wish
package hw8;

// Patrick Kunst
// Worked by myself

import java.util.ArrayList;

public class NumArrayList<T extends Number>
{

	private ArrayList<T> L;

	public NumArrayList() 
	{
		L = new ArrayList<>();
	}
	
	// Create a new NumArrayList, initializing it with the parameter
	public NumArrayList(T[] initValues) 
	{	
		L = new ArrayList<>();
		
		for (int i=0; i < initValues.length; i++)
		{
			L.add(initValues[i]);
		}
	}
	
	public void add(T elem) 
	{
		L.add(elem);
	}
	
	
	public T get(int index) 
	{
		return L.get(index);
	}

	// Return the String representation of the NumArrayList
	public String toString() 
	{
		String s = new String();
		
		for (int i=0; i<L.size(); i++)
		{
			s += String.format("%s \n", L.get(i));
		}

		return s;
	}

	
	// Multiply the NumArrayList by an Integer value
	public NumArrayList<Integer> iMult(Integer val) 
	{
		// replace this with the correct implementation
		NumArrayList<Integer> iItem = new NumArrayList<Integer>();
		// Put your code to fill the NumArrayList iItem here
		for (int i=0; i<L.size(); i++)
		{
			iItem.add((int)L.get(i)*val);
		}
		return iItem;
	}
}


