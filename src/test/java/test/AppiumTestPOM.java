package test;

import baseTest.BaseTest;
import com.aventstack.extentreports.Status;
import flow.LoginFlow;
import org.testng.annotations.Test;

public class AppiumTestPOM extends BaseTest {

    @Test
    public void testAppium() {
        test = extent.createTest("Login Test1");

        try {
            LoginFlow loginFlow = new LoginFlow(driver);
            loginFlow.login("QA", "Automation");
            loginFlow.validateAccountLabel();

            System.out.println("Test ejecutado ✅");
            test.log(Status.PASS, "Inyección fue exitosa");
        } catch (Exception e) {
            test.log(Status.FAIL, "Inyección falló: " + e.getMessage());
        }
    }
}
