package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.http.W3CHttpCommandCodec;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Price {

    @FindBy(xpath = "//div[@id='nav-xshop-container']/div/a[@data-csa-c-slot-id='nav_cs_2']")
    private WebElement today;



    @FindBy(xpath = "//span[@class='a-label a-checkbox-label']")
    private WebElement appliances;

    public Price(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void price()
    {
        today.click();
        appliances.click();
    }


}
