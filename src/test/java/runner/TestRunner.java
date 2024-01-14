package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
    glue = "steps", //src/test/java/steps
    plugin = {"pretty","html:target/cucumber-reports"}
)

public class TestRunner {
    
    @AfterClass
    public static void cleanDriver() throws InterruptedException{
        Thread.sleep(3000);
        BasePage.closeBrowser();
    }
}
