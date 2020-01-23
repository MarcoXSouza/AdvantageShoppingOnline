package br.com.rsinet.hub_BDD.teststeps;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_BDD.PageFactory.HomePage;
import br.com.rsinet.hub_BDD.PageFactory.LupaPage;
import br.com.rsinet.hub_BDD.utilitys.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LupaSteps {

	public static WebDriver driver;

	@Given("^Estou no site advantagedemo na pagina inicial$")
	public void Estou_no_site_advantagedemo_na_pagina_inicial() throws Throwable {
		driver = DriverFactory.iniciaNavegador();
	}

	@When("^clicar na lupa$")
	public void clicar_na_lupa() throws Throwable {
		HomePage home = new HomePage(driver);
		home.menu();
	}

	@When("^digitar o produto desejado$")
	public void digitar_o_produto_desejado() throws Throwable {
		HomePage home = new HomePage(driver);
		home.digita();
	}

	@When("^escolher o produto$")
	public void escolher_o_produto() throws Throwable {
		LupaPage lupa = new LupaPage(driver);
		lupa.produto();
	}

	@Then("^O produto devera ser adicionado no carrinho$")
	public void O_produto_devera_ser_adicionado_no_carrinho() throws Throwable {
		LupaPage lupa = new LupaPage(driver);
		lupa.adicionaAoCarrinho();
	}

	@Then("^A mensagem de adcionado ao carrinho com sucesso aparecera$")
	public void A_mensagem_de_adcionado_ao_carrinho_com_sucesso_aparecera() throws Throwable {
		LupaPage lupa = new LupaPage(driver);
		lupa.fazerCheckOut();
		DriverFactory.fechaDriver(driver);
	}
}

