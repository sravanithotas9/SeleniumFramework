import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SelectMultiSelectionBox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty ( "Webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\Demo\\src\\drivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        // main window will be open here
        driver.get ( "http://omayo.blogspot.com/" );
        driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().implicitlyWait ( 15, TimeUnit.SECONDS );
        Thread.sleep ( 3000 );
        WebElement MultiSelectionField= driver.findElement ( By.id ("multiselect1") );
        Select select = new Select ( MultiSelectionField );
        //select.selectByIndex (3);
        select.selectByVisibleText ( "Audi" );
        select.selectByVisibleText ( "Volvo");
        select.selectByVisibleText ( "Hyundai" );
        Thread.sleep ( 3000 );
        select.deselectByVisibleText ( "Hyundai" );
        Thread.sleep(3000);
        driver.quit ();
    }

}


