package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import webdriver.Common;

import java.util.concurrent.TimeUnit;


public class AddtoCart extends Common{

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    private WebElement Textbox;

    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    private WebElement searchbutton;

    @FindBy(xpath = "//span[@class='a-size-medium a-color-base a-text-normal']")
    private WebElement SelctItem;
//
//    @FindBy(xpath = "//select[@data-action='a-dropdown-select']/option[@value='1']")
//    private WebElement SelctQty;
//
    @FindBy(xpath = "//span[@id='nav-cart-count']")

    private WebElement cartnumber;
WebElement drpCountry =(driver.findElement(By.xpath("//select[@id='quantity']")));

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    private WebElement addto;

    public AddtoCart(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    public int cartnum(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        int cartnumbr= Integer.parseInt(cartnumber.getText());
        return cartnumbr;
    }


  public void add(String itemadd)
  {
      Textbox.sendKeys(itemadd);
      searchbutton.click();
      SelctItem.click();
      drpCountry.click();
     // SelctQty.click();
//      Qty3.click();
    //  ;

      //rpCountry.click();
      //drpCountry.selectByVisibleText("2");
      //drpCountry.click();

      addto.click();
  }
//    public void changequntitytothree(){
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        Select drpCountry = new Select(driver.findElement(By.xpath("//select[@id='quantity']")));//quantity locator
//        drpCountry.selectByVisibleText("3");
//    }


}
