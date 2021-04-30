package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webdriver.Common;

import java.util.concurrent.TimeUnit;

public class RmItemCart extends Common {
    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    private WebElement Textbox;

    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    private WebElement searchbutton;

    @FindBy(xpath = "//span[@class='a-size-medium a-color-base a-text-normal']")
    private WebElement selectphn ;

    @FindBy(xpath = "//input[@value='Add to Cart']")
    private WebElement Adc;


    @FindBy(xpath = "//a[@id='hlb-view-cart-announce']")
    private WebElement cart;

    @FindBy(xpath = "//input[@value='Delete']")
    private WebElement delete;

    public RmItemCart(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void remove(String item) throws InterruptedException {
        Textbox.sendKeys(item);
        searchbutton.click();
        selectphn.click();

//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Adc);
       // System.out.println(Adc.isDisplayed());

        Thread.sleep(2000);
        WebDriverWait wait=new WebDriverWait(driver, 20);
       WebElement w;
       w= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Add to Cart']")));


        Adc.click();
        cart.click();
        delete.click();
    }




}
