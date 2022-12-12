package TestCases;



import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.FlipkartExplorePlusPage;
import PageObjects.SearchProduct;

public class ExplorePlusTest extends BaseClass{
	
	@Test
	public void explorePlusTest()
	{
		driver.findElement(SearchProduct.crossButton).click();
		driver.findElement(FlipkartExplorePlusPage.ExplorePluslink).click();
		
	}
	
	@AfterTest
	public void Assertion()
	{
		WebElement coinBalance= driver.findElement(FlipkartExplorePlusPage.CoinBalance);
		Assert.assertNotNull(coinBalance);
	}

}
