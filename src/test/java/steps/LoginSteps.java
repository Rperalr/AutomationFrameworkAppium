package steps;

import baseTest.BaseTest;
import flow.LoginFlow;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.testng.Assert;

public class LoginSteps extends BaseTest {

    @Contract(" -> new")
    private @NotNull LoginFlow loginFlow() {
        return new LoginFlow(driver);
    }

    @Given("que la aplicación móvil está abierta")
    public void que_la_aplicacion_movil_esta_abierta() {
        Assert.assertNotNull(driver, "❌ El driver de Appium no fue inicializado");
        System.out.println("app abierta ✅");
    }

    @When("ingreso el usuario {string}")
    public void ingreso_el_usuario(String username) {
        test = extent.createTest("login");
        loginFlow().enterUsername(username);
        System.out.println("user input ✅");
    }

    @And("ingreso el password {string}")
    public void ingreso_el_password(String password) {
        loginFlow().enterPassword(password);
        System.out.println("user passwd ✅");
    }

    @And("doy clic en el botón login")
    public void doy_clic_en_el_boton_login() {
        loginFlow().tapLogin();
        System.out.println("clic btn login ✅");
    }

    @Then("el login se ejecuta correctamenteen boton inicio sesion")
    public void el_login_se_ejecuta_correctamenteen_boton_inicio_sesion() {
        System.out.println("se da clic correctamente al btn ✅");
    }

    @Then("validar label de la cuenta")
    public void validar_label_de_la_cuenta() {
        loginFlow().validateAccountLabel();
        System.out.println("Validando lbl cuenta ✅");
    }
}
