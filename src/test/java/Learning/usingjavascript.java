package Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingjavascript {

	public static void main(String[] args) {
		
		
		

			WebDriver driver=new ChromeDriver();
			//ChromeDriver driver=new ChromeDriver();

			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();

			WebElement inputbox=driver.findElement(By.xpath("//input[@id='name']"));

			JavascriptExecutor js=(JavascriptExecutor)driver; 
			js.executeScript("arguments[0].setAttribute('value','John')",inputbox);

	}

}
