package Faccebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facelogin {

	WebDriver driver;

	public Facelogin(WebDriver driver) {

		// this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//	By Username = By.id("login1");
//	By Password = By.id("password");
//	By submit = By.xpath("//input[@name='proceed']");

	@FindBy(xpath = "//input[@name='proceed']")
	WebElement submit;
	@FindBy(id = "password")
	WebElement Password;
	@FindBy(id = "login1")
	WebElement Username;

	public WebElement Password() {
		return Password;

	}

	public WebElement submit() {
		return submit;

	}

	public WebElement Username() {
		// TODO Auto-generated method stub
		return Username;
	}

}
