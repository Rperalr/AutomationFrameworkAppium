package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import screenShoot.ScreenshotUtils;

public class LoginPage {

    private final AppiumDriver driver;

    private final By usernameField = By.id("com.sourcey.materialloginexample:id/input_email");
    private final By passwordField = By.id("com.sourcey.materialloginexample:id/input_password");
    private final By loginButton = By.id("com.sourcey.materialloginexample:id/btn_login");
    private final By labelAccount = By.id("com.sourcey.materialloginexample:id/link_signup");

    public LoginPage(AppiumDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
        ScreenshotUtils.takeScreenshot(driver, "enterUsername");
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
        ScreenshotUtils.takeScreenshot(driver, "enterPassword");
    }

    public void tapLogin() {
        driver.findElement(loginButton).click();
        ScreenshotUtils.takeScreenshot(driver, "tapLogin");
    }

    public String getAccountLabelText() {
        return driver.findElement(labelAccount).getText();
    }

    public boolean isHomeScreenVisible() {
        return driver.findElement(labelAccount).isDisplayed();
    }
}
