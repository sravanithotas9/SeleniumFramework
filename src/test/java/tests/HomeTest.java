package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.CartPage;
import pageobjects.HomePage;
import pageobjects.SearchPage;
import pageobjects.ShoppingPage;
import utilities.Base;

import java.io.IOException;

public class HomeTest extends Base {
    WebDriver driver;
    Logger log;

    @Test
    public void verifyHome() {
        HomePage homepage = new HomePage ( driver );
        homepage.searchBox ().sendKeys ( "iphone" );
        log.debug ( "iphone Entered" );
        homepage.amplifier ().click ();
        log.debug ( "Clicked on amplifier Button" );

        SearchPage searchPage = new SearchPage ( driver );
        searchPage.iphoneImg ().click ();
        log.debug ( "iphoneImg Entered" );

        CartPage cartPage = new CartPage ( driver );
        cartPage.addToCart ().click ();
        log.debug ( "Clicked on addTo Cart Button" );
        cartPage.items ().click();
        log.debug ( "Clicked on items Button" );
        cartPage.checkout ().click ();
        log.debug ( "Clicked on checkout Button" );

        ShoppingPage shoppingpage = new ShoppingPage ( driver );
        shoppingpage.shoppingCart ().isDisplayed ();
        log.debug ( "shoppingCart is displayed" );
        shoppingpage.checkOutShop ().click ();
        log.debug ( "Clicked on checkoutshop Button" );
        }


    @BeforeMethod
    public void openApplication() throws IOException {

        log = LogManager.getLogger ( HomeTest.class.getName () );

        driver= initializeDriver();
        log.debug ( "Browser got Launched" );

        driver.get ( prop.getProperty ("url") );
        log.debug ( "Navigated to Application URL");

    }

    @AfterMethod
    public void closure(){
        driver.close ();
        log.debug("Browser got closed and end of the Execution" );
    }
}
