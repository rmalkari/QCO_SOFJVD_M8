package basic_programming;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelect_Dropdown {

	
	public static void main(String[] args) throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		WebElement dd = driver.findElement(By.id("cars"));
		Select s=new Select(dd);
		s.selectByIndex(0);
		Thread.sleep(3000);
		s.selectByValue("199");
		Thread.sleep(3000);
		s.deselectByIndex(0);
		Thread.sleep(3000);
		s.deselectByValue("199");
		Thread.sleep(3000);
		System.out.println(s.isMultiple());
		List<WebElement> allOptions = s.getAllSelectedOptions();
		for (WebElement b:allOptions) {
			System.out.println(b.getText());
		}
		}
	}


