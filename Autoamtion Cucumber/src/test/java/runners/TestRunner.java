package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features/OrangeHRM.feature", 
		glue="stepDefinitions",
		dryRun=false,
		monochrome=true,
		// plugin= {"pretty", "html:target/cucumber-reports.html"}, tags = {"@Sanity"}
		plugin = {"pretty", "html:test-output/cucumber-reports.html"}
		)

public class TestRunner {

}
