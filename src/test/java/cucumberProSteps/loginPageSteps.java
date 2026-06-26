package cucumberProSteps;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class loginPageSteps {

    //🔍 Driver
    public AppiumDriver driver;

    // 🔍 Constructor
    public loginPageSteps(AppiumDriver driver) {
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
}
