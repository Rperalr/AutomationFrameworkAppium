package extentReportHtml;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;

public class ExtentManagerReport extends ExtentManagerInstance {

    // ### Constructor para inicializar el reporte al crear una instancia de ExtentManagerReport
    // ### Métodos para manejar el reporte de pruebas utilizando ExtentReports
    protected void startReport() {
        extent = ExtentManager.getExtent();
    }
    // Método para finalizar el reporte y guardar los resultados
    protected void endReport() {
        extent.flush();
    }

    //### Métodos para registrar el resultado de la prueba en el reporte ###
    // Método para iniciar un nuevo test en el reporte con un nombre específico
    public void startTest(String testName) {
        test = extent.createTest(testName);
    }
    // Métodos para registrar el resultado de la prueba en el reporte
    public void pass(String message) {
        test.log(Status.PASS, message);
    }
    // Método para registrar un fallo en la prueba con un mensaje específico
    public void fail(String message) {
        test.log(Status.FAIL, message);
    }
    // Método para registrar un error en la prueba con una excepción específica
    public void skip(String message) {
        test.log(Status.SKIP, message);
    }
    // Método para registrar un error en la prueba con una excepción específica
    public void error(Exception e) {
        test.log(Status.FAIL, e);
    }

}