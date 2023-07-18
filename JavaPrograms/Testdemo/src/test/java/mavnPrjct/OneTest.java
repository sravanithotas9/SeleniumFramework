package mavnPrjct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OneTest {
    //to close the browser after test competion is usefull we hav eto close every browser every test is finished because
    //at a time we use lot of browsers we have to immediate the browser is finishe if one of the test fails then
    //it will not perform the driver.close() operation because of above test fails so browsers remain open instead of closing
    //so here we created webdriver driver as global statement to perform the aftermethod test as driver.close() if above test fails.
    WebDriver driver;
    @Test
    public void one() throws InterruptedException {
       // WebDriverManger.chromedriver.setup();
        driver = new ChromeDriver ();
        driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().implicitlyWait ( 10, TimeUnit.SECONDS );
        Thread.sleep ( 5000 );
        driver.get ( "http://omayo.blogspot.com/" );

        Thread.sleep ( 2000 );
       String actualText= driver.findElement ( By.id ( "pah" ) ).getText ();
        Assert.assertEquals ( actualText,"PracticeAutomationHere");

    }
    @AfterMethod
    public void sec(){
        driver.close();
    }
}
