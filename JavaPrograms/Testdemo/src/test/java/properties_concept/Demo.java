package properties_concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[] args) throws IOException, InterruptedException {

        Properties prop=new Properties();
        FileInputStream file = new FileInputStream ( "data.properties" );
        prop.load ( file );
        Thread.sleep ( 3000 );

        WebDriver driver = new ChromeDriver ();
        driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().implicitlyWait ( 1, TimeUnit.SECONDS );
        Thread.sleep ( 5000 );
        driver.get( prop.getProperty ("url") );
        Thread.sleep ( 2000 );
        driver.findElement ( By.xpath("//input[@id='input-email']")).sendKeys ( prop.getProperty ("email") );
        Thread.sleep ( 2000 );
        driver.findElement ( By.xpath("//input[@id='input-password']")).sendKeys ( prop.getProperty ("password") );
        Thread.sleep ( 2000 );
        driver.findElement ( By.xpath("//input[@value='Login']")).click ( );

    }
}
