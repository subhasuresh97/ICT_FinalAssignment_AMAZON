package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetails {

    @FindBy(xpath = "//span[@class='hm-icon-label']")
    private WebElement hamclick;

    @FindBy(xpath = "//div[@id='hmenu-content']/ul/li/a/div")
    private WebElement echoalexa;

    @FindBy(xpath = "//*[@id='hmenu-content']/ul[2]/li[3]/a")
    private WebElement echodot;


    public ProductDetails(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void pro_det() throws InterruptedException {
        hamclick.click();
        echoalexa.click();
        Thread.sleep(4000);
        echodot.click();
    }
}
