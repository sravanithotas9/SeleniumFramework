package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.AccountCreated;
import pageobjects.LandingPage;
import pageobjects.RegisterAccountPage;
import utilities.Base;

import java.io.IOException;

public class RegisterTest extends Base {

    Logger log;

    @BeforeMethod
    public void openApplication() throws IOException {
        log = LogManager.getLogger ( RegisterTest.class.getName () );
        driver = initializeDriver ();
        log.debug ( "Browser got Launched" );
        driver.get ( prop.getProperty ( "url" ) );
        log.debug ( "Navigated to Application URL");

    }



    @Test
    public void verifyRegistration() {

        LandingPage landingpage = new LandingPage ( driver );
        landingpage.myAccountDropdown ().click ();
        log.debug ( "Clicked on My Account Dropdown" );
        landingpage.registerOption ().click ();
        log.debug ( "Clicked on Login Option" );

        RegisterAccountPage registerAccountPage = new RegisterAccountPage ( driver );
        registerAccountPage.firstName ().sendKeys ( prop.getProperty ( "firstName" ) );
        log.debug ( " FirstName got Entered" );
        registerAccountPage.lastName ().sendKeys ( prop.getProperty ( "lastName" ) );
        log.debug ( " LastName got Entered" );
        registerAccountPage.email ().sendKeys ( prop.getProperty ( "email" ) );
        log.debug ( "Email Address got Entered" );
        registerAccountPage.telephone ().sendKeys ( prop.getProperty ( "telephone" ) );
        log.debug ( "Telephone Number got Entered" );
        registerAccountPage.password ().sendKeys ( prop.getProperty ( "password" ) );
        log.debug ( "Password got Entered" );
        registerAccountPage.passwordConfirm ().sendKeys ( prop.getProperty ( "passwordConfirm" ) );
        log.debug ( "Password Confirm got Entered" );
        registerAccountPage.enableButton ().click ();
        log.debug ( "Clicked on Enable Button" );
        registerAccountPage.continueButton ().click ();
        log.debug ( "Clicked on  Continue Button" );

        AccountCreated accountCreated = new AccountCreated ( driver );

        try {
            /*boolean isAccountCreatedMessageDisplayed = accountCreated.yourAccount ().isDisplayed ();
            Assert.assertTrue ( isAccountCreatedMessageDisplayed );*/
            //  Reporter.log ("Your account is created element is displayed");

            String yourAccountText = accountCreated.yourAccount ().getText ();
            Assert.assertEquals ( yourAccountText, "Your Account Has been created!" );
            log.error ( "Login Test Got Failed" );

            // Reporter.log ("Your account is created text is validated : " + yourAccountText);

        } catch (Exception e) {
            System.out.println ( e.getMessage () );

        }
        accountCreated.continueBtn ().click ();
    }



    @AfterMethod
    public void closure() {

        driver.close ();
        log.debug("Browser got closed and end of the Execution" );
    }
}



