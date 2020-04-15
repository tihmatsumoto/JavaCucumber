import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:/features",
        glue = "",
        plugin = {"pretty", "html:target/cucumber-html-report", "json:cucumber.json"} )

public class Runner {
}
