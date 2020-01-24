package br.com.rsinet.hub_BDD.Run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features\\Lupa.feature",
		glue = "br.com.rsinet.hub_BDD.teststeps",
		monochrome = true,
		dryRun = false,
		tags = {"@Pesquisa_pela_Lupa"} 
		)
public class LupaRunner {

}
