package samplepackage;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/demo"},
         glue = {"samplepackage"},
        tags = "@lm",
        plugin = {"pretty",
                "json:target/testoutput/jsonreport.json",
                "html:target/testoutput/report.html",
                "junit:target/testoutput/xmlreport.xml"
        }
)
public class Runner {
}
