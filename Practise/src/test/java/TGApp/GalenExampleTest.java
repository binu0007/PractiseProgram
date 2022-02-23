package TGApp;
import com.galenframework.api.Galen;
import com.galenframework.reports.GalenTestInfo;
import com.galenframework.reports.HtmlReportBuilder;
import com.galenframework.reports.model.LayoutReport;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by can on 29/01/17.
 */
public class GalenExampleTest
{
    private WebDriver driver;

    @BeforeTest
    public void setUp()
    {
    	System.setProperty("webdriver.chrome.driver", "../Practise/src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1200, 800));
        driver.get("http://www.swtestacademy.com/");
    }

    @Test
    public void homePageLayoutTest() throws IOException
    {
        //Create a layoutReport object
        //checkLayout function checks the layout and returns a LayoutReport object
        LayoutReport layoutReport = Galen.checkLayout(driver, "../Practise/src/test/java/TGApp/homePage.gspec", Arrays.asList("desktop"));

        //Create a tests list
        List<GalenTestInfo> tests = new LinkedList<GalenTestInfo>();

        //Create a GalenTestInfo object
        GalenTestInfo test = GalenTestInfo.fromString("homepage layout");

        //Get layoutReport and assign to test object
        test.getReport().layout(layoutReport, "check homepage layout");

        //Add test object to the tests list
        tests.add(test);

        //Create a htmlReportBuilder object
        HtmlReportBuilder htmlReportBuilder = new HtmlReportBuilder();

        //Create a report under /target folder based on tests list
        htmlReportBuilder.build(tests, "target");

        //If layoutReport has errors Assert Fail
        if (layoutReport.errors() > 0)
        {
            Assert.fail("Layout test failed");
        }
    }

    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }

}