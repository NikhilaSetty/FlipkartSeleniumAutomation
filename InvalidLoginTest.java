package TestCases;

import PageObjects.LoginPage;
import PageObjects.CommonPage;
import Utilities.ReadPropertiesFile;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Base.BaseClass;

public class InvalidLoginTest extends BaseClass {

    @Test
    public void signIn() {
        driver.findElement(LoginPage.MobileNumber).sendKeys(ReadPropertiesFile.getProperty("MobileNumber"));
        driver.findElement(LoginPage.Password).sendKeys(ReadPropertiesFile.getProperty("WrongPassword"));
        driver.findElement(LoginPage.LoginBtn).click();

    }
    
    @AfterTest
    public void assertion()
    {
    	WebElement invalid_login_text = driver.findElement(CommonPage.Invalidlogintext);
    	Assert.assertNotNull(invalid_login_text);
    }
}
