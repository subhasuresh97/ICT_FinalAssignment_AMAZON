package TS;

import POM.CustomerService;
import org.testng.Assert;
import org.testng.annotations.Test;
import webdriver.Common;

public class CustomerServiceTs extends Common {

   @Test public void Customer()throws InterruptedException
    {
        CustomerService cus=new CustomerService(driver);
        cus.customerr();
        Thread.sleep(4000);
        String Actual = driver.getPageSource();
        //String Expected = "Hello. What can we help you with?";
        //Assert.assertEquals(Actual,Expected);
        Assert.assertTrue(Actual.contains("Hello. What can we help you with?"));
        cus.amzon();
    }
}
