package steps;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/features", plugin = { "pretty",
        "html:target/site/cucumber-pretty", "json:target/cucumber.json" })

public class TestRunner {

}
