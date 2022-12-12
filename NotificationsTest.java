package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.LoginPage;
import PageObjects.CommonPage;
import Utilities.ReadPropertiesFile;

public class NotificationsTest extends BaseClass{
	
	@Test
	public void notificationsTest()
	{
		driver.findElement(LoginPage.MobileNumber).sendKeys(ReadPropertiesFile.getProperty("MobileNumber"));
		driver.findElement(LoginPage.Password).sendKeys(ReadPropertiesFile.getProperty("Password"));
		driver.findElement(LoginPage.LoginBtn).click();
		
		//My Account element
		WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div"));
		//Instantiating Actions class
		Actions actions = new Actions(driver);

		//Hovering on main menu(My Account)
		actions.moveToElement(mainMenu);

		// Locating the element from Sub Menu(Notifications)
		WebElement subMenu = driver.findElement(CommonPage.Notifications);

		//To Mouseover on sub menu(Notifications)
		actions.moveToElement(subMenu);
		actions.click();

		//build()- used to compile all the actions into a single step 
		actions.click().build().perform();
		
		//Assertion
        //after clicking on Notifications "AllNotifications" Title will appear in the page.
		WebElement AllNotifications = driver.findElement(CommonPage.AllNotifications);
		Assert.assertNotNull(AllNotifications);
		
	}

}
