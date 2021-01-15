package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class controlLoginPage {

	public WebDriver driver;
	
	By entId = By.xpath("//select[@id='sizes']");
	
	By emailId = By.xpath("//input[@name='email']");
	
	By passwordField = By.xpath("//input[@name='secret']");
	
	By submitButton = By.cssSelector("button[type='submit']");
	
	By loginAlert = By.cssSelector("div[role='alert']");
	
	
	
	public controlLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}

	public WebElement getEntId() {
		
		return driver.findElement(entId);
	}
	
	public WebElement getEmailId() {
		
		return driver.findElement(emailId);
	}
	
	public WebElement getPasswordField() {
		
		return driver.findElement(passwordField);
	}
	
	public WebElement getSubmitButton() {
		
		return driver.findElement(submitButton);
	}
	
	public WebElement getLoginAlert() {
		
		return driver.findElement(loginAlert);
	}
	
	
}


