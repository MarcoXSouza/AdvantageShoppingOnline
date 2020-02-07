package br.com.rsinet.hub_BDD.teststeps;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_BDD.PageFactory.CadastroPage;
import br.com.rsinet.hub_BDD.PageFactory.HomePage;
import br.com.rsinet.hub_BDD.utilitys.DriverFactory;
import br.com.rsinet.hub_BDD.utilitys.PageObjectManager;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CadastroSteps {

	private static WebDriver driver;
	HomePage home;
	CadastroPage cadastro;
	PageObjectManager pageObjectManager;

	@Before
	@Dado("^estou na homepage do advantagedemo$")
	public void estou_na_homepage_do_advantagedemo() {
		driver = DriverFactory.iniciaNavegador();
		pageObjectManager = new PageObjectManager(driver);
		home = pageObjectManager.getHomePage();
		home.linkCadastro();
	}

	@Quando("^clicar em novo registro$")
	public void clicar_em_novo_registro() throws InterruptedException {
		Thread.sleep(2000);
		home.criarConta();
	}

	@Test
	@Quando("^usuario preenche cadastro$")
	public void usuario_preenche_cadastro() throws Exception {
		cadastro = pageObjectManager.getCadastroPage();
		cadastro.preencehNome();
		cadastro.preencheCadastro();

	}

	@Quando("^clica em aceitar os termos$")
	public void clica_em_aceitar_os_termos() {
		cadastro.aceitarTermos();
	}

	@Quando("^clica em registrar$")
	public void clica_em_registrar() throws InterruptedException {
		cadastro.btnRegistrar();
		

	}

	@Entao("^o usuario sera cadastrado no site$")
	public void o_usuario_sera_cadastrado_no_site() throws Exception {
		cadastro.pagInicial();
//		Snapshot.takeSnapShot("Cadastro Sucesso BDD", driver);
		DriverFactory.fechaDriver(driver);
	}

	@Test
	@Quando("^preencher os dados do novo Usuario$")
	public void preencher_os_dados_do_novo_Usuario() throws Exception {
		cadastro.preencehNomeInvalido();
		cadastro.preencheCadastro();
	}

	@Quando("^aceitar os termos$")
	public void aceitar_os_termos() {
		cadastro.aceitarTermos();
	}

	@Quando("^finalizar o cadastro$")
	public void finalizar_o_cadastro() throws InterruptedException {
		cadastro.btnRegistrar();
	}

	@Entao("^mensagem de usuario ja cadastrado$")
	public void mensagem_de_usuario_ja_cadastrado() throws Exception {
		cadastro.nomeInvalido();
//		Snapshot.takeSnapShot("Cadastro Falha BDD", driver);
		DriverFactory.fechaDriver(driver);
	}

}