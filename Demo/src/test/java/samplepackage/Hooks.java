package samplepackage;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import resuablecode.LaunchBrowser;

import java.io.IOException;

public class Hooks extends LaunchBrowser {
    @Before()
    public void preCondition() throws IOException {
        System.out.println("Execution started");
        LaunchBrowser l = new LaunchBrowser();
        l.launchUrl();
    }

    @After()
    public void postCondition(){
        System.out.println("ended");
    }

    @AfterStep
    public void takeScreenshot(Scenario sc){
        byte ss[]= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        sc.attach(ss,"image/png",sc.getName());
    }
}
