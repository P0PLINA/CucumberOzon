import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "d:/JavaPractice/src/test/resources",
        tags="@all"
)
public class Run {

}