package TS;

import Dp.DpLogin;
import POM.RmItemCart;
import POM.Search;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import webdriver.Common;

public class RmItemCartTs extends Common {
    @Test(dataProvider = "searchitem",dataProviderClass = DpLogin.class)
    public void Rmv(String item) throws InterruptedException {
        //Search s=new Search(driver);


        RmItemCart rm=new RmItemCart(driver);
        rm.remove(item);


    }
}
