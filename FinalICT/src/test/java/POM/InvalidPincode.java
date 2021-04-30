package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvalidPincode {

    @FindBy(xpath = "//a[@id='nav-global-location-popover-link']")
    private WebElement pinheader;

    @FindBy(xpath = "//input[@id='GLUXZipUpdateInput']")
    private WebElement enterpin;

    @FindBy(xpath = "//span[@id='GLUXZipUpdate']")
    private WebElement apply;

    public InvalidPincode(WebDriver driver){ PageFactory.initElements(driver,this); }


    public void EnterInvalidpincode(String pincode) throws InterruptedException {
        Thread.sleep(4000);
        pinheader.click();
        enterpin.sendKeys(pincode);
        apply.click();
    }

}
