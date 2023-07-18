import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

public class Actions_perform_click_build {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty ( "Webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\Demo\\src\\drivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        // main window will be open here
        driver.get ( "http://omayo.blogspot.com/" );
        driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().implicitlyWait ( 1, TimeUnit.SECONDS );
        WebElement blogmenu = driver.findElement ( By.id ( "blogsmenu" ) );
        WebElement selenium143 = driver.findElement ( By.xpath ( "//a/span[text()='Selenium143']" ) );
        Actions a = new Actions(driver);
        a.moveToElement ( blogmenu ).perform ();
        Thread.sleep ( 2000 );
        //when we are using multiple operations build() should be used if it is single perform is used
        a.moveToElement (selenium143).click (selenium143).build ().perform ();
        //this is combined with above one to minimise the code
        //a.moveToElement ( selenium143 ).click ();
         driver.quit ();
    }


}
