package listners_Concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Qtest {
    @Test
    public void testN() {
        int a = 2, b = 5, c = 6;
        //WebDriverManger.chromedriver.setup();
        WebDriver driver = new ChromeDriver ();
        driver.get ( "http://omayo.blogspot.com/" );
        driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().implicitlyWait ( 1, TimeUnit.SECONDS );

        if (a == 2) {
            Assert.assertTrue ( b < c );
        }
        if (a == 3) {
            Assert.assertTrue ( b > c );

        } else if (a == 5) {
            throw new SkipException ( "Test Skipped" );

        }


    }

        @Test
        public void testR() {
            int a = 2, b = 5, c = 6;
            //WebDriverManger.chromedriver.setup();
            WebDriver driver = new ChromeDriver ();
            driver.get ( "http://omayo.blogspot.com/" );
            driver.manage ().window ().maximize ();
            driver.manage ().timeouts ().implicitlyWait ( 1, TimeUnit.SECONDS );

            if (a == 3) {
                Assert.assertTrue ( b < c );
            }
            if (a == 3) {
                Assert.assertTrue ( b > c );

            } else if (a == 5) {
                throw new SkipException ( "Test Skipped" );

            }
        }


            @Test
            public void testZ() {
                int a = 2, b = 5, c = 6;
                //WebDriverManger.chromedriver.setup();
                WebDriver driver = new ChromeDriver ();
                driver.get ( "http://omayo.blogspot.com/" );
                driver.manage ().window ().maximize ();
                driver.manage ().timeouts ().implicitlyWait ( 1, TimeUnit.SECONDS );

                if (a == 5) {
                    Assert.assertTrue ( b < c );
                }
                if (a == 3) {
                    Assert.assertTrue ( b > c );

                } else if (a == 5) {
                    throw new SkipException ( "Test Skipped" );

                }
            }
        }



