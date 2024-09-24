package Learning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {
	
	static void selectfuturedate(WebDriver Driver, String month, String year, String date)
	{
	while(true)
	{
		String currentmonth = Driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String currentyear = Driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		if(month.equals(month) && year.equals(year))
		{
			break;
		}
		
		Driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	}
	 
	List<WebElement> AD=Driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td//a"));
	for(WebElement dates: AD)
	{
		if(dates.getText().equals(date))
		{
			dates.click();
			break;
		}
	}
	}
	public static void main(String[] args) 
	{
	
		WebDriver Driver = new ChromeDriver();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Driver.get("https://jqueryui.com/datepicker/");
		Driver.manage().window().maximize();
		
		// switch to iframe
		Driver.switchTo().frame(0);
		
		String month= "September";
		String year = "2025";
		String date = "14";

		Driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		selectfuturedate(Driver,month,year,date);	
		}
		}
