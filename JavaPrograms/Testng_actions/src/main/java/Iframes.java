import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Iframes {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty ( "Webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\Demo\\src\\drivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        // main window will be open here
         driver.get ( "http://omayo.blogspot.com/" );
        driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().implicitlyWait ( 1, TimeUnit.SECONDS );
        WebElement iframe2 = driver.findElement ( By.id ( "iframe1" ) );
        Thread.sleep ( 2000 );
      /* driver.switchTo ().frame ( iframe2 );
       driver.findElement ( By.name ( "userid" ) ).sendKeys ( "sravani" );*/
        //switchto new window.....defaultContent means back to main window
        driver.switchTo ().defaultContent ();
        Thread.sleep ( 3000 );
        driver.findElement ( By.xpath ( "//*[@id=\"ta1\"]" )).sendKeys ( "test" );
        driver.switchTo ().defaultContent ();
        driver.findElement ( By.name ( "q" )).sendKeys ( "test3" );
        driver.findElement ( By.id ( "alert1" )).click ( );
        Thread.sleep ( 3000 );
        driver.switchTo ().alert ().accept ();


    }



}
