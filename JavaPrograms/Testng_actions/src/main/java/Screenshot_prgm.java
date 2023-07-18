import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Screenshot_prgm {
    public static void main(String[] args) throws IOException {
       System.setProperty ("Webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\Demo\\src\\drivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        // main window will be open here
        driver.get ( "http://omayo.blogspot.com/" );
        driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().implicitlyWait ( 1, TimeUnit.SECONDS );

        //take screenshot

        File src =((TakesScreenshot)driver).getScreenshotAs ( OutputType.FILE );
        //dest is a new file it is created for taken screenshot
        File dest = new File ( "src/main/java/screenshot/test.png" );
        //the taken screenshot is copied from src to dest file and it is saved means it is overloaded from src to dest
        FileUtils.copyFile (src, dest);
        driver.findElement ( By.linkText ("testwisely") ).click ();

        //screenshot2
        File src1 =((TakesScreenshot)driver).getScreenshotAs ( OutputType.FILE );
        File dest1 = new File ( "src/main/java/screenshot/test1.png" );
        FileUtils.copyFile (src1, dest1);




    }
}
