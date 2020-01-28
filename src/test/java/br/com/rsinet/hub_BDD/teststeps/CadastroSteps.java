package br.com.rsinet.hub_BDD.teststeps;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_BDD.PageFactory.CadastroPage;
import br.com.rsinet.hub_BDD.PageFactory.HomePage;
import br.com.rsinet.hub_BDD.utilitys.DriverFactory;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CadastroSteps {

	private static WebDriver driver;

	@Before
	@Dado("^estou na homepage do advantagedemo$")
	public void estou_na_homepage_do_advantagedemo() {
		driver = DriverFactory.iniciaNavegador();
		HomePage clicaLink = new HomePage(driver);
		clicaLink.linkCadastro();
	}

	@Quando("^clicar em novo registro$")
	public void clicar_em_novo_registro() throws InterruptedException {
		HomePage botaoConta = new HomePage(driver);
		Thread.sleep(2000);
		botaoConta.criarConta();
	}

	@Test
	@Quando("^usuario preenche cadastro$")
	public void usuario_preenche_cadastro() throws Exception {
		CadastroPage preencher = new CadastroPage(driver);
		preencher.preencehNome();
		preencher.preencheCadastro();

	}

	@Quando("^clica em aceitar os termos$")
	public void clica_em_aceitar_os_termos() {
		CadastroPage termos = new CadastroPage(driver);
		termos.aceitarTermos();
	}

	@Quando("^clica em registrar$")
	public void clica_em_registrar() throws InterruptedException {
		CadastroPage registrar = new CadastroPage(driver);
		registrar.btnRegistrar();
		

	}

	@Entao("^o usuario sera cadastrado no site$")
	public void o_usuario_sera_cadastrado_no_site() {
		CadastroPage validaCadastro = new CadastroPage(driver);
		validaCadastro.pagInicial();
		DriverFactory.fechaDriver(driver);
	}

	@Test
	@Quando("^preencher os dados do novo Usuario$")
	public void preencher_os_dados_do_novo_Usuario() throws Exception {
		CadastroPage cadastro = new CadastroPage(driver);
		cadastro.preencehNomeInvalido();
		cadastro.preencheCadastro();
	}

	@Quando("^aceitar os termos$")
	public void aceitar_os_termos() {
		CadastroPage termos = new CadastroPage(driver);
		termos.aceitarTermos();
	}

	@Quando("^finalizar o cadastro$")
	public void finalizar_o_cadastro() throws InterruptedException {
		CadastroPage registrar = new CadastroPage(driver);
		registrar.btnRegistrar();
	}

	@Entao("^mensagem de usuario ja cadastrado$")
	public void mensagem_de_usuario_ja_cadastrado() {
		CadastroPage validaNome = new CadastroPage(driver);
		validaNome.nomeInvalido();
		DriverFactory.fechaDriver(driver);
	}

}