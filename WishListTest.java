package TestCases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.LoginPage;
import PageObjects.CommonPage;
import Utilities.ReadPropertiesFile;

public class WishListTest extends BaseClass{
	
	@Test
	public void wishListTest()
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

		// Locating the element from Sub Menu(Wish List)
		WebElement subMenu = driver.findElement(CommonPage.Wishlistlink);

		//To mousehover on sub menu(My Profile)
		actions.moveToElement(subMenu);
		actions.click();

		//build()- used to compile all the actions into a single step 
		actions.click().build().perform();
		
		//Assertion
        //after clicking on wishList "my Wish List" field will appear in the page.
		WebElement myWishList = driver.findElement(CommonPage.Mywishlist);
		Assert.assertNotNull(myWishList);
	}

}
