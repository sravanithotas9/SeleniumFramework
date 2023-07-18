package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreated {
    WebDriver driver;

    public AccountCreated(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements ( driver, this );

    }
    @FindBy(css = "div[id='content']>h1")
     private WebElement yourAccount;
    @FindBy(linkText = "Continue")
    private WebElement continueBtn;

    public WebElement yourAccount() {

        return yourAccount;

    }

    public WebElement continueBtn() {

        return continueBtn;
    }


}
