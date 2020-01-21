package br.com.rsinet.hub_BDD.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import gherkin.lexer.Uk;

public class CadastroPage {
	public static WebDriver driver;
	public CadastroPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "menuUser")
	private WebElement LINKCADASTRO;

	@FindBy(how = How.NAME, using = "countryListboxRegisterPage")
	private WebElement PAIS;

	@FindBy(how = How.NAME, using = "usernameRegisterPage")
	private WebElement NOME;

	@FindBy(how = How.NAME, using = "emailRegisterPage")
	private WebElement EMAIL;

	@FindBy(how = How.NAME, using = "passwordRegisterPage")
	private WebElement SENHA;

	@FindBy(how = How.NAME, using = "confirm_passwordRegisterPage")
	private WebElement CONFIRMARSENHA;

	@FindBy(how = How.NAME, using = "first_nameRegisterPage")
	private WebElement PRIMEIRONOME;

	@FindBy(how = How.NAME, using = "last_nameRegisterPage")
	private WebElement ULTIMONOME;

	@FindBy(how = How.NAME, using = "phone_numberRegisterPage")
	private WebElement TELEFONE;

	@FindBy(how = How.NAME, using = "cityRegisterPage")
	private WebElement CIDADE;

	@FindBy(how = How.NAME, using = "addressRegisterPage")
	private WebElement ENDERECO;

	@FindBy(how = How.NAME, using = "state_/_province_/_regionRegisterPage")
	private WebElement ESTADO;

	@FindBy(how = How.NAME, using = "postal_codeRegisterPage")
	private WebElement CEP;

	@FindBy(how = How.NAME, using = "i_agree")
	private WebElement ACEITARTERMOS;

	@FindBy(how = How.ID, using = "register_btnundefined")
	private WebElement BTNREGISTRAR;

	public void linkCadastro() {
		LINKCADASTRO.click();
	}

	public void nome(String nome) {
		NOME.sendKeys(nome);
	}

	public void pais(String pais) {
		PAIS.sendKeys(pais);
	}

	public void email(String email) {
		EMAIL.sendKeys(email);
	}

	public void senha(String senha) {
		SENHA.sendKeys(senha);
	}

	public void confirmaSenha(String senha) {
		CONFIRMARSENHA.sendKeys(senha);
	}

	public void primeiroNome(String nome) {
		PRIMEIRONOME.sendKeys(nome);
	}

	public void ultimoNome(String ultimoNome) {
		ULTIMONOME.sendKeys(ultimoNome);
	}

	public void telefone(String telefone) {
		TELEFONE.sendKeys(telefone);
	}

	public void cidade(String cidade) {
		CIDADE.sendKeys(cidade);
	}

	public void endereco(String endereco) {
		ENDERECO.sendKeys(endereco);
	}

	public void estado(String estado) {
		ESTADO.sendKeys(estado);
	}

	public void cep(String cep) {
		CEP.sendKeys(cep);
	}

	public void aceitarTermos() {
		ACEITARTERMOS.click();
	}

	public void btnRegistrar() {
		BTNREGISTRAR.click();
	}

}
