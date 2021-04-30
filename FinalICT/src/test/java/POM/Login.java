package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    @FindBy(xpath = "//span[text()='Hello, Sign in']")
    private WebElement Hello;

//    @FindBy(xpath = "//input[@id='ap_email']")
//    private WebElement email;
//    @FindBy(xpath = "//input[@id='continue']")
//    private WebElement continuee;
//    @FindBy(xpath = "//input[@id='ap_password']")
//    private WebElement password;
//    @FindBy(xpath = "//input[@class='a-button-input']")
//    private WebElement submit;

    @FindBy(xpath = "//a[@id='createAccountSubmit']")
    private WebElement create;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement cont;




    public Login(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void Signin() throws InterruptedException {

        Hello.click();
        create.click();
        cont.click();
        Thread.sleep(4000);
        // Signin.click();
//        email.sendKeys(Username);
//        continuee.click();
//        password.sendKeys(Password);
//        submit.click();
    }

}
