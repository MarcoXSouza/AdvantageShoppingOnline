package br.com.rsinet.hub_BDD.Run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\marcos.souza\\Documents\\ProjetoBDD\\workspace\\ProjetoBDD\\features\\Cadastro.feature",
		glue = "br.com.rsinet.hub_BDD.PageFactory",
		monochrome = true,
		dryRun = false,
		tags = {"@Cadastro_de_novo_usuario\r\n"}
		)
public class CadastroRunner {

}
