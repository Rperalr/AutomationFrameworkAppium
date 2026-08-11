package extentReportHtml;

import Environmets.Constantes;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.AppiumDriver;

public class ExtentManagerInstance extends Constantes {

    /**
     * A static instance of ExtentReports used for generating and managing test reports.
     * ExtentReports is a library that provides detailed and customizable reporting
     * for automated tests.
     */

    protected static ExtentTest test;
    protected static ExtentReports extent;
    protected static AppiumDriver driver;

}