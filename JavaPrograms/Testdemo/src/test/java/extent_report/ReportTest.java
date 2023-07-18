package extent_report;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ReportTest {

    WebDriver driver;
    ExtentReports extent;

   @BeforeMethod
    public void configaration(){
       String reportPath = System.getProperty ( "user.dir" )+"//reports//index.html";

        ExtentSparkReporter reporter =new ExtentSparkReporter(reportPath);
        reporter.config().setReportName("Omayo Test Report");
        reporter.config().setDocumentTitle ("Omayo Test Report Title");
       extent=new ExtentReports ();
       extent.attachReporter ( reporter );
       extent.setSystemInfo ( "operating system","windows10" );
       extent.setSystemInfo ( "Tested By","Test" );


    }

    @Test
    public void one() throws InterruptedException {
       ExtentTest eTest=extent.createTest ( "Test one created" );

        // WebDriverManger.chromedriver.setup();
        driver = new ChromeDriver ();
        eTest.info ( "chromo browser launched" );
        driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().implicitlyWait ( 10, TimeUnit.SECONDS );
        Thread.sleep ( 5000 );
        driver.get ( "http://omayo.blogspot.com/" );
         eTest.info ( "navigated to omayo home page" );
        Thread.sleep ( 2000 );
        String actualText= driver.findElement ( By.id ( "pah" ) ).getText ();
        Assert.assertEquals ( actualText,"PracticeAutomationHere");

    }
    @AfterMethod
    public void sec(){

        driver.close();
        extent.flush ();
    }
}


