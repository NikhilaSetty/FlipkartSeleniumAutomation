package TestCases;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.LoginPage;
import PageObjects.CommonPage;
import Utilities.ReadPropertiesFile;

public class FlipkartPlusZoneTest extends BaseClass{
	
	@Test
	public void flipkartPlusZone()
	{
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
		WebElement subMenu = driver.findElement(CommonPage.PlusZone);

		//To mouse over on sub menu(My Profile)
		actions.moveToElement(subMenu);
		actions.click();

		//build()- used to compile all the actions into a single step 
		actions.click().build().perform();
		
		//Assertion
        //after clicking on flipkartPlusZone "myCoinBalance" field will appear in the page.
		WebElement myCoinBalance = driver.findElement(CommonPage.CoinBalance);
		Assert.assertNotNull(myCoinBalance);
		
	}

}
