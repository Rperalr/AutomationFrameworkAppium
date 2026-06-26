package steps;

import baseTest.BaseTest;
import cucumberProSteps.loginInputSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPage;
import screenShoot.ScreenshotUtils;


public class LoginSteps extends BaseTest {

    @Given("que la aplicación móvil está abierta")
    public void que_la_aplicación_móvil_está_abierta() throws Exception {
        // Write code here that turns the phrase above into concrete actions
            this.setUp();
        System.out.println("app abierta ✅");
    }
    @When("ingreso el usuario {string}")
    public void ingreso_el_usuario(String username) {
        // Write code here that turns the phrase above into concrete actions
            test = extent.createTest("login");
                LoginPage loginPage = new LoginPage(driver);
                loginPage.enterUsername(username);
        System.out.println("user input ✅");
    }
    @And("ingreso el password {string}")
    public void ingreso_el_password(String password) {
        // Write code here that turns the phrase above into concrete actions
            LoginPage loginPage = new LoginPage(driver);
            loginPage.enterPassword(password);
        System.out.println("user passwd ✅");
    }
    @And("doy clic en el botón login")
    public void doy_clic_en_el_botón_login() {
        // Write code here that turns the phrase above into concrete actions
            LoginPage loginPage = new LoginPage(driver);
            loginPage.tapLogin();
        System.out.println("clic btn login ✅");
    }
    @Then("el login se ejecuta correctamenteen boton inicio sesion")
    public void el_login_se_ejecuta_correctamenteen_boton_inicio_sesion() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("se da clic correctamnete al btn ✅");
    }
    @Then("validar label de la cuenta")
    public void validar_label_de_la_cuenta() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        LoginPage loginPage = new LoginPage(driver);
            Assert.assertEquals("No account yet? Create one",driver.findElement(loginPage.labelAccout).getText(), "❌ El login no fue correcto");
            System.out.println("Validando lbl cuenta ✅");
        ScreenshotUtils.takeScreenshot(driver,"loginAdmin");
    }
    @Then("cerrar app sesion")
    public void cerrar_app_sesion() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Test finalizado ✅");
                this.tearDown();

    }
}

