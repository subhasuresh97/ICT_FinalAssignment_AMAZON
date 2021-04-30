package TS;

import Dp.DpLogin;
import POM.Login;
import POM.Search;
import org.testng.Assert;
import org.testng.annotations.Test;
import webdriver.Common;

public class SearchTs extends Common {

    @Test(dataProvider = "searchitem",dataProviderClass = DpLogin.class)
    public void Searchanitem(String item) throws InterruptedException {

        Search text=new Search(driver);
        text.searchitem(item);
        Thread.sleep(4000);
//        String Srchrslt=text.CheckResultPage();//check user should be in result page
//        Assert.assertEquals(Srchrslt,item);

    }

}


