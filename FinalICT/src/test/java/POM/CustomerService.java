package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerService {

    @FindBy(xpath ="//div[@id='nav-xshop-container']/div/a[text()='Customer Service']" )
    private WebElement customer;
    @FindBy(xpath ="//a[@id='nav-logo-sprites']" )
    private WebElement amzn;

    public CustomerService(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void customerr() throws InterruptedException {
        customer.click();
        Thread.sleep(4000);

    }


public void amzon()
{
    amzn.click();
}



}
