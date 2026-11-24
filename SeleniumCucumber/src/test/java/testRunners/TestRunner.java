package testRunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Features",
    glue = "stepDefinations",
    plugin = {"pretty", "html:target/cucumber-reports.html"},
    dryRun = false,
    monochrome = true
)
public class TestRunner {
}