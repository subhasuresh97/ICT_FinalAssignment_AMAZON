package TS;

import Dp.DpLogin;
import POM.Filter;
import org.testng.annotations.Test;
import webdriver.Common;

public class FilterTs extends Common {

    @Test(dataProvider = "filter",dataProviderClass = DpLogin.class)
    public void filter(String item) throws InterruptedException {
        Filter f=new Filter(driver);
        f.filterselect(item);
        Thread.sleep(4000);
    }
}
