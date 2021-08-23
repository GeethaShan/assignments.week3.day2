package assignments.week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2_AjioList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//1.Launch the URL https://www.ajio.com/
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//2.In the search box, type as "bags" and press enter
		driver.findElement(By.name("searchVal")).sendKeys("bags");
		driver.findElement(By.name("searchVal")).sendKeys(Keys.ENTER);
		
		//3. To the left  of the screen under " Gender" click the "Men"
		//driver.findElement(By.id("Men")).click();
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		
		//4. Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		
		//5. Print the count of the items Found. 
		String itemsFound = driver.findElement(By.className("length")).getText();
		String itemsCount = itemsFound.replaceAll("\\D", "");
		System.out.println("Count of Men Fashion Bags found is : "+itemsCount);
		
		//6. Get the list of brand of the products displayed in the page and print the list.
		List<WebElement> brandNames = driver.findElements(By.className("brand"));
		System.out.println("Total Brand names count : "+brandNames.size());
		List<String> brandNamesList = new ArrayList<String>();
		for (WebElement eachBrandName : brandNames) {
			brandNamesList.add(eachBrandName.getText());
		}
		System.out.println("List of Brand names : "+brandNamesList);
		
		//7. Get the list of names of the bags and print it
		List<WebElement> bagNames = driver.findElements(By.className("name"));
		System.out.println("Total Bag names count : "+bagNames.size());
		List<String> bagNamesList = new ArrayList<String>();
		for (WebElement eachBagName : bagNames) {
			bagNamesList.add(eachBagName.getText());
		}
		System.out.println("List of Bag names : "+bagNamesList);
				

	}

}
