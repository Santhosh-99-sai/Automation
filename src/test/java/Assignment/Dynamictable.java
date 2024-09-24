package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamictable {

	public static void main(String[] args) throws InterruptedException 
	{
	
	 WebDriver Driver = new ChromeDriver();
	 Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 Driver.get("https://testautomationpractice.blogspot.com/");
	 Driver.manage().window().maximize();
	 
	  // String list =Driver.findElement(By.xpath("(//ul[@id='pagination'])//li")).getText();
	 
	 int list = Driver.findElements(By.xpath("//ul[@id='pagination']//li")).size();
	 
	 
	// System.out.println(row);
	// System.out.println(col);
	 
	 // clicking on numbers
	   for(int l=1;l<=list;l++)
	   {
		  {
			  WebElement  Li =Driver.findElement(By.xpath("//ul[@id='pagination']//li["+l+"]"));
			   Li.click();
			   Thread.sleep(5000); 
		  }
		  int row = Driver.findElements(By.xpath("//table[@id='productTable']//tr")).size();
		  {
			  for(int r=1;r<=row-1;r++)
			  {
				  int col = Driver.findElements(By.xpath("//table[@id='productTable']//tr["+r+"]//td")).size();
				  for(int c=1;c<=col;c++)
				  {
				  String S =  Driver.findElement(By.xpath("//table[@id='productTable']//tr["+r+"]//td["+c+"]")).getText();
					System.out.println(S); 
					if(c==col)
					{
						Driver.findElement(By.xpath("//table[@id='productTable']//tr["+r+"]//td["+c+"]//input[@type='checkbox']")).click();
					}
				  }
				  
			  }
		  }		  
	   }}}

 


