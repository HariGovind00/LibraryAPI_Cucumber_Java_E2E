package CucumberTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/java/CucumberFeatureFile/PostAPI.feature",
plugin = "json:target/jsonReports/json-cucumber-report.json",
glue = "CucumberStepDefinationFile"
monochrome = true)
public class PostAPITestRunner extends AbstractTestNGCucumberTests
{

} 
