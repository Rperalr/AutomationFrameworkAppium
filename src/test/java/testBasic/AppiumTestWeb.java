package testBasic;

import extentReportHtml.ExtentManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import screenShoot.ScreenshotUtils;
import videoRecorder.VideoRecorder;

public class AppiumTestWeb extends ExtentManager {

  private By btnHamburguer = By.className("menu");
  private By llnkSite = By.xpath("//android.view.View[@content-desc=\"DEMO SITE\"]/android.widget.TextView");
  private By llnkLaptops = By.xpath("//android.view.View[@content-desc=\"Monitors\"]");

    private AppiumDriver driver;


    @BeforeMethod
    public void setUp() throws Exception {
        VideoRecorder.startRecording();
        startReport();
        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setDeviceName("emulator-5554");
        options.setAutomationName("UiAutomator2");
        options.withBrowserName("Chrome");
        options.setRecreateChromeDriverSessions(true);
        options.setCapability("chromedriverAutodownload", true);
        options.setCapability(
        "chromedriverExecutable",
        "C:\\Users\\rperaltr\\OneDrive - NTT DATA EMEAL\\Documentos\\Ntt Data 2026\\appium example new\\drivers\\chromedriver.exe");

        driver = new AndroidDriver(url, options);

        driver.get("https://demo.guru99.com/test/newtours/register.php");

        System.out.println("✅ Web abierta");

    }

    @Test
    public void testOpenSettings() throws InterruptedException {

        try{
        startTest("Test de datos en la app");
        String expectedTitle = "Tools QA";
        String actualTitle = driver.getTitle();
        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
        ScreenshotUtils.takeScreenshot(driver, "loginAdmin");
        driver.findElement(btnHamburguer).click();
        Assert.assertEquals(actualTitle, expectedTitle, "❌ El título no es correcto");
        System.out.println("Test ejecutado ✅");
        pass("Inyección fue exitosa");
        } catch (Exception e) {
            fail("Inyección falló: " + e.getMessage());
        }
    }

    @AfterMethod
    public void tearDown() throws Exception {
        VideoRecorder.stopRecording();
        endReport();
        if (driver != null) {
            driver.quit();
            System.out.println("Driver cerrado ✅");
        }
    }
}
