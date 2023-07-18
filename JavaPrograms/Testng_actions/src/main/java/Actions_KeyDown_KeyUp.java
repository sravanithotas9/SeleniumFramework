import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Actions_KeyDown_KeyUp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty ( "Webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\Demo\\src\\drivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        // main window will be open here
        driver.get ( "http://omayo.blogspot.com/" );
        driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().implicitlyWait ( 1, TimeUnit.SECONDS );

        WebElement Compendiumdev = driver.findElement ( By.linkText ( "compendiumdev" ) );

        Actions a = new Actions ( driver );
        Thread.sleep ( 3000 );
        //keyDown is for hold the key and keyUp is for release the key
        //this key actions will perform open in the new tab without the keys

        a.keyDown ( Keys.CONTROL ).click ( Compendiumdev ).perform ();

        a.keyUp ( Keys.CONTROL ).click ().build ().perform ();

    }
}
