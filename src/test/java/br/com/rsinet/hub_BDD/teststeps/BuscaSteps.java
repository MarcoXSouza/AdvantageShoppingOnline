package br.com.rsinet.hub_BDD.teststeps;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_BDD.PageFactory.BuscaPage;
import br.com.rsinet.hub_BDD.PageFactory.HomePage;
import br.com.rsinet.hub_BDD.utilitys.DriverFactory;
import br.com.rsinet.hub_BDD.utilitys.Snapshot;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class BuscaSteps {
	private WebDriver driver;

	@Before
	@Dado("^que estou na pagina inicial do advantagedemo$")
	public void que_estou_na_pagina_inicial_do_advantagedemo() {
		driver = DriverFactory.iniciaNavegador();
		HomePage home = new HomePage(driver);
		home.escolheCategoria();
	}
	
	@Test
	@Quando("^eu escolher$")
	public void eu_escolher() {
		BuscaPage busca = new BuscaPage(driver);
		busca.escolheItem();
	}

	@Quando("^clicar em algum produto$")
	public void clicar_em_algum_produto() {
		BuscaPage adcAoCarrinho = new BuscaPage(driver);
		adcAoCarrinho.adicionaAoCarrinho();
	}

	@Entao("^o produto devera ser adicionado ao carrinho$")
	public void o_produto_devera_ser_adicionado_ao_carrinho() throws Exception {
		BuscaPage comparar = new BuscaPage(driver);
		comparar.comparaPositivo();
		Snapshot.takeSnapShot("BuscaSucessoBDD", driver);
		DriverFactory.fechaDriver(driver);
	}

	
	@Test
	@Quando("^eu escolher um item$")
	public void eu_escolher_um_item() {
		BuscaPage busca = new BuscaPage(driver);
		busca.escolheItem();
	}

	@Quando("^adicionar onze produtos no carrinho$")
	public void adicionar_onze_produtos_no_carrinho() {
		BuscaPage quantidade = new BuscaPage(driver);
		quantidade.quantidade();
	}

	@Quando("^clicar em algum item$")
	public void clicar_em_algum_item() {
		BuscaPage carrinho = new BuscaPage(driver);
		carrinho.adicionaAoCarrinho();
	}

	@Entao("^a mensagem limite atingido aparecera$")
	public void a_mensagem_limite_atingido_aparecera() throws Exception {
		BuscaPage compara = new BuscaPage(driver);
		compara.comparaNegativo();
		Snapshot.takeSnapShot("BuscaFalhaBDD", driver);
		DriverFactory.fechaDriver(driver);
	}


}