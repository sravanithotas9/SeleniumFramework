package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    WebDriver driver;

    public  CartPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements ( driver,this );
    }

    @FindBy(id="button-cart")
    private WebElement addToCart;

    @FindBy(id="cart-total")
    private WebElement items;

    @FindBy(xpath ="//strong[normalize-space()='Checkout']" )
    private WebElement checkout;



    public WebElement addToCart(){

        return addToCart;
    }

    public WebElement items(){

        return items;
    }

    public WebElement checkout(){

        return checkout;
    }





}
