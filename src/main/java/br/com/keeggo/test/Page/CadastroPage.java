package br.com.keeggo.test.Page;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CadastroPage {

	public static WebDriver driver;
	
	public CadastroPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "countryListboxRegisterPage")
	private WebElement country;
	public void getCountry(String pais) {
		country.click();
		country.sendKeys(pais + Keys.ENTER);
	}

	@FindBy(name = "usernameRegisterPage")
	private WebElement name;
	public void getName(String nome) {
		name.click();
		name.sendKeys(nome);
	}

	@FindBy(name = "emailRegisterPage")
	private WebElement emailReg;
	public void getEmailReg(String email) {
		emailReg.click();
		emailReg.sendKeys(email);
	}

	@FindBy(name = "passwordRegisterPage")
	private WebElement password;
	public void getPassword(String senha) {
		password.click();
		password.sendKeys(senha);
	}

	@FindBy(name = "confirm_passwordRegisterPage")
	private WebElement confirmPassword;
	public void getConfirmPassword(String senha) {
		confirmPassword.click();
		confirmPassword.sendKeys(senha);
	}

	@FindBy(name = "first_nameRegisterPage")
	private WebElement firstName;
	public void getFirstName(String nome) {
		firstName.click();
		firstName.sendKeys(nome);
	}

	@FindBy(name = "last_nameRegisterPage")
	private WebElement lastName;
	public void getLastName(String sobrenome) {
		lastName.click();
		lastName.sendKeys(sobrenome);
	}

	@FindBy(name = "phone_numberRegisterPage")
	private WebElement phone;
	public void getPhone(String telefone) {
		phone.click();
		phone.sendKeys(telefone);
	}

	@FindBy(name = "cityRegisterPage")
	private WebElement city;
	public void getCity(String cidade) {
		city.click();
		city.sendKeys(cidade);
	}

	@FindBy(name = "addressRegisterPage")
	private WebElement address;
	public void getAddress(String endereco) {
		address.click();
		address.sendKeys(endereco);
	}

	@FindBy(name = "state_/_province_/_regionRegisterPage")
	private WebElement state;
	public void getState(String estado) {
		state.click();
		state.sendKeys(estado);
	}

	@FindBy(name = "postal_codeRegisterPage")
	private WebElement zip;
	public void getZip(String cep) {
		zip.click();
		zip.sendKeys(cep);
	}

	@FindBy(name = "i_agree")
	private WebElement aceitarTermos;
	public void getAceitarTermos() {
		aceitarTermos.click();
	}

	@FindBy(id = "register_btnundefined")
	private WebElement btnRegistrar;
	public void getBtnRegistrar() {
		btnRegistrar.click();
	}

	@FindBy(xpath = "//*[@id=\"registerPage\"]/article/sec-form/div[2]/label[1]")
	private WebElement mensagem;
	public void getMensagem() {
		mensagem.sendKeys();
	}

	@FindBy(xpath = "//*[@id='formCover']/div[1]/div[1]/sec-view[1]/div/label")
	private WebElement txtNomeInvalido;
	public void getTxtNomeInvalido() {
		Boolean visivel = txtNomeInvalido.isDisplayed();
		assertTrue(visivel);
	}
	
	@FindBy(xpath = "//*[@id='formCover']/div[1]/div[2]/sec-view[1]/div/label")
	private WebElement txtSenhaInvalido;
	public void getTxtSenhaInvalido() {
		Boolean visivel = txtSenhaInvalido.isDisplayed();
		assertTrue(visivel);
	}

	@FindBy(xpath = "//*[@id='formCover']/div[1]/div[1]/sec-view[2]/div/label")
	private WebElement txtEmailInvalido;
	public void getTxtEmailInvalido() {
		Boolean visivel = txtEmailInvalido.isDisplayed();
		assertTrue(visivel);
	}

	public void getAceitaTermosECadastra() {
		getAceitarTermos();
		getBtnRegistrar();
	}
	
	public void getValidarCadastroInvalido() {
		getTxtNomeInvalido();
		getTxtEmailInvalido();
		getTxtSenhaInvalido();
	}

	public void cadastrarUsuario(String nome, String email, String senha) {
		getName(nome);
		getEmailReg(email);
		getPassword(senha);
		getConfirmPassword(senha);
	}
}
