package extentReportHtml;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentManager extends ExtentManagerReport {

        public static String TIME_STAMP = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
        public static String PATH_REPORT = "./evidences/ExternRepotHTML/";
        public static String NAME_REPORT = "ExtentReport_";
        public static String EXT_REPORT = ".html";

        public static ExtentReports getExtent() {

            if (extent == null) {

                String reportPath = PATH_REPORT + NAME_REPORT + TIME_STAMP + EXT_REPORT;

                ExtentSparkReporter sparkReporter =
                        new ExtentSparkReporter(reportPath);

                sparkReporter.config().setReportName("Automation Test Regression");
                sparkReporter.config().setDocumentTitle("Execution Report");
                sparkReporter.config().setTheme(Theme.DARK);

                extent = new ExtentReports();
                extent.attachReporter(sparkReporter);
            }

            return extent;
        }
    }
