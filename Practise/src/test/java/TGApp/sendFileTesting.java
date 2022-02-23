package TGApp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class sendFileTesting {

	public static void main(String[] args) throws Throwable
	{

		System.setProperty("webdriver.chrome.driver", "../Practise/src/main/resources/chromedriver.exe");
		
		/*
		 * DesiredCapabilities caps = new DesiredCapabilities();
		 * caps.setCapability("browserName", "chrome"); caps.setCapability("version",
		 * "98.0"); RemoteWebDriver driver = new RemoteWebDriver(new
		 * URL("http://10.60.23.64/wd/hub"), caps);
		 */
		WebDriver driver=new ChromeDriver();
		
		
	//	WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.truglobal.com/job/practice_head_service_now/");
		driver.findElement(By.xpath("//button[text()='Apply now']")).click();
		
		driver.findElement(By.name("job_applicant_name")).sendKeys("Binu");
	//	driver.findElement(By.id("file_attach-resume")).sendKeys("D:/binu.doc");


	}

}
