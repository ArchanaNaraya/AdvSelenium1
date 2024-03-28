package integrationTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParameterisationDemo {
	@Test
	public void run() throws Throwable {
	
		String url = System.getProperty("url");
		System.out.println(url);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get(url);
	Thread.sleep(2000);
	driver.quit();
	}
}
