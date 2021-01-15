package koboPackages;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.SpacesSignUpPage;
import resources.base;



public class huaweiTest extends base{
	
	@Test	
	public void  signUpStart() throws SQLException, ClassNotFoundException, IOException, InterruptedException {
			
		driver = initializeDriver();
		  
	//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver85");
								    	
	driver = new ChromeDriver();
								  
	driver.get("https://release.spaceso2o.com/launch"); 
								 

							    
						            //System.out.println(s); 
							    
								
				
				    
					
					   
					    

	}
	

	}

