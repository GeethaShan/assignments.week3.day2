package assignments.week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Assignment5_MissingElementInAnArray {

	public static void main(String[] args) {
		
		// Here is the input
		int[] arrayOne = {0,1,2,3,4,7,6,8};
		List<Integer> listName = new ArrayList<Integer>();
		//Iterate over arrayOne and add the items to firstList
		for (Integer eachVal : arrayOne) {
			listName.add(eachVal);
		}
		//print list values
		System.out.println("List values before sort are : "+listName);
		//Sort the list
		Collections.sort(listName);
		//print list values after sort
		System.out.println("List values after sort are : "+listName);
		
		for (int i=0; i<listName.size(); i++) {
			// check if the iterator variable is not equal to the List values respectively
			if (listName.get(i) != i) {
				// print the number
				System.out.println("Missing Element in the List : "+i);
				// once printed break the iteration
				break;
			}
		}
	}

}
