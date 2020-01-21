package br.com.rsinet.hub_BDD.teststeps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub_BDD.PageFactory.BuscaPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import sun.security.util.PendingException;

public class BuscaSteps {
	public static WebDriver driver;
	BuscaPage busca = PageFactory.initElements(driver, BuscaPage.class);

	@Given("^Estou na pagina inicial do advantagedemo$")
	public void Estou_na_pagina_inicial_do_advantagedemo() throws Throwable {
		busca.laptop();
	}

	@When("^Eu escolher$")
	public void Eu_escolher() throws Throwable {
		busca.clicaLaptop();
	}

	@When("^clicar em algum produto$")
	public void clicar_em_algum_produto() throws Throwable {
		busca.adicionaAoCarrinho();
	}

	@Then("^O produto devera ser adicionado no carrinho$")
	public void O_produto_devera_ser_adicionado_no_carrinho() throws Throwable {
		busca.fazCheckOut();
	}

	@Then("^A mensagem de adcionado ao carrinho com sucesso aparecera$")
	public void A_mensagem_de_adcionado_ao_carrinho_com_sucesso_aparecera() throws Throwable {
		// Express the Regexp above with the code you wish you had
		throw new PendingException();
	}

}
