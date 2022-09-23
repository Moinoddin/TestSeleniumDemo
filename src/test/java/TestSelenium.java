import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSelenium {
	
	WebDriver driver;
	
	@Test
	public void lunchDriver() throws InterruptedException
	{
//		WebDriverManager.chromedriver().versionsPropertiesUrl(null)
//		setup();
//		driver = new ChromeDriver();
//		driver.get("www.amazon.in");
//		
//		

		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		driver.manage().window().maximize();
		
		// Navigate to the demoqa website
		driver.get("https://www.amazon.in");
		
		WebElement mobiletab = driver.findElement(By.xpath("//a[@id='nav-global-location-popover-link' and @class='nav-a nav-a-2 a-popover-trigger a-declarative nav-progressive-attribute']"));
		mobiletab.click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("GLUXZipUpdateInput")).sendKeys("560011");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@aria-labelledby='GLUXZipUpdate-announce']")).click();
		Thread.sleep(5000);
		
		
		driver.quit();
		
		
		
	}
	

}
