package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/resources/Features",glue = "Stepsdef",tags = "@Scenario1 or @Scenario2 ",plugin = {"pretty","html:target/reports/report.html"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
