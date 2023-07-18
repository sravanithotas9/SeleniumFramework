import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class MoreWindowHandlings {
    public static void main(String[] args) {
        System.setProperty ( "Webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\Demo\\src\\drivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        // main window will be open here
        driver.get ( "http://omayo.blogspot.com/" );
        driver.manage ().window ().maximize ();
        //first child window will be open here
        driver.findElement ( By.linkText ( "Open a popup window" ) ).click ();
        //second child window will be open here
        driver.findElement ( By.linkText ( "Blogger" ) ).click ();

        Set<String> windowids = driver.getWindowHandles ();

        Iterator<String> itr = windowids.iterator ();
        String ParaTextOnPopupWindow = null;

        while (itr.hasNext ()) {
            String windowid = itr.next ();
            driver.switchTo ().window ( windowid );
            if (driver.getTitle ().equals ( "Basic Web Page Title" )) {
                ParaTextOnPopupWindow = driver.findElement ( By.id ( "para1" ) ).getText ();
                System.out.println (ParaTextOnPopupWindow);
            }
            driver.close ();

        }
    }
}
