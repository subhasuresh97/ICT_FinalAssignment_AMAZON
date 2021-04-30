package TS;

import POM.AmazonPrime;
import org.testng.Assert;
import org.testng.annotations.Test;
import webdriver.Common;

public class AmazonPrimeTs extends Common {

   @Test public void AP() throws InterruptedException {
        AmazonPrime am=new AmazonPrime(driver);
        am.prime();
        Thread.sleep(4000);
    String Actual=driver.getPageSource();
    //String EXpected="Sign In";

      // Assert.assertEquals(Actual,EXpected);
       Assert.assertTrue(Actual.contains("Sign In"));
    }


}
