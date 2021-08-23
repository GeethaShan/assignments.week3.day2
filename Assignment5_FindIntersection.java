package assignments.week3.day2;

import java.util.ArrayList;
import java.util.List;

public class Assignment5_FindIntersection {

	public static void main(String[] args) {
		
		//Declare An array for {3,2,11,4,6,7};
		int[] arrayOne = {3,2,11,4,6,7};
		//Declare another array for {1,2,8,4,9,7};
		int[] arrayTwo = {1,2,8,4,9,7};
		
		//Declare 2 Integer Lists
		List<Integer> firstList = new ArrayList<Integer>();
		List<Integer> secondList = new ArrayList<Integer>();
		
		//Iterate over arrayOne and add the items to firstList
		for (Integer eachVal : arrayOne) {
			firstList.add(eachVal);
		}
		//Iterate over arrayTwo and add the items to secondList
		for (Integer eachVal : arrayTwo) {
			secondList.add(eachVal);
		}
		
		//Find the elements which are present in both the lists using retainall method
		firstList.retainAll(secondList);
		//Print the intersecting values
		System.out.println("Elements present in both the lists : "+firstList);

		
	}

}
