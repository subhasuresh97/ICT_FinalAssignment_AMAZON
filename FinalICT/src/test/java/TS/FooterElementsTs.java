package TS;

import POM.FooterElements;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import webdriver.Common;

public class FooterElementsTs extends Common {

    @Test
    public void aboutus() throws InterruptedException {


        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,260)");
        Thread.sleep(4000);
        FooterElements foot = new FooterElements(driver);
        foot.about();
        Thread.sleep(4000);
//    String Actual=driver.
//  Assert.
    }
}
