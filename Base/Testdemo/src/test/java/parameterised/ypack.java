package parameterised;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

public class ypack {

    @Parameters( {"URL"})
    @Test
    public  void testA(String url) throws InterruptedException {
        System.out.println ("testone Test of classone got executed");

        //WebDriverManger.chromedriver.setup();
        WebDriver driver = new ChromeDriver ();
        driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().implicitlyWait ( 1, TimeUnit.SECONDS );
        Thread.sleep ( 5000 );
        driver.get ( url);
        Thread.sleep ( 2000 );
    }
    @Parameters({"URL"})
 @Test
    public void testB(String url) throws InterruptedException {
        System.out.println ("testtwo Test of classtwo got executed");
        WebDriver driver = new ChromeDriver ();

        driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().implicitlyWait ( 1, TimeUnit.SECONDS );
        driver.get ( url);
        Thread.sleep ( 2000 );
    }
 @Parameters({"URL"})
   @Test
    public  void testC(String url) throws InterruptedException {
        System.out.println ("testthree Test of classthree got executed");
        WebDriver driver = new ChromeDriver ();
        driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().implicitlyWait ( 1, TimeUnit.SECONDS );
        driver.get ( url);
        Thread.sleep ( 2000 );
    }
}