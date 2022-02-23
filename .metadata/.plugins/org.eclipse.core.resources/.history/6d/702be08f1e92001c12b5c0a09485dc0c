package MyRunner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Test
//@RunWith(Cucumber.class)
@CucumberOptions(features="../DemoBDDCucumberFramework/src/test/java/Feature/AmazonLoginFeature.feature",
dryRun= false,   //Only if we want to get Only Snippet without running whole program than put as true 
glue = {"AmazonStepDefinitions"}, // its represent the package name in step definitions
monochrome = true,  //Display the console output in proper readable format
plugin = { "pretty",  "html:Reports/cucumber-pretty" }
)
public class AmazonRunner extends AbstractTestNGCucumberTests{

}
