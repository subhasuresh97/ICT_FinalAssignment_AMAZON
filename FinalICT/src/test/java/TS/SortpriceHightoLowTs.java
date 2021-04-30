package TS;

import Dp.DpLogin;
import POM.Search;
import POM.SortpriceHightoLow;
import org.testng.Assert;
import org.testng.annotations.Test;
import webdriver.Common;

import java.util.concurrent.TimeUnit;

public class SortpriceHightoLowTs extends Common {
    @Test(dataProvider = "searchitem",dataProviderClass = DpLogin.class)
    public void sortpricehtol(String item)throws InterruptedException
    {

        //        String text=sorting.extracthightolow();
        //        Assert.assertEquals(text,"Sort by:Price: High to Low");
        //    }

        Search text=new Search(driver);
        text.searchitem(item);

        SortpriceHightoLow HtoL=new SortpriceHightoLow(driver);
        HtoL.SetHightoLow();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //String extract=text.extracthightolow();
        // Assert.assertEquals(text,"Sort by:Price: High to Low");
        Thread.sleep(4000);



    }

}
