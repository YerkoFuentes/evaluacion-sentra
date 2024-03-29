package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import pages.BasePage;

public class Hooks extends BasePage{
    
    public Hooks(){
        super(driver);
    }

    @After(order = 1)
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            //take screenshot:
            scenario.log("Scenario fallando, referirse a la imagen adjunta.");
            final byte[] screenshot =((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Screenshot del error");
        }
    }

    @After(order = 0)
    public static void cleanDriver() throws InterruptedException{
        Thread.sleep(3000);
        BasePage.closeBrowser();
    }
}
