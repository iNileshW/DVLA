package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

	@RunWith(Cucumber.class)
	@CucumberOptions 
	(
	features = 
	"C:\\Users\\nwairagade\\eclipse-workspace\\Test_Workspace\\MOT\\src\\test\\java\\features\\service_layer_bean.feature",	
	glue = {"step_definitions"}
	,plugin = {"pretty","html:test-output", "json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"}
	, dryRun = false
	,monochrome = true		
	, strict = true		
	)

public class service_layer_bean_TestRunner {

}
