package TestCases;



import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.CommonPage;
import PageObjects.SearchProduct;


public class FashionTest extends BaseClass{
	
	@Test
	public void homeLinkTest()
	{
		driver.findElement(SearchProduct.crossButton).click();
		driver.findElement(CommonPage.Fashionlink).click();
	}
	
	@AfterTest
	public void assertion()
	{
		WebElement viewAll = driver.findElement(CommonPage.ViewAll);
		Assert.assertNotNull(viewAll);
	}

}
