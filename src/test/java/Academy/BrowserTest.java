package Academy;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BrowserTest {

	
	@Test
	public void getData()
	{
		System.out.println("Hello Guys");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://localhost:8081/MyWebApp/");
		String text =driver.getTitle();
		System.out.println(text);
		Assert.assertTrue(text.equalsIgnoreCase("Coders Arcade - CI/CD Learning"));
		driver.close();

	}
}
