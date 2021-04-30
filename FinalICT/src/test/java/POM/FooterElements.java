package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterElements {


    @FindBy(xpath = "//a[@class='nav_a']")
    private WebElement aboutus;

    public FooterElements(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    //    @FindBy(xpath =)
//    private WebElement
    public void about() throws InterruptedException {

        Thread.sleep(4000);
        aboutus.click();
    }

}

