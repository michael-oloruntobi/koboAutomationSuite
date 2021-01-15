package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class truckPool {
	
public WebDriver driver;
	
	By selectTruckrequest = By.xpath("//tbody/tr[1]/td[1]");
	
	public truckPool(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}
	
public WebElement selectTruckrequest() {
		
		return driver.findElement(selectTruckrequest);
	}

}
