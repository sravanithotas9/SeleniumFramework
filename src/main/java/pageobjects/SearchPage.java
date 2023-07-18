package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    WebDriver driver;

    public  SearchPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css="img[class='img-responsive']")
    private WebElement iphoneImg;

    public  WebElement iphoneImg(){

        return iphoneImg;
    }
}
