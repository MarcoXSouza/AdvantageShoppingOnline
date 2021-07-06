package br.com.keeggo.test.Page;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public static WebDriver driver;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "menuUser")
	private WebElement btnCadastro;
	public void getClicarBtnCadastro() {
		btnCadastro.click();
	}

	@FindBy(xpath = "/html/body/login-modal/div/div/div[3]/a[2]")
	private WebElement criarConta;
	public void getCriarConta() {
		criarConta.sendKeys(Keys.ENTER);
	}

	@FindBy(id = "laptopsImg")
	private WebElement itemDoMenu;
	public void getItemDoMenu() {
		itemDoMenu.click();
	}

	@FindBy(id = "menuSearch")
	private WebElement menu;
	public void getMenu() {
		menu.click();
	}

	@FindBy(id = "autoComplete")
	private WebElement digita;
	public void getDigita(String produto) {
		digita.sendKeys(produto + Keys.ENTER);
	}
	
	@FindBy(xpath = "/html/body/login-modal/div/div/div[3]/span")
	private WebElement btnFacebook;
	public void getClicaBtnFacebook() {
		btnFacebook.click();
	}
	
	@FindBy(id = "signInResultMessage")
	private WebElement lblErroFacebook;
	public void getValidaErroFacebook() {
		Boolean visivel = lblErroFacebook.isDisplayed();
		assertTrue(visivel);
	}
	
	@FindBy(name = "username")
	private WebElement fldUsuario;
	public void getPreencherUsuario(String usuario) {
		fldUsuario.sendKeys(usuario);
	}
	
	@FindBy(name = "password")
	private WebElement fldSenha;
	public void getPreencherSenha(String senha) {
		fldSenha.sendKeys(senha);
	}
	
	@FindBy(id = "sign_in_btnundefined")
	private WebElement btnSingIn;
	public void getClicarBtnSingIn() {
		btnSingIn.click();
	}
	
	@FindBy(xpath = "//*[@id='menuUserLink']/span")
	private WebElement lblUsuarioSucesso;
	public void getValidarLoginComSucesso(String usuario) {
		String nome = lblUsuarioSucesso.getText();
		Boolean visivel = nome.contains(usuario);
		assertTrue(visivel);
	}
	
	@FindBy(id = "signInResultMessage")
	private WebElement lblUsuarioInvalido;
	public void getValidarUsuarioInvalido() {
		Boolean visivel = lblUsuarioInvalido.isDisplayed();
		assertTrue(visivel);
		
	}

	public void getFazerLogin(String usuario, String senha) {
		getPreencherUsuario(usuario);
		getPreencherSenha(senha);
		getClicarBtnSingIn();
	}
	
	public void getClicarCriarNovaConta() {
		getClicarBtnCadastro();
		getCriarConta();
	}
	
	

}
