package cucumberProSteps;


import baseTest.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class appSteps extends BaseTest {

    @Given("que la aplicación móvil está abierta")
    public void que_la_aplicacion_movil_esta_abierta() throws Exception {
        System.out.println("La aplicación móvil está abierta");
        this.setUp();

        // Aquí puedes validar que el driver/app ya esté inicializado
    }

    @Then("cerrar app sesion")
    public void cerrar_app_sesion() throws Exception {
        System.out.println("Cerrando sesión o app");
        // Aquí puedes cerrar sesión o cerrar la app si lo manejas manualmente
        this.tearDown();
    }
}
