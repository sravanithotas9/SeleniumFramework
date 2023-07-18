package log4j_demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Log4j {
    public static void main(String[] args) {

        Logger log = LogManager.getLogger (Log4j.class);
        log.debug("Demo test execution has started");
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        log.debug ("chrome browser got launched");
        driver.manage ().window ().maximize ();
        log.debug ("browser got maximised");
        driver.manage ().timeouts ().implicitlyWait ( 1, TimeUnit.SECONDS );
        driver.get( "http://omayo.blogspot.com/" );
        log.debug("navigated to omayo application");
        driver.findElement ( By.linkText ("compendiumdev") ).click ();
        log.debug("Clicked on Compendiumdev link and navigated to Compendiumdev page");
        driver.navigate ().back ();
        log.debug("navigated backward to Omayo application");
        driver.navigate ().forward ();
        log.debug("navigated forward to Compendiumdev application");
        if(driver.getTitle ().equals ( "Basic Web Page Title" )){
            log.info ("success: The correct page Title got displayed");

        }else{
          log.error("Failed: Wrong Title got displayed");

        }
        driver.close();
         log.debug("Browser got closed and end of the Execution");
    }
}

