package testRunners;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "src/test/resources/apiFeatureFiles",
		glue = {"apiStepDefinitions"}
		)

public class ApiRunner extends AbstractTestNGCucumberTests{

}
