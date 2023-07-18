package listners_Concept;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners  implements ITestListener {


    @Override
    public void onTestStart(ITestResult result){
        System.out.println ("Test Execution Started for Test:"+result.getName ());

    }
    @Override
    public void onFinish(ITestContext context){
        System.out.println ("Test Execution Ended");

    }
    @Override
    public void onTestSuccess(ITestResult result){
        System.out.println ("Test Execution Successfully for Test:"+result.getName ());

    }
    //take screenshot
    //update the failure status in test report
    //update in logs
    @Override
    public void onTestFailure(ITestResult result){
        System.out.println ("Test Execution Failed for Test:"+result.getName ());

    }
    @Override
    public void onTestSkipped(ITestResult result){
        System.out.println ("Test Execution got Skipped for Test:"+result.getName ());

    }

}
