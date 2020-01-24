package br.com.rsinet.hub_BDD.teststeps;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_BDD.PageFactory.BuscaPage;
import br.com.rsinet.hub_BDD.PageFactory.HomePage;
import br.com.rsinet.hub_BDD.utilitys.DriverFactory;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class BuscaSteps {
	private WebDriver driver;

	@Dado("^que estou na pagina inicial do advantagedemo$")
	public void que_estou_na_pagina_inicial_do_advantagedemo() {
		driver = DriverFactory.iniciaNavegador();
		HomePage home = new HomePage(driver);
		home.escolheItem();
	}

	@Quando("^eu escolher$")
	public void eu_escolher() {
		BuscaPage busca = new BuscaPage(driver);
		busca.clicaLaptop();
	}

	@Quando("^clicar em algum produto$")
	public void clicar_em_algum_produto() {
		BuscaPage busca = new BuscaPage(driver);
		busca.adicionaAoCarrinho();
	}

	@Entao("^o produto devera ser adicionado ao carrinho$")
	public void o_produto_devera_ser_adicionado_ao_carrinho() {
		BuscaPage busca = new BuscaPage(driver);
		busca.fazCheckOut();
	}

	@Entao("^a mensagem de adcionado ao carrinho aparecera$")
	public void a_mensagem_de_adcionado_ao_carrinho_aparecera() {
//	boolean mensagem = false;
//	Assert.assertTrue("", mensagem);
	}
	
	@Entao("^fecha o navegador$")
	public void fecha_o_navegador() {
		DriverFactory.fechaDriver(driver);
		
	}
	@Quando("^eu escolher um item$")
	public void eu_escolher_um_item() {
		BuscaPage busca = new BuscaPage(driver);
		HomePage home = new HomePage(driver);
		home.escolheItem();
		busca.clicaLaptop();
	}

	@Quando("^adicionar onze produtos no carrinho$")
	public void adicionar_onze_produtos_no_carrinho() {
		BuscaPage busca = new BuscaPage(driver);
		busca.quantidade();
	}

	@Quando("^clicar em algum item$")
	public void clicar_em_algum_item() {
		BuscaPage busca = new BuscaPage(driver);
		busca.adicionaAoCarrinho();
		busca.fazCheckOut();
	}

	@Entao("^a mensagem limite atingido aparecera$")
	public void a_mensagem_limite_atingido_aparecera() {
		DriverFactory.fechaDriver(driver);
	}

}
