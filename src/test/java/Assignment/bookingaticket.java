package Assignment;

import java.sql.Array;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class bookingaticket {

	public static void main(String[] args) throws InterruptedException
	{
		 WebDriver Driver = new ChromeDriver();
		 Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 Driver.get("https://blazedemo.com/");
		 Driver.manage().window().maximize();
		 // selecting dropdown and clicking on find
		 WebElement dropdown = Driver.findElement(By.xpath("//select[@name='fromPort']"));
		 Select list=new Select(dropdown);
		 list.selectByVisibleText("Portland");
		
		 WebElement dropdown2 = Driver.findElement(By.xpath("//select[@name='toPort']"));
		 Select list1=new Select(dropdown2);
		 list1.selectByVisibleText("New York");
		 
		 Thread.sleep(3000);
		 Driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		 
		 // sorting price
		 int row = Driver.findElements(By.xpath("//table[@class='table']//th")).size();
		 int col = Driver.findElements(By.xpath("//table[@class='table']//tr")).size();
		 
		 for (int r=1;r<=row;r++)
		 {
			 String Price = Driver.findElement(By.xpath("//table[@class='table']//tr["+r+"]//td[6]")).getText();
			
			String Pricelist = Price.replace("$", "");	
			 double dec=new Double(Pricelist);
			 
			 double myArray[] = {dec};
			 //System.out.println(dec);
			 
			  for(double num: myArray)
			  {
				  System.out.println(num);
			  }
			 Arrays.sort(myArray);
			 
			 for(double num: myArray)
			 {
				 System.out.println(num);
			 }
				
		 }
		 }}
