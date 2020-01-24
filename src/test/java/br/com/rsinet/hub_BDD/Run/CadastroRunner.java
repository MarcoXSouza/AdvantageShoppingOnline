package br.com.rsinet.hub_BDD.Run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features\\Cadastro.feature",
		glue = "br.com.rsinet.hub_BDD.teststeps",
		monochrome = true,
		dryRun = false,
		tags = {"@Cadastro_de_novo_usuario"
				
		}
		)
public class CadastroRunner {

}
//teststeps PageFactory