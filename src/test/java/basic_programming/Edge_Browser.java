package basic_programming;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.edge.EdgeDriver; 
import io.github.bonigarcia.wdm.WebDriverManager;

public class Edge_Browser {

	public static void main(String[] args) throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().to("www.amazon.in");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
	
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//for closing 
		driver.close();
		//driver.quit();
	
	}

}
