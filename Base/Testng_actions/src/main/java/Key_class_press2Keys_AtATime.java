import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Key_class_press2Keys_AtATime {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty ( "Webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\Demo\\src\\drivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        // main window will be open here
        driver.get ( "http://omayo.blogspot.com/" );
        driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().implicitlyWait ( 15, TimeUnit.SECONDS );
        //Handling Alerts
        driver.findElement ( By.id ( "ta1" ) ).sendKeys ( "Arun Mootri" );
        //here chord is for holding  the key control and press the key z to undo here two keys are using key.control and z keys
        Thread.sleep ( 3000 );
        driver.findElement ( By.id ( "ta1" ) ).sendKeys ( Keys.chord ( Keys.CONTROL, "z" ) );
        Thread.sleep ( 3000 );
        driver.close ();


    }
}
