package Environmets;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Constant {

    /**
     * This class contains various constants used for automation testing.
     *
     * Variables:
     * - `TOOLS_QA`: URL of the Tools QA website.
     * - `TIME_STAMP`: Current timestamp in the format "yyyy_MM_dd__hh_mm_ss".
     * - `PATH_REPORT`: File path for storing test reports.
     * - `PATH_ASHOT`: File path for storing AShot captures.
     * - `NAME_ASHOOT`: Prefix for naming AShot captures.
     *
     * Android Capabilities:
     * - `PLATFORM_NAME`: Name of the platform (e.g., Android).
     * - `DEVICE_NAME`: Identifier for the Android device.
     * - `APP`: File path to the APK of the application under test.
     * - `AUTOMATION_NAME`: Name of the automation framework (e.g., UiAutomator2).
     */
    //Variables URl
    public static String APPIUM_SERVER_URL  = "http://127.0.0.1:4723/wd/hub";
    public static String Android  = "Android";
    public static String iOS  = "iOS";
    //Timestamp
    public static String TIME_STAMP = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
    public static String PATH_REPORT = "C:\\Users\\saulf\\Documents\\Automation_Proyects\\Java\\Proyecto_FrontEnd-master\\Proyecto_FrontEnd-master\\src\\test\\ExtReport\\";
    //Ashot
    public static String PATH_ASHOT = "./scrennshotPNG/";
    public static String NAME_ASHOOT = "Capture_";
    public static String EXT = "png";
    //Capabilities Android
    public static String PLATFORM_NAME = "Android";
    public static String DEVICE_NAME_NEW = "n7z5t87ttoqwswrc";
    public static String DEVICE_FISIC = "G6WKTC8DUWQW6XCE";
    public static String DEVICE_EMULATOR = "emulator-5556";
    public static String APP = "C:\\Users\\rperaltr\\OneDrive - NTT DATA EMEAL\\Documentos\\apk\\apk\\LoginExample.apk";
    public static String AUTOMATION_NAME = "UiAutomator2";
    public static String PLATFORM_ANDROID = "Android";
    public static String PLATFORM_iOS = "iOS";

}
/*
{
        "platformName": "Android",
        "deviceName": "G6WKTC8DUWQW6XCE",
        "app": "C:\\Users\\rperaltr\\OneDrive - NTT DATA EMEAL\\Documentos\\apk\\LoginExample.apk",
        "automationName": "UiAutomator2"
        }

 */