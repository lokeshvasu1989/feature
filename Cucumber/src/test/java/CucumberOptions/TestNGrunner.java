package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Feature",
                 glue = "stepDefinitions"
                 )
public class TestNGrunner extends AbstractTestNGCucumberTests {

}
