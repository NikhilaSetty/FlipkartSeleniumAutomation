package TestCases;



import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.CommonPage;
import PageObjects.SearchProduct;

public class MobilesAndTablets extends BaseClass{
	
	@Test
	public void mobilesTabletsTest()
	{
		driver.findElement(SearchProduct.crossButton).click();
		driver.findElement(CommonPage.MobilesTablets).click();
	}
	
	@AfterTest
	public void assertion()
	{
		WebElement BigSale = driver.findElement(CommonPage.BigSale);
	    Assert.assertNotNull(BigSale);
	}

}
