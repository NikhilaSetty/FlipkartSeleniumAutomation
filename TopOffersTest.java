package TestCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.LoginPage;
import PageObjects.CommonPage;
import Utilities.ReadPropertiesFile;

public class TopOffersTest extends BaseClass{
	
	@Test
	public void offerZoneTest()
	{
		

		driver.findElement(LoginPage.MobileNumber).sendKeys(ReadPropertiesFile.getProperty("MobileNumber"));
		driver.findElement(LoginPage.Password).sendKeys(ReadPropertiesFile.getProperty("Password"));
		driver.findElement(LoginPage.LoginBtn).click();
		
		driver.findElement(CommonPage.TopOffers).click();
	}
	
	//Assertion
	@AfterTest
	public void assertion()
	{
		WebElement viewAll = driver.findElement(CommonPage.ViewAll);
		Assert.assertNotNull(viewAll);
	}

}
