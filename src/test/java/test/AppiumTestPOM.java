package test;

import baseTest.BaseTest;
import com.aventstack.extentreports.Status;
import flow.LoginFlow;
import org.testng.annotations.Test;

public class AppiumTestPOM extends BaseTest {

    @Test
    public void testAppium() {
        try {

            startTest("Inyección de datos en la app");

            LoginFlow loginFlow = new LoginFlow(driver);

            loginFlow.enterUsername("testuser");

            loginFlow.enterPassword("password123");

            loginFlow.tapLogin();

            loginFlow.validateAccountLabel();

            pass("Login realizado con éxito");
        } catch (Exception e) {
            fail("Error durante la ejecución del test: " + e.getMessage());
        }
    }
}
