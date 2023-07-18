package listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utilities.Base;
import utilities.ExtentReporter;
import java.io.IOException;



public class Listeners extends Base implements ITestListener {
    ExtentReports extentReport = ExtentReporter.getExtentReport();
    ExtentTest extentTest;

    ThreadLocal<ExtentTest> extentTestThread =new ThreadLocal<ExtentTest> ();

    @Override
    public void onTestStart(ITestResult result) {
        String testName = result.getName ();

       extentTest = extentReport.createTest ( testName,"Execution started" );
        extentTestThread.set ( extentTest );
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        String testName = result.getName ();

        // extentTest.log(Status.PASS,testName+"got passed");

        extentTestThread.get ().log(Status.PASS,testName+"got passed");



        System.out.println ( "Test Execution Successfully for Test:" + result.getName () );
        takeScreenShotWithFileName ( result );
        extentTest.log ( Status.PASS, testName+" got passed" );
    }
    //take screenshot
    //update the failure status in test report
    //update in logs

    @Override
    public void onTestFailure(ITestResult result) {

        String testName = result.getName ();

        extentTest.fail ( result.getThrowable ());

        String screenShotFilePath = takeScreenShotWithFileName ( result );
        extentTestThread.get ().addScreenCaptureFromPath ( screenShotFilePath,testName );

        extentTest.fail (result.getThrowable ());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println ( "Test Execution got Skipped for Test:" + result.getName () );
    }


    @Override
    public void onFinish(ITestContext context) {
        System.out.println ( "Test Execution Ended" );

        extentReport.flush ();
    }

    /**
     * Capture screenshot with file name
     * @param result pass itest result
     */
    private String takeScreenShotWithFileName(ITestResult result) {
        String screenShotFIlePath = null;

        String screenShotName = result.getName () + getTime ();
        try {
            screenShotFIlePath = takeScreenshot ( screenShotName, getDriver ());
        } catch (IOException e) {
            e.printStackTrace ();
        }
        return screenShotFIlePath;
    }


}
