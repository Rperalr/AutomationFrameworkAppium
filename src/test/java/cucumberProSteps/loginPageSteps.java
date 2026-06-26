package cucumberProSteps;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class loginPageSteps {

    private AppiumDriver driver;

    // 🔍 Constructor
     loginPageSteps(AppiumDriver driver) {
        this.driver = driver;
    }

        private By usernameField = By.id("com.sourcey.materialloginexample:id/input_email");
        private By passwordField = By.id("com.sourcey.materialloginexample:id/input_password");
        private By loginButton = By.id("com.sourcey.materialloginexample:id/btn_login");
        private By labelAccout = By.id("com.sourcey.materialloginexample:id/link_signup");


    public void enterUsername(String username) {
            driver.findElement(usernameField).sendKeys(username);
        }

        public void enterPassword(String password) {
            driver.findElement(passwordField).sendKeys(password);
        }

        public void tapLogin() {
            driver.findElement(loginButton).click();
        }

        public boolean isAccountLabelVisible() {
            return driver.findElement(labelAccout).isDisplayed();
        }
    }
