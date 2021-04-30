package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    private WebElement Textbox;

    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    private WebElement searchbutton;
//
//    @FindBy(xpath = "//span[text()='iphone'']")
//    private WebElement rsltpg;

    public Search(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void searchitem(String item)
    {
        Textbox.sendKeys(item);
        searchbutton.click();
//        result.click();

    }

//    public String CheckResultPage() {
//        String rlt=rsltpg.getText();
//        rlt=rlt.replaceAll("^[\"']+|[\"']+$", "");
//        return rlt;
//    }



}
