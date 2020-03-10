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
		
	}

	@Dado("^pesquisar o produto \"([^\"]*)\"$")
	public void pesquisar_o_produto(String produto) {

	}

	@Quando("^escolher o produto$")
	public void escolher_o_produto() {

	}

	@Entao("^adicionar o produto carrinho$")
	public void adicionar_o_produto_carrinho() {

	}

	@Entao("^a mensagem de item nao encontrado aparecera$")
	public void a_mensagem_de_item_nao_encontrado_aparecera() {

	}

}
