package br.com.rsinet.hub_BDD.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CadastroPage {

	public static WebDriverWait wait;
	public static WebDriver driver;

	public CadastroPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "countryListboxRegisterPage")
	private WebElement country;

	@FindBy(name = "usernameRegisterPage")
	private WebElement name;

	@FindBy(name = "emailRegisterPage")
	private WebElement emailReg;

	@FindBy(name = "passwordRegisterPage")
	private WebElement password;

	@FindBy(name = "confirm_passwordRegisterPage")
	private WebElement confirmPassword;

	@FindBy(name = "first_nameRegisterPage")
	private WebElement firstName;

	@FindBy(name = "last_nameRegisterPage")
	private WebElement lastName;

	@FindBy(name = "phone_numberRegisterPage")
	private WebElement phone;

	@FindBy(name = "cityRegisterPage")
	private WebElement city;

	@FindBy(name = "addressRegisterPage")
	private WebElement address;

	@FindBy(name = "state_/_province_/_regionRegisterPage")
	private WebElement state;

	@FindBy(name = "postal_codeRegisterPage")
	private WebElement zip;

	@FindBy(name = "i_agree")
	private WebElement aceitarTermos;

	@FindBy(id = "register_btnundefined")
	private WebElement btnRegistrar;

	@FindBy(xpath = "//*[@id=\"registerPage\"]/article/sec-form/div[2]/label[1]")
	private WebElement mensagem;

	@FindBy(xpath = "//*[@id=\"menuUserLink\"]/span")
	private WebElement usuario;

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

	public void getPassword(String senha) {
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

	public String usuarioJaExiste() {
		return mensagem.getText();

	}

	public String rerultadoBuscaNegativa() throws InterruptedException {
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'No results for ')]")));
		return driver.findElement(By.xpath("//span[contains(text(),'No results for ')]")).getText();

	}

	public void getWait() {
//		Wait.untilPageLoadComplete(DriverFactory.getDriver());
	}

	public String usuarioLogado() {
		return usuario.getText();
	}
}
