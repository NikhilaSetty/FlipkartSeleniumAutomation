package TestCases;

import PageObjects.CreateNewAccount;
import Utilities.ReadPropertiesFile;
import org.testng.annotations.Test;

import Base.BaseClass;

public class NewAccountTest extends BaseClass {

    @Test
    public void SignUp() {// Locate the MobileNumber field and send data
        driver.findElement(CreateNewAccount.NewUSer).click();
        driver.findElement(CreateNewAccount.MobNumber).sendKeys(ReadPropertiesFile.getProperty("MobileNumber"));

    }
}
