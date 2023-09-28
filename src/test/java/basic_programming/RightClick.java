package basic_programming;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static void main(String[] args) {
		
			WebDriverManager.edgedriver().setup();
			WebDriver driver =new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.amazon.com/");
			
			 WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
			 Actions a = new  Actions(driver);
			 a.contextClick(ele).perform();

	}

	
}
