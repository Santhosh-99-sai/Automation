package Learning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) {
		 WebDriver Driver = new ChromeDriver();
		 Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 Driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		 Driver.manage().window().maximize();
		 
		 Driver.switchTo().frame("iframeResult");
		 
		WebElement box1 =  Driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement box2 =  Driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement btn = Driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		Actions act = new Actions(Driver);
		act.doubleClick(btn).perform();
		
	}

}
