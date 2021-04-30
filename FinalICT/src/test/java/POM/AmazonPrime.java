package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPrime {
    @FindBy(xpath = "//div[@id='nav-xshop-container']/div/a/span")
    private WebElement primeclick;

    @FindBy(xpath = "//a[@id='a-autoid-0-announce']")
    private WebElement logprime;

    public AmazonPrime(WebDriver driver) {
        PageFactory.initElements(driver,this);

    }


    public void prime()
    {
        primeclick.click();
        logprime.click();
    }

}
