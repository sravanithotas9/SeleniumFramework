import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ImplicityExplicity {
    public static void main(String[] args) {
        System.setProperty ( "Webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\Demo\\src\\drivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        // main window will be open here
        driver.get ( "http://omayo.blogspot.com/" );
        driver.manage ().window ().maximize ();
        //selenium implicityWait() - Gobal Wait
        driver.manage ().timeouts ().implicitlyWait ( 3, TimeUnit.SECONDS );
        //we mention 3 sec but droptn will display in 0 sec
        driver.findElement ( By.className ( "dropbtn" )).click ();
        //30 sec Wait time - ExplicityWait()
        WebDriverWait  wait= new WebDriverWait (driver, Duration.ofSeconds (5));
        WebElement facebookElement = wait.until( ExpectedConditions.visibilityOfElementLocated (By.linkText ("Facebook"   )) );

        facebookElement.click ();
        driver.quit ();

    }
}
