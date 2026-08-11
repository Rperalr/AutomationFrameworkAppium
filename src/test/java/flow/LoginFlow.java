package flow;

import io.appium.java_client.AppiumDriver;
import org.testng.Assert;
import pages.LoginPage;
import screenShoot.ScreenshotUtils;

public class LoginFlow {

    private final AppiumDriver driver;
    private final LoginPage loginPage;

    public LoginFlow(AppiumDriver driver) {
        this.driver = driver;
        this.loginPage = new LoginPage(driver);
    }

    public void enterUsername(String username) {
        loginPage.enterUsername(username);
    }

    public void enterPassword(String password) {
        loginPage.enterPassword(password);
    }

    public void tapLogin() {
        loginPage.tapLogin();
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        tapLogin();
    }

    public void validateAccountLabel() {
        Assert.assertEquals(
                loginPage.getAccountLabelText(),
                "No account yet? Create one",
                "❌ El login no fue correcto"
        );
        ScreenshotUtils.takeScreenshot(driver, "loginAdmin");
    }
}
