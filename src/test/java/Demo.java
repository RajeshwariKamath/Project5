import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Demo {
	static
	{
		System.setProperty("webdriver.gecko.driver","F:\\workspace\\ShriyaPractise\\MavenProject\\driver\\geckodriver.exe");
	}
	@Test
	public void testOne()
	{ 
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		System.out.println("jenkins demo");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}


}
