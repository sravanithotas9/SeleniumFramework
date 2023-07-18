import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Lightbox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty ( "Webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\Demo\\src\\drivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        // main window will be open here
        driver.get ( "http://omayo.blogspot.com/p/lightbox.html" );
        driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().implicitlyWait ( 5, TimeUnit.SECONDS );
        driver.findElement ( By.id ( "lightbox1" ) ).click ();
        Thread.sleep(3000);
       // driver.findElement ( By.xpath ( "//span[@class='close cursor']" ) ).click ();
        //driver.findElement ( By.cssSelector ("[class='close cursor']" )).click();
        //here in css id = # and class = . is used
        //here when space is between element name when we inspect we can use . in between of the element name in css path
        //we can use xpath,css any of the above
        //this .close.cursor is used for close the lightbox button...inspect on x and write the element
        driver.findElement ( By.cssSelector (".close.cursor")).click();
    }
}
