package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class acceptedRequestPage {

	public WebDriver driver;
	
	By acceptedRequestLink = By.cssSelector("img[alt='Accepted Request']");
	
	By createOrderButton = By.cssSelector("button[color='primary']");
	
	By customerInputField = By.cssSelector("input[id='customer']");
	
	By customerSearchResult = By.cssSelector("span[class='mat-option-text']");
	
	By businessUnit = By.xpath("//select[@id='businessUnit']");
	
	By truckType = By.xpath("//mat-radio-button[@id='mat-radio-1']");
	
	By submitButton = By.cssSelector("button[type='submit']");
	
	By selelectBusinessName = By.cssSelector("div[class='content-wrapper']");
	
	By businessNameSelectedArrow = By.cssSelector("img[alt='check']");
	
	By selelectBusinessAcct = By.xpath("//select[@id='customerAccount']");
	
	By nextButton = By.xpath("/html[1]/body[1]/app-root[1]/app-create-truck-request[1]/kobo-base-list[1]/main[1]/div[1]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[2]/div[1]/button[2]");
	
	//By selectAssetClass = By.cssSelector("div[formgroupname='assetClass']"); 
	
	By selectAssetClass = By.xpath("//body/app-root[1]/app-create-truck-request[1]/kobo-base-list[1]/main[1]/div[1]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[3]/form[1]/div[1]/kobo-card[1]/div[1]/div[2]/div[1]/ul[1]/li[1]"); 
	
	By truckSize = By.xpath("//select[@id='size']");
	
	By truckNumberClick = By.xpath("//mat-icon[contains(text(),'add')]");
	
	By nextPageTruck = By.xpath("//body/app-root[1]/app-create-truck-request[1]/kobo-base-list[1]/main[1]/div[1]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[3]/div[1]/button[2]/span[1]");
	
	By address = By.xpath("//p[contains(text(),'WareHouse')]"); 
	
	By nextButtonAddress = By.xpath("//body/app-root[1]/app-create-truck-request[1]/kobo-base-list[1]/main[1]/div[1]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[5]/div[1]/button[2]/span[1]");
	
	By calendarClick = By.xpath("//body/app-root[1]/app-create-truck-request[1]/kobo-base-list[1]/main[1]/div[1]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[6]/kobo-card[1]/div[1]/div[2]/form[1]/div[1]/div[1]/mat-datepicker-toggle[1]/button[1]/span[1]/*[1]"); 
	
	By calendarClickNext = By.xpath("//mat-calendar-header/div[1]/div[1]/button[3]"); 
	
	By calendarDateSelect = By.xpath("//div[contains(text(),'13')]"); 
	
	By NextPageCalendarSelect = By.xpath("//body/app-root[1]/app-create-truck-request[1]/kobo-base-list[1]/main[1]/div[1]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[6]/div[1]/button[2]/span[1]"); 
	
	By NextPageComment = By.xpath("//body/app-root[1]/app-create-truck-request[1]/kobo-base-list[1]/main[1]/div[1]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[7]/div[1]/button[2]/span[1]"); 
	
	By NextPageUploadDoc  = By.xpath("//body/app-root[1]/app-create-truck-request[1]/kobo-base-list[1]/main[1]/div[1]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[8]/div[1]/button[2]/span[1]"); 
	
	By NextPageAssignTransporter = By.xpath("//body/app-root[1]/app-create-truck-request[1]/kobo-base-list[1]/main[1]/div[1]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[9]/div[1]/button[2]"); 
	
	By saveTruckRequest = By.xpath("//span[contains(text(),'SAVE TRUCK REQUEST')]"); 
	
	

	
	
	public acceptedRequestPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}

	public WebElement getAcceptedRequestLink() {
		
		return driver.findElement(acceptedRequestLink);
	}
	
	public WebElement getCreateOrderButton() {
		
		return driver.findElement(createOrderButton);
	}
	
	public WebElement getCustomerInputField() {
		
		return driver.findElement(customerInputField );
	}
	
	public WebElement getCustomerSearchResult() {
		
		return driver.findElement(customerSearchResult);
	}
	
	public WebElement getBusinessUnit() {
		
		return driver.findElement(businessUnit);
	}
	
	public WebElement getTruckType() {
	
	return driver.findElement(truckType);
	}
	
	public WebElement getSubmitButton() {
		
		return driver.findElement(submitButton);
	}

	public WebElement getSelelectBusinessName() {
		
		return driver.findElement(selelectBusinessName);
	}
	

	public WebElement getBusinessNameSelectedArrow() {
		
		return driver.findElement(businessNameSelectedArrow);
	}
	
	public WebElement getSelelectBusinessAcct() {
		
		return driver.findElement(selelectBusinessAcct);
	}
	
public WebElement getNextButton() {
		
		
	return driver.findElement(nextButton);
	}
public WebElement getSelectAssetClass() {
	
	
	return driver.findElement(selectAssetClass);
	}

public WebElement getTruckSize() {
	
	return driver.findElement(truckSize);
	}
	
public WebElement getTruckNumberClick() {
	
	return driver.findElement(truckNumberClick);
	}

public WebElement nextPageTruck() {
	
	return driver.findElement(nextPageTruck);
	}

public WebElement address() {
	
	return driver.findElement(address);
	}

public WebElement nextButtonAddress() {
	
	
	return driver.findElement(nextButtonAddress);
	}

public WebElement calendarClick() {
	
	
	return driver.findElement(calendarClick);
	}

public WebElement calendarClickNext() {
	
	
	return driver.findElement(calendarClickNext);
	}

public WebElement calendarDateSelect() {
	
	
	return driver.findElement(calendarDateSelect);
	}

public WebElement NextPageCalendarSelect() {
	
	
	return driver.findElement(NextPageCalendarSelect);
	}

public WebElement NextPageComment() {
	
	return driver.findElement(NextPageComment);
}

public WebElement NextPageUploadDoc() {

return driver.findElement(NextPageUploadDoc);
}

public WebElement NextPageAssignTransporter() {

return driver.findElement(NextPageAssignTransporter);
}

public WebElement saveTruckRequest() {

return driver.findElement(saveTruckRequest);
}


}



