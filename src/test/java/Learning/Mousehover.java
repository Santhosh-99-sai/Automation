package Learning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args)
	{
		 WebDriver Driver = new ChromeDriver();
		 Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 Driver.get("https://demo.opencart.com/");
		 Driver.manage().window().maximize();
		 
		 WebElement Desktop =Driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		 WebElement Mac = Driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		 
		 Actions hover = new Actions(Driver);
		 hover.moveToElement(Desktop).moveToElement(Mac).click().build().perform();

	}

}
