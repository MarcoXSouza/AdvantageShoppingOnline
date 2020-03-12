package br.com.rsinet.hub_BDD.teststeps;

import org.testng.Assert;

import br.com.rsinet.hub_BDD.PageFactory.BuscaPage;
import br.com.rsinet.hub_BDD.PageFactory.HomePage;
import br.com.rsinet.hub_BDD.utilitys.TestContext;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class BuscaSteps {
	private BuscaPage busca;
	private HomePage home;
	private TestContext testContext;

	public BuscaSteps(TestContext context) {
		testContext = context;
		busca = testContext.getPageObjectFactory().getBuscaPage();
		home = testContext.getPageObjectFactory().getHomePage();
	}

	@Dado("eu escolher uma categoria")
	public void eu_escolher_uma_categoria() {
		home.getItemDoMenu();

	}

	@Quando("clicar em algum produto")
	public void clicar_em_algum_produto() {
		busca.escolheItem();

	}

	@Entao("o produto devera ser adicionado ao carrinho")
	public void o_produto_devera_ser_adicionado_ao_carrinho() {
		busca.adicionaAoCarrinho();
		Assert.assertTrue(busca.comparaPositivo().contains(busca.produto()));

	}

	@Quando("adicionar onze produtos no carrinho")
	public void adicionar_onze_produtos_no_carrinho() {
		busca.quantidade();

	}

	@Entao("a mensagem limite atingido aparecera")
	public void a_mensagem_limite_atingido_aparecera() {
		busca.adicionaAoCarrinho();
		Assert.assertTrue(busca.comparaNegativo().equals(busca.qtdExcedida()));

	}

}