package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "",
        features = "src/test/resources/",
        glue = "steps",

        plugin = "pretty",

        monochrome = true, snippets = CucumberOptions.SnippetType.CAMELCASE, dryRun = false

)
public class ExecutarCucumber {
}
