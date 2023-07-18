import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Actions_DragandDropBy {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty ( "Webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\Demo\\src\\drivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        // main window will be open here
        driver.get ( "http://omayo.blogspot.com/p/page3.html" );
        driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().implicitlyWait ( 1, TimeUnit.SECONDS );

        WebElement minprice = driver.findElement ( By.xpath ( "//a[@aria-labelledby='price-min-label']" ) );

        Actions a = new Actions ( driver );
        Thread.sleep ( 2000 );

       a.dragAndDropBy ( minprice,100,0 ).perform ();
       Thread.sleep ( 2000 );
       a.dragAndDropBy ( minprice,-200,0 ).perform ();
       driver.quit ();

    }
}
