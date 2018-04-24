package week9;

import java.util.Arrays;
import people.AdultStudent;

//Patrick Kunst
//Worked by myself

public class AdultStudentDriver 
{

	public static void main(String[] args) 
	{
		final int MAX = 3;
		
		AdultStudent[] students = new AdultStudent[MAX];
		
		students[0] = new AdultStudent("Patrick", 1999, "Computer Science");
		students[1] = new AdultStudent("Gregg", 1995, "International Couch Studies");
		students[2] = new AdultStudent("Anna", 1997, "Space Jam History");
		
		System.out.println("The AdultStudent array: " + Arrays.toString(students));
		
		Arrays.sort(students);
		System.out.println("The sorted AdultStudent Array (using comparison) " + Arrays.toString(students));
		
		Arrays.sort(students, (AdultStudent stu1, AdultStudent stu2) -> stu1.getMajor().compareTo(stu2.getMajor()));
		System.out.println("The sorted AdultStudent Array (using lambda) " + Arrays.toString(students));

	}

}
