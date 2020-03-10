package br.com.rsinet.hub_BDD.PageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CadastroPage {
	public static WebDriver driver;

	public CadastroPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.NAME, using = "countryListboxRegisterPage")
	private WebElement country;

	@FindBy(how = How.NAME, using = "usernameRegisterPage")
	private WebElement name;

	@FindBy(how = How.NAME, using = "emailRegisterPage")
	private WebElement emailReg;

	@FindBy(how = How.NAME, using = "passwordRegisterPage")
	private WebElement password;

	@FindBy(how = How.NAME, using = "confirm_passwordRegisterPage")
	private WebElement confirmPassword;

	@FindBy(how = How.NAME, using = "first_nameRegisterPage")
	private WebElement firstName;

	@FindBy(how = How.NAME, using = "last_nameRegisterPage")
	private WebElement lastName;

	@FindBy(how = How.NAME, using = "phone_numberRegisterPage")
	private WebElement phone;

	@FindBy(how = How.NAME, using = "cityRegisterPage")
	private WebElement city;

	@FindBy(how = How.NAME, using = "addressRegisterPage")
	private WebElement address;

	@FindBy(how = How.NAME, using = "state_/_province_/_regionRegisterPage")
	private WebElement state;

	@FindBy(how = How.NAME, using = "postal_codeRegisterPage")
	private WebElement zip;

	@FindBy(how = How.NAME, using = "i_agree")
	private WebElement aceitarTermos;

	@FindBy(how = How.ID, using = "register_btnundefined")
	private WebElement btnRegistrar;

	@FindBy(how = How.XPATH, using = "//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[1]/div/label")
	private WebElement mensagem;

	public void getCountry(String pais) {
		country.click();
		country.sendKeys(pais + Keys.ENTER);
	}

	public void getName(String nome) {
		name.click();
		name.sendKeys(nome);
	}

	public void getEmailReg(String email) {
		emailReg.click();
		emailReg.sendKeys(email);
	}

	public void getPassword(String senha ) {
		password.click();
		password.sendKeys(senha);
	}

	public void getConfirmPassword(String senha) {
		confirmPassword.click();
		confirmPassword.sendKeys(senha);
	}

	public void getFirstName(String nome) {
		firstName.click();
		firstName.sendKeys(nome);
	}

	public void getLastName(String sobrenome) {
		lastName.click();
		lastName.sendKeys(sobrenome);
	}

	public void getPhone(String telefone) {
		phone.click();
		phone.sendKeys(telefone);
	}

	public void getCity(String cidade) {
		city.click();
		city.sendKeys(cidade);
	}

	public void getAddress(String endereco) {
		address.click();
		address.sendKeys(endereco);
	}

	public void getState(String estado) {
		state.click();
		state.sendKeys(estado);
	}

	public void getZip(String cep) {
		zip.click();
		zip.sendKeys(cep);
	}

	public void getAceitarTermos() {
		aceitarTermos.click();
	}

	public void getBtnRegistrar() {
		btnRegistrar.click();
	}

	public void getMensagem() {
		mensagem.sendKeys();
	}

}
//	public void aceitarTermos() {
//		ACEITARTERMOS.click();
//	}
//
//	public void btnRegistrar() throws InterruptedException {
//		BTNREGISTRAR.click();
//		Thread.sleep(1000);
//	}

//	public void nomeInvalido() {
//		String mensagem = MENSAGEM.getText();
//		Assert.assertTrue(mensagem.equals("Use maximum 15 character"));
//	}
//	
//	public void pagInicial() {
//		String usuarioLogado = driver.getCurrentUrl();
//		Assert.assertTrue(usuarioLogado.equals("https://www.advantageonlineshopping.com/#/"));
//
//	}
//	