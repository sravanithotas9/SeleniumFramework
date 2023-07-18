import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Browser {
    public static void main(String[] args) {
        String browser = "chrome";
       WebDriver driver = null;
        if (browser.equalsIgnoreCase ( "chrome" )) {
            System.setProperty ( "Webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\Demo\\src\\drivers\\chromedriver.exe" );


            driver = new ChromeDriver ();
        } else if (browser.equalsIgnoreCase ( "firefox" )) {
            System.setProperty ( "Webdriver.gecko.driver", "C:\\Users\\Admin\\IdeaProjects\\Demo\\src\\drivers\\geckodriver.exe" );
            driver = new FirefoxDriver ();
        }

        driver.get ( "http://omayo.blogspot.com/" );

        driver.manage ().window ().maximize ();
        List<WebElement> elements = driver.findElements ( By.tagName ( "a" ) );
        for (WebElement a : elements) {
            if (a.getText ().length () > 0) {
                System.out.println ( a.getText () );
            }
        }
        driver.close ();

    }
}
