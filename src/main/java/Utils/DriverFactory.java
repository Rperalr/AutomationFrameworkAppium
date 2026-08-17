package Utils;

import extentReportHtml.ExtentManagerInstance;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.URL;

public class DriverFactory extends ExtentManagerInstance {

    public static AppiumDriver createDriver() throws Exception {

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setDeviceName("emulator-5554");
        options.setAutomationName("UiAutomator2");
        options.setApp("C:\\Users\\rperaltr\\OneDrive - NTT DATA EMEAL\\Documentos\\apk\\LoginExample.apk");
        options.setNoReset(true);

        driver = new AndroidDriver(url, options);
        System.out.println("Driver iniciado ✅");
         return driver;
    }

    public static AppiumDriver createDriverDeprectaed() throws Exception {

        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setDeviceName("emulator-5554");
        options.setAutomationName("UiAutomator2");
        options.setApp("C:\\Users\\rperaltr\\OneDrive - NTT DATA EMEAL\\Documentos\\apk\\LoginExample.apk");

        return new AndroidDriver(
                new URL("http://127.0.0.1:4723/wd/hub"),
                options
        );
    }
}