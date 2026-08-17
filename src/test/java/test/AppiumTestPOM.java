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

            loginFlow.enterUsername("testNG");

            loginFlow.enterPassword("testNG2026");

            loginFlow.tapLogin();

            loginFlow.validateAccountLabel();

            pass("Login realizado con éxito");
        } catch (Exception e) {
            fail("Error durante la ejecución del test: " + e.getMessage());
        }
    }


    @Test
    public void testAppiumLoginAdm() {
        try {

            startTest("Inyección de datos en la app");

            LoginFlow loginFlow = new LoginFlow(driver);

            loginFlow.login("admin", "admin2026");

            loginFlow.validateAccountLabel();

            pass("Login realizado con éxito");
        } catch (Exception e) {
            fail("Error durante la ejecución del test: " + e.getMessage());
        }
    }
}
