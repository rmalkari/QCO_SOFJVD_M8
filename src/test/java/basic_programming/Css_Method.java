package basic_programming;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Css_Method {

	public static void main(String[] args) {
		

			
				WebDriverManager.edgedriver().setup();
				WebDriver driver =new EdgeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com/");
				//driver.findElement(By.id("email")).sendKeys("malkari.ramesh@gmail.com");
				//driver.findElement(By.name("pass")).sendKeys("Malram@123$");
				
				driver.findElement(By.cssSelector("input[id='email']")).sendKeys("malkari.ramesh@gmail.com");
				driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("Malram@123$");
				driver.findElement(By.name("login")).click();
	}

}
