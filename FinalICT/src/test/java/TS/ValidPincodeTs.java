package TS;
import Dp.DpLogin;
import POM.ValidPincode;
import org.testng.Assert;
import org.testng.annotations.Test;
import webdriver.Common;

public class ValidPincodeTs extends Common {
    @Test(dataProvider = "validpincode",dataProviderClass = DpLogin.class)

    public void pincodevalidate(String pincode) throws InterruptedException {
        ValidPincode validpin = new ValidPincode(driver);
        validpin.Enterpincode(pincode);
        Thread.sleep(4000);
    }
}
