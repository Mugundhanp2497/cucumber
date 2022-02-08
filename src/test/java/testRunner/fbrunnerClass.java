package testRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\resources\\featureFile\\fbscrnario.feature",glue="stepDefinition",
dryRun=false,monochrome=false,strict=true,tags= {"@people"},
plugin={"html:C:\\Users\\mugunthan\\eclipse-workspace\\cucumberframe\\report all\\html\\fbone.html",
		"json:C:\\Users\\mugunthan\\eclipse-workspace\\cucumberframe\\report all\\json\\fbone.json",
		"junit:C:\\Users\\mugunthan\\eclipse-workspace\\cucumberframe\\report all\\junit\\fbone.junit"})
public class fbrunnerClass
{
	@AfterClass
	public static void meth()
	{
		jvmreport.repmeth("C:\\Users\\mugunthan\\eclipse-workspace\\cucumberframe\\report all\\json\\fbone.json");
	}

}
