package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements ( driver, this );

    }
    @FindBy(css="input[name='search']")
    private WebElement searchBox;

    @FindBy(css="button[class='btn btn-default btn-lg']")
    private WebElement amplifier;

    public WebElement searchBox() {

        return searchBox;
    }

     public WebElement amplifier(){

        return amplifier;
 }

}
