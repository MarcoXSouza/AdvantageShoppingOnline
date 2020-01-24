package br.com.rsinet.hub_BDD.teststeps;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_BDD.PageFactory.CadastroPage;
import br.com.rsinet.hub_BDD.PageFactory.HomePage;
import br.com.rsinet.hub_BDD.utilitys.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CadastroFalha {
	private static WebDriver driver;

//	@When("^Clicar em criar novo Registro$")
//	public void Clicar_em_criar_novo_Registro() throws InterruptedException {
//		HomePage home = new HomePage(driver);
//		Thread.sleep(2000);
//		home.criarConta();
//	}

	@When("^Preencher os dados do novo Usuario$")
	public void Preencher_os_dados_do_novo_Usuario() throws Exception {
		CadastroPage cadastro = new CadastroPage(driver);
		cadastro.preencheCadastro();
	}

	@When("^Aceitar os termos$")
	public void Aceitar_os_termos() {
		CadastroPage cadastro = new CadastroPage(driver);
		cadastro.aceitarTermos();
	}

	@When("^Finalizar o cadastro$")
	public void Finalizar_o_cadastro() {
		CadastroPage cadastro = new CadastroPage(driver);
		cadastro.btnRegistrar();
	}

	@Then("^Mensagem de usuario ja cadastrado$")
	public void Mensagem_de_usuario_ja_cadastrado() {
		
	}

}
