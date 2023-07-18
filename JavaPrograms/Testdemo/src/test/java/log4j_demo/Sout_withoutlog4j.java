package log4j_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Sout_withoutlog4j {
    public static void main(String[] args) {
        System.out.println ("Demo test execution has started");
        WebDriver driver = new ChromeDriver ();
        System.out.println ("chrome browser got launched");
        driver.manage ().window ().maximize ();
        System.out.println ("browser got maximised");
        driver.manage ().timeouts ().implicitlyWait ( 1, TimeUnit.SECONDS );
        driver.get( "http://omayo.blogspot.com/" );
        System.out.println ("navidate to omayo application");
        driver.findElement ( By.linkText ("compendiumdev") ).click ();
        System.out.println ("Clicked on Compendiumdev link and navigated to Compendiumdev page");
        driver.navigate ().back ();
        System.out.println ("navigated backward to Omayo application");
        driver.navigate ().forward ();
        System.out.println ("navigated forward to Compendiumdev application");
        if(driver.getTitle ().equals ( "Basic Web Page Title" )){
            System.out.println ("success: The correct page Title got displayed");

        }else{
            System.out.println ("Failed: Wrong Title got displayed");

        }
        driver.close();
        System.out.println ("Browser got closed and end of the Execution");
    }
}
