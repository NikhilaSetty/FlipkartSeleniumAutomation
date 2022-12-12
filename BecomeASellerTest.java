package TestCases;




import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.BecomeASellerPage;
import PageObjects.CommonPage;
import PageObjects.SearchProduct;
public class BecomeASellerTest extends  BaseClass{
	
	@Test
	public void BecomeASeller()
	{
		driver.findElement(SearchProduct.crossButton).click();
		driver.findElement(BecomeASellerPage.seller_link).click();
	}
	
	//Assertion
	
	//after clicking this link user should see the "start selling" link
	
	@AfterTest
	public void assertion()
	{
		WebElement selling_link = driver.findElement(CommonPage.StartSelling);
		Assert.assertNotNull(selling_link);
	}
	
	
		
	

}
