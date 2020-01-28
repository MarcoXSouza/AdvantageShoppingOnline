package br.com.rsinet.hub_BDD.teststeps;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_BDD.PageFactory.HomePage;
import br.com.rsinet.hub_BDD.PageFactory.LupaPage;
import br.com.rsinet.hub_BDD.utilitys.DriverFactory;
import br.com.rsinet.hub_BDD.utilitys.Snapshot;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class LupaSteps {

	public static WebDriver driver;

	@Before
	@Dado("^estou no site advantagedemo na pagina inicial$")
	public void estou_no_site_advantagedemo_na_pagina_inicial()   {
		driver = DriverFactory.iniciaNavegador();
	}

	@Quando("^clicar na lupa$")
	public void clicar_na_lupa() throws Exception {
		HomePage home = new HomePage(driver);
		home.menu();
	}

	@Test
	@Quando("^digitar o produto desejado$")
	public void digitar_o_produto_desejado() throws Exception   {
		HomePage homeBarra = new HomePage(driver);
		homeBarra.digita();
	}

	@Quando("^escolher o produto$")
	public void escolher_o_produto()   {
		LupaPage escolheProduto = new LupaPage(driver);
		escolheProduto.produto();
	}

	@Entao("^o produto devera ser adicionado no carrinho$")
	public void o_produto_devera_ser_adicionado_no_carrinho()   {
		LupaPage carrinho = new LupaPage(driver);
		carrinho.adicionaAoCarrinho();
	}

	@Entao("^a mensagem de adcionado ao carrinho com sucesso aparecera$")
	public void a_mensagem_de_adcionado_ao_carrinho_com_sucesso_aparecera() throws Exception {
		LupaPage confere = new LupaPage(driver);
		confere.verificaCarrinho();
		Snapshot.takeSnapShot("Lupa Sucesso BDD", driver);
		DriverFactory.fechaDriver(driver);
	}

	@Test
	@Quando("^digitar o item que deseja$")
	public void digitar_o_item_que_deseja() throws Exception {
		HomePage home = new HomePage(driver);
		home.digitaFalha();
	}

	@Entao("^a mensagem de item nao encontrado aparecera$")
	public void a_mensagem_de_item_nao_encontrado_aparecera() throws Exception {
		LupaPage pesquisa = new LupaPage(driver);
		pesquisa.buscaInvalida();
		Snapshot.takeSnapShot("Falha na Lupa BDD", driver);
		DriverFactory.fechaDriver(driver);
	}
}
