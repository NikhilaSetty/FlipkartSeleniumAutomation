package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.LoginPage;
import PageObjects.CommonPage;
import Utilities.ReadPropertiesFile;

public class GiftCardsTest extends BaseClass{
	
	@Test
	public void giftCardsTest()
	{
		driver.findElement(LoginPage.MobileNumber).sendKeys(ReadPropertiesFile.getProperty("MobileNumber"));
		driver.findElement(LoginPage.Password).sendKeys(ReadPropertiesFile.getProperty("Password"));
		driver.findElement(LoginPage.LoginBtn).click();
		
		//My Account element
		WebElement mainMenu = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]"));
		//Instantiating Actions class
		Actions actions = new Actions(driver);

		//Hovering on main menu(My Account)
		actions.moveToElement(mainMenu);

		// Locating the element from Sub Menu(Gift Cards)
		WebElement subMenu = driver.findElement(CommonPage.GiftCards);

		//To Mouseover on sub menu(My Profile)
		actions.moveToElement(subMenu);
		actions.click();

		//build()- used to compile all the actions into a single step 
		actions.click().build().perform();
	}

}
