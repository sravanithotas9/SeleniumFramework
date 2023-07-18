package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.AccountPage;
import pageobjects.LandingPage;
import pageobjects.LoginPage;
import utilities.Base;

import java.io.IOException;

public class LoginTest extends Base {
    WebDriver driver;
    Logger log;

    @BeforeMethod
    public void openApplication() throws IOException {


        log = LogManager.getLogger ( LoginTest.class.getName () );
        driver = initializeDriver ();

        log.debug ( "Browser got Launched" );
        driver.get ( prop.getProperty ( "url" ) );

        log.debug ( "Navigated to Application URL");

    }

    @Test(dataProvider = "getLoginData")
    public void login(String email, String password) {

        LandingPage landingpage = new LandingPage ( driver );

        landingpage.myAccountDropdown ().click ();
        log.debug ( "Clicked on My Account Dropdown" );
        landingpage.loginOption ().click ();
        log.debug ( "Clicked on Login Option" );

        LoginPage loginpage = new LoginPage ( driver );

        //loginpage.emailAddress().sendKeys ( prop.getProperty ("email") );
        //loginpage.password ().sendKeys ( prop.getProperty ("password") );

        loginpage.emailAddress ().sendKeys ( email );
        log.debug ( "Email Address got Entered" );
        loginpage.password ().sendKeys ( password );
        log.debug ( "Password got Entered" );
        loginpage.loginButton ().click ();
        log.debug ( "Clicked on Login Button" );

        AccountPage accountpage = new AccountPage ( driver );

        //instead of writting try catch u can write as sout
        // System.out.println (accountpage.editAccountInformation ().isDisplayed ());


        try {
            String editAccountInformation = accountpage.editAccountInformation ().getText ();
            Assert.assertEquals ( editAccountInformation, "Edit your account information" );
            log.info ( "Login Test Got Passed" );

        } catch (Exception e) {

            System.out.println ( e.getMessage () );
        }


        //Assert.assertTrue (accountpage.editAccountInformation ().isDisplayed ());
    }



    @AfterMethod
    public void closure() {

        driver.close ();
        log.debug("Browser got closed and end of the Execution" );
    }

    //if multiple user name we can use dataprovider instead of data properties
    @DataProvider
    public Object[][] getLoginData() {
        Object[][] data = {{"arun.selenium132@gmail.com", "second@123"}, {"dummy@test.com", "second354"}};
        return data;
    }
}
