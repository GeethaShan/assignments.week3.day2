package assignments.week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Assignments4_RemoveDuplicates {

	public static void main(String[] args) {
		
		//Declare a String as PayPal India
		String strName = "PayPal India";
		System.out.println("Input string is : "+strName);

		//1.Convert it into a character array
		char[] charArrayName = strName.toCharArray();
		System.out.println("Character array is :");
		for (char c : charArrayName) {
			System.out.print(" "+c);
		}
		System.out.println();

		//2.Declare a Set as charSet for Character
		Set<Character> charSet = new LinkedHashSet<Character>();

		//3.Declare a Set as dupCharSet for duplicate Character
		Set<Character> dupCharSet = new LinkedHashSet<Character>();

		//4.Iterate character array and add it into charSet
		for (Character eachChar : charArrayName) {
			boolean isAdded = charSet.add(eachChar);
			//5.If the character is already in the charSet then, add it to the dupCharSet
			if (!isAdded) {
				dupCharSet.add(eachChar);
			}
		}
		System.out.println("charSet : "+charSet);
		System.out.println("dupCharSet : "+dupCharSet);
				
		System.out.print("charSet without empty space is :");
		//7.Iterate using charSet
		for (Character eachSetChar : charSet) {
			//8.Check the iterator variable isn't equals to an empty space
			if (eachSetChar != ' ') {
				//9.print it
				System.out.print(" "+eachSetChar);
			}
		}

	}

}
