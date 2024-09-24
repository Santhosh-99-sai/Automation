package Learning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sliderusingmouse {

	public static void main(String[] args) 
	{
		
		WebDriver Driver = new ChromeDriver();
		 Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 Driver.get("http://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		 Driver.manage().window().maximize();
		 
		 WebElement minslider=Driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
		System.out.println(minslider.getLocation());
		 
		 Actions btn = new Actions(Driver);
		 
		 btn.dragAndDropBy(minslider, 150, 250).perform();
	}

}
