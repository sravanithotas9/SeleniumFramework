package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {

    public WebDriver driver;
    public Properties prop;

    /**
     * Initialize the driver
     *
     * @return driver returns the web driver
     * @throws IOException IOException
     */
    public WebDriver initializeDriver() throws IOException {

        loadProperties ();
        String browserName = prop.getProperty ( "browser" );
        switch ( browserName ) {
            case "chrome":
                WebDriverManager.chromedriver ().setup ();
                driver = new ChromeDriver ();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver ().setup ();
                driver = new FirefoxDriver ();
                break;
            case "IE":
                WebDriverManager.edgedriver ().setup ();
                driver = new InternetExplorerDriver ();
                break;
            default:
                System.out.println ( "No browser is defined" );
        }
        setDriverInDriverFactoryClassAndAssignItToGlobalDriver ();
        driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().implicitlyWait ( 10, TimeUnit.SECONDS );
        return driver;
    }


    /**
     * Loads the properties file
     *
     * @throws IOException Throws IOException
     */
    private void loadProperties() throws IOException {
        prop = new Properties ();
        String propPath = System.getProperty ( "user.dir" ) + "\\src\\main\\java\\resources\\data.properties";
        FileInputStream file = new FileInputStream ( propPath );
        prop.load ( file );
    }

    /**
     * Setting the current launched driver in DriverFactory class for singleton desi
     * Assigning the driver instance (which was just set above) from DriverFactory class to global web driver.
     */
    private void setDriverInDriverFactoryClassAndAssignItToGlobalDriver() {
        DriverFactory.getInstance ().setDriver ( driver );
        driver = getDriver ();
    }

    /**
     * Capture screenshot of the browser.
     *
     * @param screenShotName name of the screenshot file
     * @param driver         Pass the web driver instance of test
     * @return
     */
    public String takeScreenshot(String screenShotName, WebDriver driver) throws IOException {
        File src = ((TakesScreenshot) driver).getScreenshotAs ( OutputType.FILE );
        String dest = System.getProperty ( "user.dir" ) + "\\screenshot\\" + screenShotName + ".png";
        FileUtils.copyFile ( src, new File ( dest ) );
        return dest;
    }

    /**
     * Gets current date and time
     *
     * @return current date and time formatted string
     */
    public String getTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern ( "_MM_dd_yyyy_HH_mm_ss" );
        LocalDateTime now = LocalDateTime.now ();
        return dtf.format ( now );
    }


    /**
     * Gets web driver from Driver factory class (single instance of driver as per Singleton design)
     *
     * @return web driver
     */

    public WebDriver getDriver() {
        return DriverFactory.getInstance ().getDriver ();
    }
}

