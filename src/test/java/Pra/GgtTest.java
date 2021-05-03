package Pra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GgtTest {
	
	
	@Test
	public void setPP() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\eclipse_work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		System.out.println(driver.getTitle());
	}

}
