import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Actions_SendKeys {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty ( "Webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\Demo\\src\\drivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        // main window will be open here
        driver.get ( "http://omayo.blogspot.com/" );
        driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().implicitlyWait ( 1, TimeUnit.SECONDS );
        Actions a = new Actions ( driver );
        WebElement Usernamefield = driver.findElement ( By.name ( "userid" ) );
        Thread.sleep ( 2000 );
        Usernamefield.sendKeys ( "test1" );
        a.sendKeys ( Keys.TAB ).perform ();
        WebElement psswrd= driver.findElement ( By.name ( "pswrd" ) );
        Thread.sleep ( 3000 );
        psswrd.sendKeys("1234");
        //keyUp is for release the key instead of using keyUp but we can use Sendkeys is more useable
        a.sendKeys ( Keys.TAB ).perform ();
        a.sendKeys ( Keys.ENTER ).perform ();
        Thread.sleep ( 3000 );
        driver.switchTo ().alert ().accept ();



    }
}
