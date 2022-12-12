package TestCases;



import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.CommonPage;
import PageObjects.SearchProduct;

public class ReturnPolicyTest extends BaseClass{
	
	@Test
	public void returnPolicyTest()
	{
		driver.findElement(SearchProduct.crossButton).click();
		driver.findElement(CommonPage.ReturnPolicy).click();
		
	}
	
	@AfterTest
	public void assertion()
	{
		WebElement ReturnPolicyText = driver.findElement(CommonPage.ReturnPolicyText);
		Assert.assertNotNull(ReturnPolicyText);
	}

}
