package testBasic;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppiumTestNative {

    private By usernameField = By.id("com.sourcey.materialloginexample:id/input_email");
    private By passwordField = By.id("com.sourcey.materialloginexample:id/input_password");
    private By loginButton = By.id("com.sourcey.materialloginexample:id/btn_login");

    private AppiumDriver driver;


    @BeforeMethod
    public void setUp() throws MalformedURLException {


        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        UiAutomator2Options options = new UiAutomator2Options();

        options.setPlatformName("Android");
        options.setDeviceName("emulator-5554");
        options.setApp("C:\\Users\\rperaltr\\OneDrive - NTT DATA EMEAL\\Documentos\\apk\\LoginExample.apk");
        options.setAutomationName("UiAutomator2");
        options.setNoReset(true);

        driver = new AndroidDriver(url, options);

        System.out.println("Driver iniciado ✅");
    }

    @Test
    public void testOpenSettings() throws InterruptedException {

        // En tu test
        String expectedText = "No account yet? Create one";
        String actualText = driver.findElement(By.id("com.sourcey.materialloginexample:id/link_signup")).getText();
        driver.findElement(usernameField).sendKeys("QA");
        driver.findElement(passwordField).sendKeys("Automation");
        driver.findElement(loginButton).click();
        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
        Assert.assertEquals(actualText, expectedText, "❌ El login no fue correcto");
        System.out.println("Test ejecutado ✅");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Driver cerrado ✅");
        }
    }
}
