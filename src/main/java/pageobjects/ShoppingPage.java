package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingPage {

    WebDriver driver;

    public ShoppingPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements ( driver,this );
    }

    @FindBy(xpath ="//h1[contains(text(),'Shopping Cart')]" )
    private WebElement shoppingCart;

    @FindBy(xpath ="//a[@class='btn btn-primary']" )
    private WebElement checkOutShop;

    public WebElement shoppingCart()
    {
        return shoppingCart;
    }

    public WebElement checkOutShop(){

        return checkOutShop;
    }
}
