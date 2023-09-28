package scrollbar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollBar_WithoutLocation {

	public static void main(String[] args) throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		WebElement career = driver.findElement(By.xpath("//a[text()='careers']"));
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		js.executeScript("argument[0].scrollIntoView();",career);
		Thread.sleep(3000);
		js.executeScript("argument[0].click()",career);
	}

}
