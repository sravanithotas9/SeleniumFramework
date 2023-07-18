package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class ExtentReporter {
     static ExtentReports extentReport;

    public static ExtentReports getExtentReport() {

        String extentReportPath = System.getProperty ( "user.dir" ) + "\\reports\\extent-report.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter ( extentReportPath );
        reporter.config ().setReportName ( "TutorialsNinja Automation Results" );
        reporter.config ().setDocumentTitle ( "Test Results" );

        extentReport = new ExtentReports ();
        extentReport.attachReporter ( reporter );
        extentReport.setSystemInfo ( "Operating System", "windows 10" );
        extentReport.setSystemInfo ( "Tested By", "test test" );

        return extentReport;
    }
}
