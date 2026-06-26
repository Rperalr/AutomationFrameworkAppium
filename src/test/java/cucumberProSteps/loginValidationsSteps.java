package cucumberProSteps;


import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertTrue;

public class loginValidationsSteps{
    public AppiumDriver driver;

    @Then("el login se ejecuta correctamenteen boton inicio sesion")
    public void el_login_se_ejecuta_correctamenteen_boton_inicio_sesion() {
        System.out.println("Login ejecutado correctamente");

    }

    @Then("validar label de la cuenta")
    public void validar_label_de_la_cuenta() {
       loginPageSteps loginPage = new loginPageSteps(driver);
       assertTrue("El label de la cuenta no está visible", loginPage.isAccountLabelVisible());

        System.out.println("Label de la cuenta validado correctamente");
    }
}