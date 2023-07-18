import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Handling_Calender {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty ( "Webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\Demo\\src\\drivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        // main window will be open here
        driver.get ( "https://www.makemytrip.com/" );
        driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().implicitlyWait ( 1, TimeUnit.SECONDS );
        WebElement logo = driver.findElement ( By.cssSelector ( "img[alt='Make My Trip']" ) );
        Thread.sleep ( 2000 );
        driver.findElement ( By.xpath ( "//label[@for='departure']" ) ).click ();
        int i = 0;
        while (i < 6) {

            Thread.sleep ( 6000 );
            driver.findElement ( By.xpath ( "//span[@aria-label='Next Month']" ) ).click ();
            i++;
        }
        // to find out decemeber month xpath of december ( "//div[contains(text(),'December 2023')]" ) );
        //then to find the days xpath then combine both to find out days for 31 december or else nov+dec 61 days will follows


        List<WebElement> days = driver.findElements ( By.xpath ( "//div[contains(text(),'December 2023')]" +
                "/following::div[@class='DayPicker-Day']" ) );

        for (int j = 0; j < days.size (); j++) {

            if (days.get(j).getText().equalsIgnoreCase ("20" )) {

                days.get ( j ).click ();

                break;
            }

        }


    }
}


