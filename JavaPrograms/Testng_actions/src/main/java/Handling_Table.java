import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Handling_Table {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty ( "Webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\Demo\\src\\drivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        // main window will be open here
        driver.get ( "http://omayo.blogspot.com/" );
        driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().implicitlyWait ( 15, TimeUnit.SECONDS );
        //tr is of no of row
        //td is for no of columns
        //th is for whole table
        //tr[1]//th is for headings row in table will retrive
        // tr[1]//td 1st row will displayed
        //tr[3]//td[2] is of third row second column will be printed

        /*String names = "praveen";
        List<WebElement> name = driver.findElements ( By.xpath ( "//table[@id='table1']//td[1]" ) );
        int j= 0;
        Thread.sleep ( 3000 );

        for (int i = 0; i < name.size (); i++) {
            if (name.get ( i ).getText ().equals ( "names" )) {
                j = i;
            }

        }
        Thread.sleep ( 3000 );
        String path = "//table[@id='table1']//tr[" + (j+1) + "]//td[3]";
        Thread.sleep ( 6000 );
        System.out.println ( driver.findElement( By.xpath ( "path" ) ).getText () );*/

        Thread.sleep ( 6000 );
        //to find no of columns
        System.out.println (driver.findElements( By.xpath ( "//table[@id='table1']//tbody//tr" ) ).size());
        System.out.println (driver.findElements( By.xpath ( "//table[@id='table1']//tbody//tr[1]//td" ) ).size());

          driver.quit ();
    }
}