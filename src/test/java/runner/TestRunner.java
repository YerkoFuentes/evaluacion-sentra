package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
    glue = {"steps"}, //src/test/java/steps
    tags = ("@Test"),
    plugin = {"pretty", "html:target/cucumber-reports"}
)

public class TestRunner{

}
