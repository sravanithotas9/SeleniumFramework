package features;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Omayo {
    WebDriver driver;
    @Given("^I navigate to application URL$")
    public void i_navigate_to_application_URL(){
        // WebDriverManger.chromedriver.setup();
        driver = new ChromeDriver ();
        driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().implicitlyWait ( 10, TimeUnit.SECONDS );
        driver.get ( "http://omayo.blogspot.com/" );

    }
    @When ( "^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\" into the fields$")
    public void i_enter_Username_as_someusername_and_Password_as_somepassword_into_the_fields(String username,String password){

        driver.findElement(By.name ( "userid" )).sendKeys ( username );
        driver.findElement(By.name ( "pswrd" )).sendKeys ( password );

    }
    @And ( "^I click on Login button$")
    public void  i_click_on_Login_button(){
        driver.findElement(By.cssSelector ( "input[value='Login']" )).click ();

    }
    @Then ("^User should be able to login based on \"([^\"]*)\" login status$")
    public  void user_should_be_able_to_login_based_on_expected_login_status(String expectedResults){

        Alert alert= driver.switchTo ().alert ();
        String actualResult = null;
        if(alert.getText ().contains ( "Error Password or Username" )){

            actualResult ="failure";

        }
        Assert.assertEquals (expectedResults,actualResult );

    }
}
