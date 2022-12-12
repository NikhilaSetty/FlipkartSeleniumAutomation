package TestCases;

import org.apache.logging.log4j.core.net.Advertiser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.relevantcodes.extentreports.LogStatus;

import Base.BaseClass;
import PageObjects.LoginPage;
import PageObjects.CommonPage;
import Utilities.ReadPropertiesFile;

public class CouponsTest extends BaseClass{
	 public  static Logger logger = Logger.getLogger(Advertiser.class);
	 
	@Test
	public void couponsTest()
	{
		//Extent Report
        test.log(LogStatus.INFO,"Test get Passed");
        //Logger implementation
        logger.info("Cross the signup slide ");
		driver.findElement(LoginPage.MobileNumber).sendKeys(ReadPropertiesFile.getProperty("MobileNumber"));
		driver.findElement(LoginPage.Password).sendKeys(ReadPropertiesFile.getProperty("Password"));
		driver.findElement(LoginPage.LoginBtn).click();
		
		//My Account element
		WebElement mainMenu = driver.findElement(CommonPage.MyAccount);
		//Instantiating Actions class
		Actions actions = new Actions(driver);

		//Hovering on main menu(My Account)
		actions.moveToElement(mainMenu);

		// Locating the element from Sub Menu(My Profile)
		WebElement subMenu = driver.findElement(CommonPage.Coupon);

		//To mouse over on sub menu(My Profile)
		actions.moveToElement(subMenu);
		actions.click();

		//build()- used to compile all the actions into a single step 
		actions.click().build().perform();
		
		//Assertion
        //after clicking on Coupons "Available Coupons" field will appear in the page.
		WebElement availableCoupons = driver.findElement(CommonPage.AvailableCoupons);
		Assert.assertNotNull(availableCoupons);
	}

}
