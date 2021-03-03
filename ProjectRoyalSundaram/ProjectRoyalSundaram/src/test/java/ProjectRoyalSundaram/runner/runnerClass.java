package ProjectRoyalSundaram.runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;





@RunWith(Cucumber.class)

@CucumberOptions (
	features = {"src/test/java/ProjectRoyalSundaram/featurefile/"},
			glue = {"ProjectRoyalSundaram.steps"},
			monochrome=true,
			tags = "@carinsurance"
//	plugin = {"pretty", "html:target/autocare",
//				"json:target/autocare.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

)




public class runnerClass {

}
