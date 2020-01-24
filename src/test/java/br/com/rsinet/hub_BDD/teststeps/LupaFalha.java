package br.com.rsinet.hub_BDD.teststeps;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_BDD.PageFactory.HomePage;
import br.com.rsinet.hub_BDD.PageFactory.LupaPage;
import br.com.rsinet.hub_BDD.utilitys.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LupaFalha {
	private WebDriver driver;

	@Given("^Estou no inicio do site advantagedemo na pagina inicial$")
	public void Estou_no_inicio_do_site_advantagedemo_na_pagina_inicial() {
		driver = DriverFactory.iniciaNavegador();
	}

	@When("^clicar na barra de pesquisa$")
	public void clicar_na_barra_de_pesquisa() {
		HomePage home = new HomePage(driver);
		home.menu();
	}

	@When("^digitar o item que deseja$")
	public void digitar_o_item_que_deseja() {
		HomePage home = new HomePage(driver);
		home.digita();
	}

	@Then("^A mensagem de item nao encontrado aparecera$")
	public void A_mensagem_de_item_nao_encontrado_aparecera() {
		LupaPage lupa = new LupaPage(driver);
		lupa.produto();
	}
}
