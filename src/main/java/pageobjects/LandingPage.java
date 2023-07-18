package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
    WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements ( driver, this );

    }

    @FindBy(css = "a[title='My Account']")
    private WebElement myAccountDropdown;

    @FindBy(linkText = "Login")
    private WebElement loginOption;

    @FindBy(css="li[class='dropdown open'] li:nth-child(1) a:nth-child(1)")
    private WebElement registerOption;

    public WebElement myAccountDropdown() {

        return myAccountDropdown;

    }

    public WebElement loginOption() {

        return loginOption;

    }

    public WebElement registerOption() {

        return registerOption;
    }

}