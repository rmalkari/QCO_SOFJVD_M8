package basic_programming;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsEnabled {

	public static void main(String[] args) throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("gagag");
		driver.findElement(By.name("pass")).sendKeys("gagai");
		//Thread.sleep(3000);
		WebElement btn =driver.findElement(By.xpath("//button[@name='login']"));
		if (btn.isEnabled()) {
			System.out.println("enter if");
			btn.click();
		}else {
			System.out.println("enter else");
		}

	}

}
