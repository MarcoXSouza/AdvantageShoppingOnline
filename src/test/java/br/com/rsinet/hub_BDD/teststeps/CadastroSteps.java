package br.com.rsinet.hub_BDD.teststeps;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_BDD.PageFactory.CadastroPage;
import br.com.rsinet.hub_BDD.PageFactory.HomePage;
import br.com.rsinet.hub_BDD.utilitys.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CadastroSteps {

	private static WebDriver driver;

	@Before
	@Given("^Estou na homepage do advantagedemo$")
	public void Estou_na_homepage_do_advantagedemo() {
		driver = DriverFactory.iniciaNavegador();
		HomePage home = new HomePage(driver);
		home.linkCadastro();
	}

	@When("^clicar em novo registro$")
	public void clicar_em_novo_registro() throws InterruptedException {
		HomePage home = new HomePage(driver);
		Thread.sleep(2000);
		home.criarConta();
	}

	@Test
	@When("^Usuario preenche cadastro$")
	public void Usuario_preenche_cadastro() throws Exception {
		CadastroPage cadastro = new CadastroPage(driver);
		cadastro.preencheCadastro();

	}

	@When("^clica em aceitar os termos$")
	public void clica_em_aceitar_os_termos() {
		CadastroPage cadastro = new CadastroPage(driver);
		cadastro.aceitarTermos();
	}

	@When("^clica em registrar$")
	public void clica_em_registrar() {
		CadastroPage cadastro = new CadastroPage(driver);
		cadastro.btnRegistrar();
	}

	@Then("^O usuario sera cadastrado no site$")
	public void O_usuario_sera_cadastrado_no_site() {
		
		DriverFactory.fechaDriver(driver);
	}

	@Test
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
		String mensagem = "";
		assertTrue("", mensagem.equals(""));
		DriverFactory.fechaDriver(driver);
	}

}