package TS;
import Dp.DpLogin;
import POM.Login;
import org.testng.Assert;
import org.testng.annotations.Test;
import webdriver.Common;

public class LoginTs extends Common {

    //(dataProvider = "ValidLogin",dataProviderClass = DpLogin.class)
    @Test public void Signinpage() throws InterruptedException {

        Login l=new Login(driver);
        l.Signin();
         String data=driver.getPageSource();
        Assert.assertTrue(data.contains("Enter your name"));
    }

}
