package Learning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollingpage {

	public static void main(String[] args)
	{

		WebDriver Driver = new ChromeDriver();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Driver.get("https://testautomationpractice.blogspot.com/");
		Driver.manage().window().maximize();
		
		WebElement target=Driver.findElement(By.xpath("(//input[@id='datepicker'])[1]"));
		
		
		JavascriptExecutor js = (JavascriptExecutor)Driver;
		
		js.executeScript("arguments[0].scrollIntoView();", target);
		


	}

}
