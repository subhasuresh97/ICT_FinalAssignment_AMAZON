package TS;

import POM.Filter;
import POM.Price;
import org.testng.annotations.Test;
import webdriver.Common;

  public class PriceTs extends Common {

      @Test public void pricefilter() throws InterruptedException {
        Price p=new Price(driver);
        p.price();
        Thread.sleep(4000);
    }
}
