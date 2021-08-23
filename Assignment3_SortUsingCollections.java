package assignments.week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Assignment3_SortUsingCollections {

	public static void main(String[] args) {
		

		//1.Declare a String array and add the Strings values as (Aspire Systems,CTS,Wipro,HCL)		
		String[] arrString = {"Aspire Systems","CTS","Wipro","HCL"};
		System.out.print("Input array is : ");
		for (String eachArrayEle : arrString) {
			System.out.print(","+eachArrayEle);
		}
		System.out.println();

		//2.Get the length of the array		
		System.out.println("Array length is : "+arrString.length);
		
		//3. sort the array	
		List<String> convList = new ArrayList<String>(Arrays.asList(arrString));
		System.out.println("Converted List is : "+convList);
		Collections.sort(convList);
		System.out.println("Sorted Array list is : "+convList);
		
		//4. Iterate it in the reverse order
		Collections.reverse(convList);
				
		//5. print the array
		//6. Required Output: Wipro, HCL , CTS, Aspire Systems
		System.out.println("Reversed Array list is : "+convList);
		
}

}
