package assignments.week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment5_RemoveDuplicates {

	public static void main(String[] args) {
		
		// a) Use the declared String text as input
		String inputText = "We learn java basics as part of java sessions in java week1";
		System.out.println("Input string : "+inputText);
		String[] splitArray = inputText.split(" ");
				
		// b) Declare a LinkedHashSet for String
		Set<String> stringSetName = new LinkedHashSet<String>();
		
		// c) Iterate over String array and add each string to the Set
		for (String eachString : splitArray) {
			stringSetName.add(eachString);
		}
		System.out.println("Set Value : "+stringSetName);
		
		// d) Add values from LinkedHashSet to output string
		String outputString = "";
		for (String eachString : stringSetName) {
			outputString = outputString + " " + eachString;
		}
		
		// e) Display the String without duplicate words
		System.out.println("Output string without duplicates is : "+outputString);
		
	}

}
