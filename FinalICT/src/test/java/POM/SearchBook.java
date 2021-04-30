package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBook {

    @FindBy(xpath = "//select[@id='searchDropdownBox']")
    private WebElement click;

    @FindBy(xpath ="//select/option [@value='search-alias=stripbooks']" )
    private WebElement book;

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    private WebElement Textbox;

    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    private WebElement searchbutton;

    public SearchBook(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

//    @FindBy(xpath = )
//    private WebElement
//
//    @FindBy(xpath = )
//    private WebElement click;

    public void book(String bk)
    {
        click.click();
        book.click();
       Textbox.sendKeys(bk);
        searchbutton.click();
    }
}
