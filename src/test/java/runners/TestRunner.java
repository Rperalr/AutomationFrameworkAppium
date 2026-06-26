package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features/postApiTestPro.feature",
        tags = "@webLoginAdmin",
        glue = {
                "cucumberProSteps",
                "hooks"
        },
        plugin = {
                "pretty",
                "json:target/cucumber-reports/cucumber.json",
                "junit:target/cucumber-reports/cucumber.xml",
                "html:target/cucumber-reports/cucumber.html"
        },
        monochrome = true
)
public  class TestRunner {
}


