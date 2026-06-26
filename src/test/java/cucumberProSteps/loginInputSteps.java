package cucumberProSteps;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class loginInputSteps {
    public AppiumDriver driver;

    @When("ingreso el usuario {string}")
    public void ingreso_el_usuario(String usuario) {
    loginPageSteps loginPage = new loginPageSteps(driver);
        loginPage.enterUsername(usuario);

        System.out.println("Usuario ingresado: " + usuario);
    }

    @And("ingreso el password {string}")
    public void ingreso_el_password(String password) {
    loginPageSteps loginPage = new loginPageSteps(driver);
        loginPage.enterPassword(password);

        System.out.println("Password ingresado");
    }

    @And("doy clic en el botón login")
    public void doy_clic_en_el_boton_login() {
    loginPageSteps loginPage = new loginPageSteps(driver);
        loginPage.tapLogin();

        System.out.println("Click en botón login");
    }
}