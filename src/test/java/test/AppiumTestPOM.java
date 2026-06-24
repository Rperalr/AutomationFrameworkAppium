package test;

import baseTest.BaseTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import extentReportHtml.ExtentManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import org.testng.annotations.Test;
import videoRecorder.VideoRecorder;

import java.net.URL;

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
