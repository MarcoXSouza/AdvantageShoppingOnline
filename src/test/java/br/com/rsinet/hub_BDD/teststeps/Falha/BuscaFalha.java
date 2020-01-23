package br.com.rsinet.hub_BDD.teststeps.Falha;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_BDD.PageFactory.BuscaPage;
import br.com.rsinet.hub_BDD.PageFactory.HomePage;
import br.com.rsinet.hub_BDD.utilitys.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuscaFalha {
	private WebDriver driver;

	@Given("^advantagedemo inicio do site$")
	public void advantagedemo_inicio_do_site() {
		driver = DriverFactory.iniciaNavegador();
	}

	@When("^Eu escolher um item$")
	public void Eu_escolher_um_item() {
		BuscaPage busca = new BuscaPage(driver);
		HomePage home = new HomePage(driver);
		home.escolheItem();
		busca.clicaLaptop();
	}

	@When("^adicionar onze produtos no carrinho$")
	public void adicionar_onze_produtos_no_carrinho() {
		BuscaPage busca = new BuscaPage(driver);
		busca.quantidade();
	}

	@When("^clicar em algum item$")
	public void clicar_em_algum_item() {
		BuscaPage busca = new BuscaPage(driver);
		busca.adicionaAoCarrinho();
		busca.fazCheckOut();
	}

	@Then("^A mensagem limite atingido aparecera$")
	public void A_mensagem_limite_atingido_aparecera() {
		DriverFactory.fechaDriver(driver);
	}
}
