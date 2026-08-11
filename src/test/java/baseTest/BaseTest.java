package baseTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import extentReportHtml.ExtentManager;
import extentReportHtml.ExtentManagerInstance;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.net.URL;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import videoRecorder.VideoRecorder;

public class BaseTest extends ExtentManagerInstance {

    @BeforeMethod
    public void setUp() throws Exception {
        VideoRecorder.startRecording();
        extent = ExtentManager.getExtent();

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setDeviceName("emulator-5554");
        options.setAutomationName("UiAutomator2");
        options.setApp("C:\\Users\\rperaltr\\OneDrive - NTT DATA EMEAL\\Documentos\\apk\\LoginExample.apk");
        options.setNoReset(true);

        driver = new AndroidDriver(url, options);
        System.out.println("Driver iniciado ✅");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        VideoRecorder.stopRecording();

        if (extent != null) {
            extent.flush();
        }

        if (driver != null) {
            driver.quit();
            driver = null;
            System.out.println("Driver cerrado ✅");
        }
    }
}
