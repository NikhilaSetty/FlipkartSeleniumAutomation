package TestCases;



import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.CommonPage;
import PageObjects.LoginPage;
import Utilities.ReadPropertiesFile;

public class LoginPageTest extends BaseClass {

    @Test
    public void Login() {     // Locate the email field and send data
        driver.findElement(LoginPage.MobileNumber).sendKeys(ReadPropertiesFile.getProperty("MobileNumber"));
        driver.findElement(LoginPage.Password).sendKeys(ReadPropertiesFile.getProperty("Password"));
        driver.findElement(LoginPage.LoginBtn).click();
    }
    
    @AfterTest
    public void assertion()
    {
    	WebElement topoffer= driver.findElement(CommonPage.TopOffers);
    	Assert.assertNotNull(topoffer);
    }
}
