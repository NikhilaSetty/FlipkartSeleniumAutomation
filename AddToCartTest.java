package TestCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.relevantcodes.extentreports.LogStatus;

import Base.BaseClass;
import PageObjects.AddToCartPage;
import PageObjects.SearchProduct;
import org.testng.*;

public class AddToCartTest extends BaseClass{
	public  static Logger logger = Logger.getLogger(AddToCartTest.class);
	
	@Test
	public void cartTest()
	{
		//Extent Report
        test.log(LogStatus.INFO,"Test get Passed");
        //Logger implementation
        logger.info("Cross the signup slide ");

		driver.findElement(SearchProduct.crossButton).click();
		driver.findElement(AddToCartPage.cart_link).click();
	}
	
	@AfterTest
	public void assertion1()
	{
		WebElement priceDetails = driver.findElement(By.xpath("//span[contains(text(),'Price details')]"));
		Assert.assertNotNull(priceDetails);
	}

}
