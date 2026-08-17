package Utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.URL;

public class DriverFactory {

    public static AppiumDriver createDriver() throws Exception {

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