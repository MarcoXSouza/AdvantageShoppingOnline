package br.com.rsinet.hub_BDD.Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features\\",
		glue = "br.com.rsinet.hub_BDD.teststeps",
		monochrome = true,
		dryRun = false,
		tags = {"@Cadastro_com_sucesso"
		}
		)

	public class CadastroRun {

}
