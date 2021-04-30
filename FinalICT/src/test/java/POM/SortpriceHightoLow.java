package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SortpriceHightoLow {

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    private WebElement Textbox;

    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    private WebElement searchbutton;

    @FindBy(xpath = "//span[@class='a-dropdown-label']")
    private WebElement sortby;

    @FindBy(xpath = "//a[@id='s-result-sort-select_2']")
    private WebElement HtL;

    public SortpriceHightoLow(WebDriver driver) { PageFactory.initElements(driver, this); }

    public void SetHightoLow() throws InterruptedException {
        sortby.click();
        //Thread.sleep(2000);
        HtL.click();
    }

//    public String extracthightolow(){
//        String HighToLow=getTexthightolow.getText();
//        System.out.println(HighToLow);
//        return HighToLow;}
//

}
