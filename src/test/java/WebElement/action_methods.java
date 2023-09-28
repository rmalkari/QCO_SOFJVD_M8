package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class action_methods {

	public static void main(String[] args) throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("gagag");
		driver.findElement(By.name("pass")).sendKeys("gagai");
		//WebDriverWait wait =new WebDriverWait(driver,10);
		
		WebElement ele =driver.findElement(By.id("email"));
		ele.sendKeys("agag");
		Thread.sleep(3000);
		
		//address 
		driver.findElement(By.xpath("//a[text"));
		Point CoOrdinate =ele.getLocation();
		int x =CoOrdinate.getX();
		int y =CoOrdinate.getY();
		System.out.println(x);
		System.out.println(y);
		ele.clear();
	}

}
