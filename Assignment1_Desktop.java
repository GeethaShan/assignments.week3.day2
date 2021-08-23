package assignments.week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment1_Desktop implements Assignment1_Hardware, Assignment1_Software {
	/**
	 * This method prints the model name
	 * @param modelName
	 */
	public void desktopModel(String modelName) {
		System.out.println("Desktop model is : "+modelName);

	}

	public String[] softwareResources() {
		String swResources[] = {"Java", "Eclipse", "Python", "Maven", "Ruto"};
		return swResources;
	}

	public String hardwareResources(int hwNum) {
		System.out.println("Hardware resource code is : "+hwNum);
		String hwName="";
		if (hwNum == 1) {
			hwName = "Lenovo";
		} else if (hwNum ==2 ) {
			hwName = "Macbook";
		} else 
			hwName = "Dell";
			
		return hwName;
	}

	
	public static void main(String[] args) {
		//Creating object for Desktop Class
		Assignment1_Desktop objDesktop = new Assignment1_Desktop();
		String hwResourceName = objDesktop.hardwareResources(2);
		String[] swResourcesName = objDesktop.softwareResources();
		List<String> swResourceList = new ArrayList<String>(Arrays.asList(swResourcesName));
		System.out.println("Software resources required are : "+swResourceList);
		objDesktop.desktopModel(hwResourceName);
		
	}
}
