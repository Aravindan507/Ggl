package Pra;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleHomeTest {

	
	@Test
	public void getHomePage() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\eclipse_work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.noon.com/uae-en/");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		System.out.println(driver.getTitle());
	}
	
}
