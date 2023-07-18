import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    public static void main(String args[]) {

        System.setProperty ( "webdriver.chrome.driver", "C:\\test\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        driver.get ( "http://www.google.com/" );
        driver.manage ().window ().maximize ();
        WebElement search = driver.findElement (By.xpath ("//textarea[@name='q']"));
        search.sendKeys ( "I love you " );
        driver.close ();

    }
}