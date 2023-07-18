import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Auto_Suggestive_DropDowns {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty ( "Webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\Demo\\src\\drivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        // main window will be open here
        driver.get ( "https://www.makemytrip.com/" );
        driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().implicitlyWait ( 1, TimeUnit.SECONDS );
        WebElement logo = driver.findElement ( By.cssSelector ( "img[alt='Make My Trip']" ) );
        Thread.sleep ( 2000 );

        Actions a = new Actions ( driver );
        a.moveToElement ( logo ).click ().perform ();

        driver.findElement ( By.cssSelector ( "label[for='fromCity']" ) ).click ();

        driver.findElement ( By.cssSelector ( "input[placeholder='From']" ) ).sendKeys ( "sa" );

        int i = 0;
        while (i < 4) {
            Thread.sleep ( 2000 );
            driver.findElement ( By.cssSelector ( "input[placeholder='From']" ) ).sendKeys ( Keys.DOWN );
            i++;
        }

        driver.findElement ( By.cssSelector ( "input[placeholder='From']" ) ).sendKeys ( Keys.ENTER );

    }



    }
