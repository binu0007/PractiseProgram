/**
 * 
 */
package MyRunner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * @author TG1670
 *
 */

  @Test
  
  @CucumberOptions(features=
  "../TGAppUsingBDD/src/test/java/Feature/Feature.feature", dryRun = false,
  glue= {"StepDefinitions"} ) public class Runner extends
  AbstractTestNGCucumberTests{
  
  }
 
