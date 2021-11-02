package Faccebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookTestcase {

	@Test
	public void login()

	{

		System.setProperty("webdriver.chrome.driver", "/home/pramodp/Downloads/selenium/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Facelogin lg = new Facelogin(driver);
		lg.Username().sendKeys("pramodrocky005@gmail.com");
		lg.Password().sendKeys("pramod@1996");
		lg.submit().click();
		driver.close();

	}
	
	@Test
	public void git() {
		System.out.println("welcome to github");
	}
}
