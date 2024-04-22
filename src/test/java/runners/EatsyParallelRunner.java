package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports",
                "json:target/parallel-cucumber0.json",
                "junit:target/cucumber-reports/Cucumber.xml"},
        features = "src/test/resources/features/eatsy_feature",
        glue = "step_definitions"


)

public class EatsyParallelRunner {

}
