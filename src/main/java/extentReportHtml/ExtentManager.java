package extentReportHtml;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager extends ExtentManagerInstance {

    /**
     * Retrieves the singleton instance of the ExtentReports object. If the instance
     * does not already exist, it initializes a new ExtentReports object with an
     * ExtentHtmlReporter configured for generating HTML reports.
     *
     * @return The singleton instance of ExtentReports.
     */
    public static ExtentReports getExtent() {
        if (extent == null) {
            ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(PATH_REPORT + NAME_REPORT + TIME_STAMP + EXT_REPORT);
            htmlReporter.config().setTheme(Theme.DARK);
            htmlReporter.config().setReportName("Automation Test Regresion");
            htmlReporter.config().setLevel();
            extent = new ExtentReports();
            extent.attachReporter(htmlReporter);
        }
        return extent;
    }
}