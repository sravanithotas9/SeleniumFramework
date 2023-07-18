package utilities;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
    private static final DriverFactory instance = new DriverFactory ();

    public static DriverFactory getInstance() {
        return instance;
    }
    ThreadLocal<WebDriver> driver = new ThreadLocal<> ();

    public WebDriver getDriver() {
        return driver.get ();
    }

    public void setDriver(WebDriver driver) {
        this.driver.set ( driver );
    }

    public void closeBrowser() {
        driver.get ().close ();
        driver.remove ();
    }
}
