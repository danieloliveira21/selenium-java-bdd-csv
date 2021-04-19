package RunTest;


import commons.BaseTest;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
        dryRun = false,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"pretty", "html:report/report.html"},
        features = {"./src/test/resources/"},
        glue = {"steps", "configuration",
                "commons", "bean"},
        tags = "@CT-001")
public class RunTest extends BaseTest {

}
