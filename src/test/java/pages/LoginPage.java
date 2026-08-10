package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import screenShoot.ScreenshotUtils;

import java.time.Duration;

public class LoginPage {

    //🔍 Driver
    public AppiumDriver driver;

    // 🔍 Constructor
    public LoginPage(AppiumDriver driver)
    { if (driver == null) {

    }else
        this.driver = driver;
    }

    // 🔍 Locators (ejemplo)
    private By usernameField = By.id("com.sourcey.materialloginexample:id/input_email");
    private By passwordField = By.id("com.sourcey.materialloginexample:id/input_password");
    private By loginButton = By.id("com.sourcey.materialloginexample:id/btn_login");
    public By labelAccout = By.id("com.sourcey.materialloginexample:id/link_signup");


    // ⚙️ Actions
    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }
    //⚙️ Actions
    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }
    // ⚙️ Actions
    public void tapLogin() {
        driver.findElement(loginButton).click();
    }
    // Metodo para realizar el login completo
    public void login(String user, String pass) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        enterUsername(user);
        enterPassword(pass);
        tapLogin();
        ScreenshotUtils.takeScreenshot(driver, "Login");
        Assert.assertEquals("No account yet? Create one",driver.findElement(labelAccout).getText(), "❌ El login no fue correcto");
    }

    public boolean isHomeScreenVisible() {
        return driver.findElement(labelAccout).isDisplayed();
    }
}
