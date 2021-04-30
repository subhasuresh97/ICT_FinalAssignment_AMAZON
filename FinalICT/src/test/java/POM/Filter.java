package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Filter {

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    private WebElement Textbox;

    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    private WebElement searchbutton;

    @FindBy(xpath = "//span[text()='SanDisk']")
    private WebElement sandisk;


    public Filter(WebDriver driver) { PageFactory.initElements(driver,this);
    }

    public void filterselect(String item)
    {
        Textbox.sendKeys(item);
        searchbutton.click();
        sandisk.click();
    }

//    @FindBy(xpath = "")
//    private WebElement ;


}
