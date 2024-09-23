import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"steps"},
        features = {"src/test/resources/features"},
        plugin = {"pretty","html:reports/CucumberReport/test-report-web.html", "json:reports/CucumberReport/test-report-web.json"}
)
public class runner {
}
