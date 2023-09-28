package basic_programming;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getter_GetSize {

	public static void main(String[] args) 
{
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		//WebDriverWait wait =new WebDriverWait(driver,10);
		
		WebElement ele =driver.findElement(By.id("email"));
		Dimension dimensions =ele.getSize();
		int h = dimensions.getHeight();
		int w = dimensions.getWidth();
		System.out.println(h);
		System.out.println(w);

	}
	
}
