/**
 * 
 */
package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author TG1670
 *
 */
public class StepDefinitions
{
	WebDriver driver=null;
	static {
		System.setProperty("webdriver.chrome.driver", "../TGAppUsingBDD/src/test/resources/chromedriver.exe");
	}
	@When("user will launch the browser")
	public void user_will_launch_the_browser() {
	    driver = new ChromeDriver();
	}

	@When("Launched the Application")
	public void launched_the_application() {
	    driver.get("https://10.60.20.18/tgaprdv9/adm_login/");
	    driver.manage().window().maximize();
	}

	@When("user click on Advance setting")
	public void user_click_on_advance_setting() {
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
	    
	}

	@When("user will enter Valid username")
	public void user_will_enter_valid_username() {
		driver.findElement(By.id("id_sc_field_login")).sendKeys("QA_TEST_USER");

		
	    
	}

	@When("user will enter valid password")
	public void user_will_enter_valid_password() {
		driver.findElement(By.id("id_sc_field_password")).sendKeys("qtU63432");
	}

	@When("user click on Login button")
	public void user_click_on_login_button() {
		driver.findElement(By.id("sub_form_b")).click();
	}

	@Then("LoginHome Page will Display")
	public void login_home_page_will_display() throws InterruptedException {
		System.out.println("*****************Welcome to TG App Test Cases****************");
		Thread.sleep(5000);
		driver.quit();
	    
	}
	
	//----------------------------Scenario 2---------------------------------------------------------------
	@When("user click on menu item")
	public void user_click_on_menu_item() throws InterruptedException {
		Thread.sleep(2000);
	    driver.findElement(By.id("bmenu")).click();
	    Thread.sleep(2000);
	}

	@When("click on my profile")
	public void click_on_my_profile() throws InterruptedException {
		driver.findElement(By.id("item_257")).click();
		Thread.sleep(2000);
	}

	@When("click on my Quick task")
	public void click_on_my_quick_task() throws InterruptedException {
		Thread.sleep(2000);
	    driver.findElement(By.id("bmenu")).click();
	    Thread.sleep(3000);
		driver.findElement(By.id("item_239")).click();
		Thread.sleep(2000);
	}

	@When("click on My Task")
	public void click_on_my_task() throws InterruptedException {
		Thread.sleep(2000);
	    driver.findElement(By.id("bmenu")).click();
	    Thread.sleep(3000);
		driver.findElement(By.id("item_241")).click();
		Thread.sleep(2000);
	}

	@When("Click on My Activity")
	public void click_on_my_activity() throws InterruptedException {
		Thread.sleep(2000);
	    driver.findElement(By.id("bmenu")).click();
	    Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='My Activity']")).click();
	}

	@When("Click on My DSR")
	public void click_on_my_dsr() throws InterruptedException {
		Thread.sleep(2000);
	 //   driver.findElement(By.id("bmenu")).click();
	    Thread.sleep(3000);
		driver.findElement(By.id("item_65")).click();
	}
// switch-----------------------
	@When("click on plus DSR button")
	public void click_on_plus_dsr_button() throws InterruptedException {
		WebElement parentWindow = driver.findElement(By.xpath("//*[@id ='Iframe_control']//iframe[@id='iframe_item_65']"));
		driver.switchTo().frame(parentWindow);
		Thread.sleep(3000);
		driver.findElement(By.id("sc_SC_btn_2_top")).click();
	}

	@When("Click on Calender toggle button")
	public void click_on_calender_toggle_button() throws InterruptedException {
		driver.findElement(By.name("dummy_working_date")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("dummy_working_date")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("dummy_working_date")).sendKeys("10/02/2022");
		Thread.sleep(3000);
	//	driver.findElement(By.xpath("//span[@class='scButton_fontawesome fas fa-calendar-alt']")).click();
	}

	@When("click on Create button")
	public void click_on_create_button() {
		driver.findElement(By.id("sc_b_ins_t")).click();
	}

	@Then("Created DSR pop up will Display")
	public void created_dsr_pop_up_will_display() {
		driver.findElement(By.id("")).click();
	}
}
