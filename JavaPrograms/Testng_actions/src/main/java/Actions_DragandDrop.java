import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Actions_DragandDrop {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty ( "Webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\Demo\\src\\drivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        // main window will be open here
        driver.get ( "http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html" );
        driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().implicitlyWait ( 1, TimeUnit.SECONDS );

        WebElement oslo = driver.findElement ( By.id ( "box1" ) );
        WebElement UnitedStates = driver.findElement ( By.id ( "box103" ) );

        WebElement Washington= driver.findElement ( By.id ( "box3" ) );
        WebElement Spain = driver.findElement ( By.id ( "box107" ) );

        Actions a = new Actions ( driver );
        Thread.sleep ( 2000 );

        a.dragAndDrop (  oslo, UnitedStates ).perform ();
        Thread.sleep ( 2000 );
        a.dragAndDrop (Washington,Spain).perform ();

    }
}
