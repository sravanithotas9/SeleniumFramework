import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Actions_DoubleClick {

    public static void main(String[] args)throws InterruptedException {
        System.setProperty ( "Webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\Demo\\src\\drivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        // main window will be open here
        driver.get ( "http://omayo.blogspot.com/" );
        driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().implicitlyWait ( 1, TimeUnit.SECONDS );

        WebElement searchboxfield = driver.findElement ( By.name ( "q" ) );
        searchboxfield.sendKeys ("test1");
        Actions a = new Actions ( driver );
        Thread.sleep ( 2000 );
        //double click is to select the text by clicking double it is selcted in blue print

        a.doubleClick ( searchboxfield ).perform ();
       // driver.quit ();
    }
}
