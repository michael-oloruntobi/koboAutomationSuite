package koboPackages;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import pageObjects.acceptedRequestPage;
import pageObjects.assignTruckPage;
import pageObjects.controlLoginPage;
import resources.base;

public class ControlDashboard extends base{

	//public static WebDriver driver;
	

	
	@BeforeClass
	public void basePageNavigation() throws IOException, InterruptedException {
		
		 driver = initializeDriver();
		
		driver.get(prop.getProperty("controlurl"));
		
		controlLoginPage loginPage = new controlLoginPage(driver);
		
		Select entId = new Select(loginPage.getEntId());
		
		loginPage.getEmailId().sendKeys(prop.getProperty("superAdmin"));
		
		
		loginPage.getPasswordField().sendKeys(prop.getProperty("superAdminPassword"));
		
		Thread.sleep(1000);
		
		entId.selectByIndex(1);
		
		AssertJUnit.assertTrue(loginPage.getSubmitButton().isDisplayed());
		
		loginPage.getSubmitButton().click();
		
		Thread.sleep(2000);
		
		AssertJUnit.assertTrue(loginPage.getLoginAlert().getText().contains("You're in"));
		
	}
	
	@Test
	public void AcreateTruckRequest() throws InterruptedException, IOException {
		
		acceptedRequestPage createRequest = new acceptedRequestPage(driver);  
		
		createRequest.getAcceptedRequestLink().click();
	
		createRequest.getCreateOrderButton().click();
		
		createRequest.getCustomerInputField().sendKeys(prop.getProperty("customerSearch"));
		
		createRequest.getCustomerSearchResult().click();
		
		Thread.sleep(2000);
		
		Select businessUnit = new Select(createRequest.getBusinessUnit());
		
		businessUnit.selectByIndex(2);
		
		Thread.sleep(1000);
		
		createRequest.getTruckType().click();
		
		createRequest.getSubmitButton().click();
		
		createRequest.getSelelectBusinessName().click();
		
		//Thread.sleep(1000);
		
		AssertJUnit.assertTrue(createRequest.getBusinessNameSelectedArrow().isDisplayed());
		
		Thread.sleep(1000);
		
		Select selelectBusinessAcct = new Select(createRequest.getSelelectBusinessAcct());
		
		selelectBusinessAcct.selectByIndex(1);
		
		createRequest.getNextButton().click();
		
		
		createRequest.getSelectAssetClass().click();
		
		Select truckSize = new Select(createRequest.getTruckSize());
		
		truckSize.selectByIndex(1);
		
		createRequest.getTruckNumberClick().click();
	
		createRequest.nextPageTruck().click();
		
		createRequest.address().click();
		
		Thread.sleep(1000);
		
		createRequest.nextButtonAddress().click();
		
		Thread.sleep(1000);
		
		createRequest.calendarClick().click();
		
		createRequest.calendarClickNext().click();
		
		createRequest.calendarDateSelect().click();
		
		createRequest.NextPageCalendarSelect().click();
		
		createRequest.NextPageComment().click();
	
		createRequest.NextPageUploadDoc().click();
		
		createRequest.NextPageAssignTransporter().click();
		
		createRequest.saveTruckRequest().click();
		
		
		
	}
	
	
//	@Test
	public void BassignTruckToRequest() throws IOException, InterruptedException {
	
		
		
acceptedRequestPage createRequest = new acceptedRequestPage(driver);  
		
		createRequest.getAcceptedRequestLink().click();
	
		
		assignTruckPage assignTruck = new assignTruckPage(driver);
		
		assignTruck.selectTruckrequest().click();
		
		assignTruck.allocateTransporter().click();
		
		assignTruck.inputTransporter().sendKeys(prop.getProperty("transporterSearch"));
		
		assignTruck.selectTransporter().click();
	
		assignTruck.truckNumberClick().click();
		
		Thread.sleep(1000);
		
		assignTruck.assignTransporter().click();
/*		
		assignTruck.acceptTruckRequest().click();
		
		assignTruck.assignTruckClick().click();
		
		assignTruck.inputTruck().sendKeys(prop.getProperty("truckReg"));
		
		assignTruck.selectTruck().click();  //need to work on page object later
		
		assignTruck.assignTruck().click();
		
		*/
	}
	
	
	
	
}
