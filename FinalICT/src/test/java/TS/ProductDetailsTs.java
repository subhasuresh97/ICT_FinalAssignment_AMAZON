package TS;

import POM.ProductDetails;
import org.testng.annotations.Test;
import webdriver.Common;

public class ProductDetailsTs extends Common {

  @Test
  public void pd() throws InterruptedException {
        ProductDetails prd=new ProductDetails(driver);
        prd.pro_det();
        Thread.sleep(4000);

    }
}
