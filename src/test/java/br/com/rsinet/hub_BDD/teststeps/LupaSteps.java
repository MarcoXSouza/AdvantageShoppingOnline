package br.com.rsinet.hub_BDD.teststeps;

import br.com.rsinet.hub_BDD.PageFactory.HomePage;
import br.com.rsinet.hub_BDD.PageFactory.LupaPage;
import br.com.rsinet.hub_BDD.utilitys.TestContext;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;

public class LupaSteps {
	private LupaPage lupa;
	private HomePage home;
	private TestContext testContext;

	public LupaSteps(TestContext context) {
		testContext = context;
		home = testContext.getPageObjectFactory().getHomePage();
		lupa = testContext.getPageObjectFactory().getLupaPage();
	}

	@Dado("^que cliquei na lupa$")
	public void que_cliquei_na_lupa() {
		home.getMenu();
	}

	@Quando("^pesquisar o produto \"([^\"]*)\"$")
	public void pesquisar_o_produto(String produto) {
		home.getDigita(produto);
		lupa.produto();
	}

	@Entao("^escolher produto$")
	public void escolher_produto() {
		lupa.adicionaAoCarrinho();

	}

	@Entao("^a mensagem de item nao encontrado aparecera$")
	public void a_mensagem_de_item_nao_encontrado_aparecera() {

	}

}
