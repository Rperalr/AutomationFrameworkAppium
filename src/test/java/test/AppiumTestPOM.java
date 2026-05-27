package test;

import baseTest.BaseTest;
import com.aventstack.extentreports.Status;
import pages.LoginPage;
import org.testng.annotations.Test;

public class AppiumTestPOM extends BaseTest {

    @Test
    public void testAppium() throws InterruptedException {


        test = extent.createTest("Login Test1");
        try {


            LoginPage loinPage = new LoginPage(driver);
            loinPage.login("QA","Automation");

            System.out.println("Test ejecutado ✅");


            test.log(Status.PASS, "Inyecciòn fue exitoso");
        } catch (Exception e) {
            test.log(Status.FAIL, "Inyecciòn falló: " + e.getMessage());
        }
    }
}

