package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When; 

public class StepDefinitions 
{
	WebDriver driver;
	 static
	  {
		  System.setProperty("webdriver.chrome.driver","../BDD_Cucumber_Framework/src/test/resources/chromedriver.exe");
	  }
	@Given("^the user will launch the brower$")
	public void the_user_will_launch_the_brower() {
	   driver= new ChromeDriver();
	}

	@Given("^the Application will loaded$")
	public void the_application_will_loaded() {
	    driver.get("https://www.amazon.in/");
	}

	@When("^user enter valid user name$")
	public void user_enter_valid_user_name() {
	    driver.findElement(By.id("")).sendKeys("");
	}

	@When("^user will click on continue button$")
	public void user_will_click_on_continue_button() {
	    
	}

	@When("^user will Enter valid Password$")
	public void user_will_enter_valid_password() {
	    
	}

	@When("^User will Click on Sign In Button$")
	public void user_will_click_on_sign_in_button() {
	    
	}

	@Then("^Home page of Amazon will display$")
	public void home_page_of_amazon_will_display() {
	   
	}

}
