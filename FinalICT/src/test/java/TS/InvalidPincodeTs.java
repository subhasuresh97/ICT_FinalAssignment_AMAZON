package TS;

import Dp.DpLogin;
import POM.InvalidPincode;
import org.testng.annotations.Test;
import webdriver.Common;

public class InvalidPincodeTs extends Common
{

    @Test(dataProvider ="Invalidpincode",dataProviderClass = DpLogin.class)
    public void invalidpincode(String Invalidpin)throws InterruptedException
    {


        InvalidPincode invalid=new InvalidPincode(driver);
        invalid.EnterInvalidpincode(Invalidpin);
        Thread.sleep(4000);

    }
}
