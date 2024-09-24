import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Datepickerdemo {
	
	static void selectdate(WebDriver Driver, String Month, String Year, String Date)
	{
	
	 
		WebElement year= Driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		Select Reqyear = new Select(year);
		Reqyear.selectByVisibleText(Year);
		
		WebElement month = Driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		Select Reqmonth = new Select(month);
		Reqmonth.selectByVisibleText(Month);
		
		
		List<WebElement> dlist= Driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td"));
		
		System.out.println(dlist.size());
		
		for(WebElement dates: dlist)
		{
			if(dates.getText().equals(Date))
			{
				dates.click();
				break;
			}
			
		}}
		
		

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver Driver = new ChromeDriver();
		 Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 Driver.get("https://dummy-tickets.com/");
		 Driver.manage().window().maximize();
		 
		 Driver.findElement(By.xpath("//a[normalize-space()='Flight']")).click();
		 Driver.findElement(By.xpath("//div[@class='col-sm-12 p-0 suggestion-container']//input[@class='suggestion-input required mb-2']")).sendKeys("bangalore");
		 Thread.sleep(3000);
		 //to location
		List<WebElement> li= Driver.findElements(By.xpath("//ul[@class='suggestions-list']//li//div//p"));
		String s =Driver.findElement(By.xpath("//ul[@class='suggestions-list']//li//div//p")).getText();
		
		 for(int i=0;i<li.size();i++)
		 { 
			 if(li.get(i).getText().contains("Bangalore")) 
			 {
				 li.get(i).click();
			     break;
			 }
			 }
		 
		 // departure
		 Driver.findElement(By.xpath("//input[@name='destination[]']")).sendKeys("hyderabad");
		 Thread.sleep(3000);
		 
		 List<WebElement> dp=Driver.findElements(By.xpath("//ul[@class='suggestions-list']//li//div//p"));
		 String v =Driver.findElement(By.xpath("//ul[@class='suggestions-list']//li//div//p")).getText();
		 for(int i=0;i<dp.size();i++)
		 { 
			 if(dp.get(i).getText().contains("Hyderabad"))
			 {
				 dp.get(i).click();
			     break;
			 }
			 }
		 
		// picking date
				 String Year ="2025";
				 String Month="Aug";
				 String Date="18";
	     Driver.findElement(By.xpath("//input[@name='departure[]']")).click();	 
		 selectdate(Driver,Year,Month,Date);
		 
		 
		 Driver.findElement(By.xpath("//input[@id='flight_oneway_btn']")).click();
		 
		 }}
