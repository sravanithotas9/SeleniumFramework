package testclassess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pageclassess.Loginpage;
import pageclassess.MyAccountPage;


import java.util.concurrent.TimeUnit;

public class LoginTest {
    WebDriver driver;

   @Test
    public void login() {

        //WebDriverManger.chromedriver.setup();
        driver = new ChromeDriver ();
        driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().implicitlyWait ( 1, TimeUnit.SECONDS );
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

        Loginpage loginpage=new Loginpage (driver);

       loginpage.emailField().sendKeys ( "arun.selenium132@gmail.com" );
       loginpage.passwordField().sendKeys ( "second@123" );
       loginpage.loginButton().click();

       MyAccountPage myAccountPage=new MyAccountPage (driver );

       Assert.assertTrue (myAccountPage.accountBreadCrumb ().isDisplayed());
   }
    @AfterMethod
    public void closure(){
       driver.close();
    }
}
