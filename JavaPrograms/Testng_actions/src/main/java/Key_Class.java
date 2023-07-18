import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Key_Class {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty ( "Webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\Demo\\src\\drivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        // main window will be open here
        driver.get ( "https://tutorialsninja.com/demo/index.php?route=account/login" );
        driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().implicitlyWait ( 1, TimeUnit.SECONDS );
        driver.findElement ( By.id ( "input-email" ) ).sendKeys ( "arun.selenium@gmail.com" );
        driver.findElement ( By.id ( "input-password" ) ).sendKeys ( "second@123" );

      /*  Actions a= new Actions ( driver );
        a.sendKeys ( Keys.ENTER).perform ();*/
        //Instead of Action class perform we can use Same element sendkeys enter no need of action class
        //sendkeys is a webelement we use to send text in the blog

        driver.findElement ( By.id ( "input-password" ) ).sendKeys ( Keys.ENTER );

    }

    }
