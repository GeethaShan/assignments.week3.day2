package assignments.week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Assignment5_SecondLargest {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7};
		//Declare 2 Integer Lists
		List<Integer> firstList = new ArrayList<Integer>();
		//Iterate over arrayOne and add the items to firstList
		for (Integer eachVal : data) {
			firstList.add(eachVal);
		}
		//print list values
		System.out.println("List values before sort are : "+firstList);
		//Sort the list
		Collections.sort(firstList);
		//print list values after sort
		System.out.println("List values after sort are : "+firstList);
		//Print second largest number in the list
		System.out.println("Second largest number is "+firstList.get(firstList.size()-2));

	}

}
