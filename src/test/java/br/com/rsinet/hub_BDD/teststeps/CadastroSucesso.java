package br.com.rsinet.hub_BDD.teststeps;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_BDD.PageFactory.CadastroPage;
import br.com.rsinet.hub_BDD.PageFactory.HomePage;
import br.com.rsinet.hub_BDD.utilitys.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CadastroSucesso {

	private static WebDriver driver;

	@Given("^Estou na homepage do advantagedemo$")
	public void Estou_na_homepage_do_advantagedemo() throws Throwable {
		driver = DriverFactory.iniciaNavegador();
		HomePage home = new HomePage(driver);
		home.linkCadastro();
	}

	@When("^clicar em novo registro$")
	public void clicar_em_novo_registro() throws Throwable {
		HomePage home = new HomePage(driver);
		Thread.sleep(2000);
		home.criarConta();
	}

	@When("^Usuario preenche cadastro$")
	public void Usuario_preenche_cadastro() throws Exception {
		CadastroPage cadastro = new CadastroPage(driver);
		cadastro.preencheCadastro();

	}

	@When("^clica em aceitar os termos$")
	public void clica_em_aceitar_os_termos() throws Throwable {
		CadastroPage cadastro = new CadastroPage(driver);
		cadastro.aceitarTermos();
	}

	@When("^clica em registrar$")
	public void clica_em_registrar() throws Throwable {
		CadastroPage cadastro = new CadastroPage(driver);
		cadastro.btnRegistrar();
	}

	@Then("^O usuario sera cadastrado no site$")
	public void O_usuario_sera_cadastrado_no_site() throws Throwable {
		DriverFactory.fechaDriver(driver);
	}
}