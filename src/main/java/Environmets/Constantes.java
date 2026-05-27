package Environmets;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Constantes {

    /**
     * A constant string that holds the URL for the Guru99 registration page.
     * This URL points to the registration form on the Guru99 demo website.
     */
    public static String TOOLS_QA  = "http://opencart.abstracta.us/";
    public static String guru99   ="https://demo.guru99.com/test/newtours/register.php";

    /**
     * The PATH_REPORT constant defines the file path to the directory where
     * the Extent Reports are stored. This path is used for generating and
     * saving test execution reports in the specified location.
     *
     * Note: Ensure that the file path is valid and accessible on the system
     * where the application is running. Update the path if the directory
     * structure changes.
     */
    public static String TIME_STAMP = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
    public static String PATH_REPORT = "./evidences/ExternRepotHTML/";

    /**
     * The PATH_ASHOT constant defines the file path to the directory where Ashot-related
     * resources are stored. This path is used in the automation projects for managing
     * screenshots or other Ashot framework-related files.
     *
     * Note:
     * - Ensure that the path is correctly set according to the file structure of your project.
     * - Update this path if the directory structure changes.
     */

    /**
     * A constant that represents the prefix for the name of the extent report files.
     * This is used to generate report file names dynamically.
     */
    public static String NAME_REPORT = "ExtentReport_";
    public static String EXT_REPORT = ".html";

    /**
     * A constant string representing the action to initialize a WebDriver instance.
     */
    public static String INICIA_NAVEGADOR = "Inicia Instancia WebDriver";

    /**
     * The file path where the screenshots of web elements will be stored.
     * This path is used to save the captured screenshots during automation testing.
     *
     * Example:
     * "C:\\Users\\saulf\\Documents\\Automation_Proyects\\Reingenieria Java Framework\\Java-Proyect-FrontEnd-2025\\screenshotElement\\"
     */
    public static String PATH_ASHOT_ELEMENT_WEB = "C:\\Users\\saulf\\Documents\\Automation_Proyects\\Reingenieria Java Framework\\Java-Proyect-FrontEnd-2025\\screenshotElement\\";
    public static String NAME_ASHOT_ELEMENT_WEB = "ashotElementWeb_";
    public static String EXT_ASHOT_ELEMENT_WEB = ".png";
    public static String ALLPATH_ASHOT_ELEMENT_WEB = PATH_ASHOT_ELEMENT_WEB + NAME_ASHOT_ELEMENT_WEB + TIME_STAMP + EXT_ASHOT_ELEMENT_WEB;

    /**
     * The file path where the CSV data is stored or will be saved.
     * This path points to the "data.csv" file located in the "outputCSV" directory.
     */
    public String filePath;
    public String FilePath = "outputCSV/data.csv";
}


