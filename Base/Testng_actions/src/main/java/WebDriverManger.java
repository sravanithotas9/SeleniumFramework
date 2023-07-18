import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverManger {
    public static void main(String[] args) throws InterruptedException {
      //  WebDriverManger.chromeDriver ().setup();
      //  System.setProperty ( "Web driver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\Demo\\src\\drivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        // main window will be open here
        System.out.println ("1");
        driver.get ( "https://tutorialsninja.com/demo/" );
        driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().implicitlyWait ( 5, TimeUnit.SECONDS );
        //navitage to Login page
        System.out.println ("2");
        driver.findElement ( By.xpath ( "//a[@title='My Account']" ) ).click ();
        driver.findElement ( By.linkText ( "Login" ) ).click();
        //login to the application with valid credentials
        Thread.sleep ( 3000 );
        System.out.println ("3");
        driver.findElement ( By.id ( "input-email") ).sendKeys ( "arun.selenium1@gmail.com" );
        driver.findElement (By.id ( "input-password" )).sendKeys ( "second@123" );
        //click login button
        Thread.sleep ( 2000 );
        System.out.println ("4");
        driver.findElement ( By.cssSelector ( "input[type='submit']" ) ).click ();
        driver.findElement ( By.cssSelector ( "ul[class='breadcrumb']" ) ).isDisplayed ();
        //search bar type iphone
        Thread.sleep ( 2000);
        System.out.println ("5");
        driver.findElement ( By.cssSelector ( "input[type='text']" ) ).sendKeys ( "iphone" );
        driver.findElement ( By.cssSelector ( "button[class='btn btn-default btn-lg']" ) ).click ();
        driver.findElement ( By.xpath ( "//img[@class='img-responsive']" ) ).click ();
        driver.findElement ( By.id ( "input-quantity" ) ).clear ();
        driver.findElement ( By.id ( "input-quantity" ) ).sendKeys ( "2" );
        System.out.println ("6");
        driver.findElement ( By.id ( "button-cart" ) ).click ();
        driver.findElement ( By.id ( "cart-total" ) ).click ();
        System.out.println (driver.findElement ( By.xpath ( "//div[@class='alert alert-success alert-dismissible']" ) ).isDisplayed ());

        Thread.sleep ( 3000 );
        System.out.println ("7");
        driver.findElement ( By.xpath ( "(//a[contains(@href,'checkout/cart')])[last()]" ) ).click ();
        driver.findElement ( By.xpath ("//input[contains(@name,'quantity')]" ) ).clear ();
        driver.findElement ( By.xpath ("//input[contains(@name,'quantity')]" ) ).sendKeys ( "2" );

        driver.findElement ( By.xpath ("//button[@data-original-title='Update']" ) ).click ();

        //driver.findElement ( By.id ( "button-cart" ) ).click ();
        Thread.sleep ( 3000 );
        System.out.println ("8");
        driver.findElement ( By.xpath ( "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']" ) ).click ();
        driver.findElement ( By.xpath ( "//*[@class='text-right']//*[@class='fa fa-shopping-cart']" ) ).click ();
        driver.findElement ( By.xpath ( "//a[@class='btn btn-primary']" ) ).click ();
        Thread.sleep ( 3000 );
        System.out.println ("9");
        System.out.println (driver.findElement ( By.xpath ( "//div[@class='alert alert-danger alert-dismissible']" ) ).isDisplayed ());
        driver.findElement ( By.xpath ( "//a[@class='btn btn-default']" ) ).click ();

    }





}

