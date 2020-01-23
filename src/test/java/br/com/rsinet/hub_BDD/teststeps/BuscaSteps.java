package br.com.rsinet.hub_BDD.teststeps;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_BDD.PageFactory.BuscaPage;
import br.com.rsinet.hub_BDD.PageFactory.HomePage;
import br.com.rsinet.hub_BDD.utilitys.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuscaSteps {
	private WebDriver driver;

	@Given("^Estou na pagina inicial do advantagedemo$")
	public void Estou_na_pagina_inicial_do_advantagedemo() {
		driver = DriverFactory.iniciaNavegador();
	}

	@When("^Eu escolher$")
	public void Eu_escolher() {
		BuscaPage busca = new BuscaPage(driver);
		HomePage home = new HomePage(driver);
		home.escolheItem();;
		busca.clicaLaptop();
	}

	@When("^clicar em algum produto$")
	public void clicar_em_algum_produto() {
		BuscaPage busca = new BuscaPage(driver);
		busca.adicionaAoCarrinho();
	}

	@Then("^O produto devera ser adicionado ao carrinho$")
	public void O_produto_devera_ser_adicionado_ao_carrinho() {
		BuscaPage busca = new BuscaPage(driver);
		busca.fazCheckOut();
	}

	@Then("^A mensagem de adcionado ao carrinho aparecera$")
	public void A_mensagem_de_adcionado_ao_carrinho_aparecera() {
		DriverFactory.fechaDriver(driver);
	}

}
