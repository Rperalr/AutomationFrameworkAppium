package baseTest;

import Utils.DriverFactory;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import extentReportHtml.ExtentManager;
import extentReportHtml.ExtentManagerInstance;
import extentReportHtml.ExtentManagerReport;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.net.URL;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import videoRecorder.VideoRecorder;

public class BaseTest extends ExtentManagerReport {

    @BeforeMethod
    public void setUp() throws Exception {
        VideoRecorder.startRecording();
            startReport();
        DriverFactory.createDriver();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        VideoRecorder.stopRecording();
             endReport();
        if (driver != null) {
            driver.quit();
            driver = null;
            System.out.println("Driver cerrado ✅");
        }
    }
}
