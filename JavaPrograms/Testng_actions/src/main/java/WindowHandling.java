import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandling extends Browser {
    public static void main(String[] args) {
        System.setProperty ( "Webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\Demo\\src\\drivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();

        driver.get ( "http://omayo.blogspot.com/" );
        driver.manage ().window ().maximize ();
        driver.findElement ( By.linkText ( "Open a popup window" ) ).click ();

        Set<String> windowids = driver.getWindowHandles ();

        Iterator<String> itr = windowids.iterator ();

/*
        //here every window is having a unique id and it is called as sessions
        // here unique ids is printed

        while (itr.hasNext ()) {
            String windowid = itr.next ();
            System.out.println ( windowid );
*/
        String mainwindowid = itr.next ();
       String childwindowid = itr.next ();
       //we switched the focus of selenium to child window
       driver.switchTo ().window(childwindowid);
       //after switching to child window gettext of child window will works and text will provided
       String firstparaOnwindow=driver.findElement ( By.id("para1") ).getText ();
        System.out.println (firstparaOnwindow);
        driver.close ();
        driver.switchTo ().window(mainwindowid);
        driver.close ();
        }
    }
