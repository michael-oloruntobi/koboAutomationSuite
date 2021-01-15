package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class assignTruckPage {
	
	public WebDriver driver;
	
	By selectTruckrequest = By.xpath("//tbody/tr[1]/td[1]");
	
	By allocateTransporter = By.xpath("//body/app-root[1]/app-truck-request-detail[1]/kobo-base-profile[1]/main[1]/div[1]/div[2]/kobo-card[1]/div[1]/div[2]/ul[1]/li[1]/span[1]");
	
	By inputTransporter = By.xpath("//input[@id='transporter']");
	
	By selectTransporter = By.xpath("//span[contains(text(),'Shaprapra Limted')]");
	
	By truckNumberClick = By.xpath("//body/app-root[1]/app-truck-request-detail[1]/kobo-base-profile[1]/main[1]/div[1]/div[3]/kobo-card[1]/div[1]/div[2]/div[2]/div[1]/div[1]/mat-icon[2]");
	
	By assignTransporter = By.xpath("//body/app-root[1]/app-truck-request-detail[1]/kobo-base-profile[1]/main[1]/div[1]/div[3]/button[1]");
	
	By acceptTruckRequest = By.xpath("//mat-expansion-panel-header/span[1]/mat-panel-title[1]/div[1]/span[1]");
	
	By assignTruckClick = By.xpath("//span[contains(text(),'Assign Truck')]");
	
	By inputTruck = By.xpath("//input[@id='regNumber']");
	
	By selectTruck = By.xpath("//span[contains(text(),'Shaprapra5')]");
	
	By assignTruck = By.xpath("//body/app-root[1]/app-truck-request-detail[1]/kobo-base-profile[1]/main[1]/div[1]/div[3]/div[1]/button[1]");
	
	
	
	public assignTruckPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}
	
	
	public WebElement selectTruckrequest() {
		
		return driver.findElement(selectTruckrequest);
	}
	
	public WebElement allocateTransporter() {
		
		return driver.findElement(allocateTransporter);
	}
	
public WebElement inputTransporter() {
		
		return driver.findElement(inputTransporter);
	}

public WebElement selectTransporter() {
	
	return driver.findElement(selectTransporter);
}
	
	public WebElement truckNumberClick() {
		
		return driver.findElement(truckNumberClick);
	}

	public WebElement assignTransporter() {
		
		return driver.findElement(assignTransporter);
	}
	
	public WebElement acceptTruckRequest() {
		
		return driver.findElement(acceptTruckRequest);
	}
	
public WebElement assignTruckClick() {
		
		return driver.findElement(assignTruckClick);
	}

public WebElement inputTruck() {
	
	return driver.findElement(inputTruck);
}

public WebElement selectTruck() {
	
	return driver.findElement(selectTruck);
}

public WebElement assignTruck() {
	
	return driver.findElement(assignTruck);
}


}
