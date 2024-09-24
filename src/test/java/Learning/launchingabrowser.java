package Learning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class launchingabrowser {

	public static void main(String[] args)
	{
	 WebDriver Driver = new ChromeDriver();
	 Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 Driver.get("https://blazedemo.com/");
	 Driver.manage().window().maximize();
	 
	 WebElement dropdown = Driver.findElement(By.xpath("//select[@name='fromPort']"));
	 Select list=new Select(dropdown);
	 list.selectByVisibleText("Portland");
	
	 
     
	}

}
