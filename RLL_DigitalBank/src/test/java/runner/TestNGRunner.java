package runner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
//@Listeners(value= {ITestListenerClass.class})
@CucumberOptions(features="C:\\Users\\lenovo\\Desktop\\RLL_Project\\RLL_DigitalBank\\RLL_DigitalBank\\src\\test\\java\\features",
glue={"stepDefinitions","pages"},
plugin= {"pretty","html:target/sample.html",
		"json:target/stepdefinition.json","junit:target/stepReport.xml",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:targer/extentsampleReport.html"},
		monochrome =true)

public class TestNGRunner extends AbstractTestNGCucumberTests  
{
	//Runs each cucumber scenario found in the features as separated test
	
}