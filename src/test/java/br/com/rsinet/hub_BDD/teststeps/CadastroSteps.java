package br.com.rsinet.hub_BDD.teststeps;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_BDD.PageFactory.CadastroPage;
import br.com.rsinet.hub_BDD.utilitys.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CadastroSteps {
	public static WebDriver driver;
	CadastroPage cadastro = new CadastroPage(driver);

	@Given("^Estou na pagina inicial do advantagedemo$")
	public void Estou_na_pagina_inicial_do_advantagedemo() throws Throwable {
		driver = DriverFactory.iniciaNavegador();
	}

	@When("^clicar em novo registro$")
	public void clicar_em_novo_registro() throws Throwable {
		cadastro.linkCadastro();
	}

	@When("^digita o nome \"([^\"]*)\"$")
	public void digita_o_nome(String nome) throws Throwable {
		cadastro.nome(nome);
	}

	@When("^digita o email \"([^\"]*)\"$")
	public void digita_o_email(String email) throws Throwable {
		cadastro.email(email);
	}

	@When("^digita o senha \"([^\"]*)\"$")
	public void digita_o_senha(String senha) throws Throwable {
		cadastro.senha(senha);
	}

	@When("^confirma a senha \"([^\"]*)\"$")
	public void confirma_a_senha(String senha) throws Throwable {
		cadastro.confirmaSenha(senha);
	}

	@When("^digita o primeiro nome \"([^\"]*)\"$")
	public void digita_o_primeiro_nome(String nome) throws Throwable {
		cadastro.primeiroNome(nome);
	}

	@When("^digita o ultimo nome \"([^\"]*)\"$")
	public void digita_o_ultimo_nome(String ultimoNome) throws Throwable {
		cadastro.ultimoNome(ultimoNome);
	}

	@When("^digita o telefone \"([^\"]*)\"$")
	public void digita_o_telefone(String telefone) throws Throwable {
		cadastro.telefone(telefone);
	}

	@When("^seleciona o pais \"([^\"]*)\"$")
	public void seleciona_o_pais(String pais) throws Throwable {
		cadastro.pais(pais);
	}

	@When("^digita o nome da cidade \"([^\"]*)\"$")
	public void digita_o_nome_da_cidade(String cidade) throws Throwable {
		cadastro.cidade(cidade);
	}

	@When("^digita o endereco \"([^\"]*)\"$")
	public void digita_o_endereco(String endereco) throws Throwable {
		cadastro.endereco(endereco);
	}

	@When("^digita o UF do estado \"([^\"]*)\"$")
	public void digita_o_UF_do_estado(String estado) throws Throwable {
		cadastro.estado(estado);
	}

	@When("^digita o CEP \"([^\"]*)\"$")
	public void digita_o_CEP(String cep) throws Throwable {
		cadastro.cep(cep);
	}

	@When("^clica em aceitar os termos$")
	public void clica_em_aceitar_os_termos() throws Throwable {
		cadastro.aceitarTermos();
	}

	@When("^clica em registrar$")
	public void clica_em_registrar() throws Throwable {
		cadastro.btnRegistrar();
	}

	@Then("^O usuario sera cadastrado no site$")
	public void O_usuario_sera_cadastrado_no_site() throws Throwable {

	}

	@Then("^O site retornara para homepage$")
	public void O_site_retornara_para_homepage() throws Throwable {

	}
}
