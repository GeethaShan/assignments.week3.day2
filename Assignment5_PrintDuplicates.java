package assignments.week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment5_PrintDuplicates {

	public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Set<Integer> integerSet = new LinkedHashSet<Integer>();
		Set<Integer> dupIntegerSet = new LinkedHashSet<Integer>();
		
		//Iterate through the array and add each element to integerSet
		for (Integer eachInt : arr) {
			boolean isAdded = integerSet.add(eachInt);
			//if element is already in integerSet, then add the duplicate to dupIntegerSet
			if (!isAdded) {
				dupIntegerSet.add(eachInt);
			}
		}
		//Print the duplicates
		System.out.println("Duplicates are : "+dupIntegerSet);
		//Print the values after removing duplicates
		System.out.println("Values after removing duplicates : "+integerSet);

	}

}
