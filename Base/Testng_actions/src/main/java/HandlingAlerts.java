import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HandlingAlerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty ( "Webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\Demo\\src\\drivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        // main window will be open here
        driver.get ( "http://omayo.blogspot.com/" );
        driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().implicitlyWait ( 15, TimeUnit.SECONDS );

        //Handling Alerts
        driver.findElement ( By.id ("alert1" ) );
        Thread.sleep ( 3000 );
         Alert alert = driver.switchTo ().alert ();
         //getText will display hello messege
         String textDisplayOnAlert = alert.getText ();
        System.out.println (textDisplayOnAlert);
        //after displaying text hello messege we have accept ok button so that accept() is used
        alert.accept ();
        Thread.sleep ( 3000 );
        driver.quit ();


    }
}
