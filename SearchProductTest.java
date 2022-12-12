package TestCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.CommonPage;
import PageObjects.SearchProduct;

public class SearchProductTest extends BaseClass{
	@Test
	public void searchFieldTest()
	{
		driver.findElement(SearchProduct.crossButton).click();
		driver.findElement(CommonPage.SearchLink).sendKeys("Mobiles");
	}
	
	@AfterTest
	public void assertion()
	{
		//after searching for some product "sort By" tab will appear in the page
		WebElement sortBy =driver.findElement(CommonPage.SortBy);
		Assert.assertNotNull(sortBy);
	}

}
