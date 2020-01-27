package br.com.rsinet.hub_BDD.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub_BDD.utilitys.Constantes;
import br.com.rsinet.hub_BDD.utilitys.ExcelData;
import br.com.rsinet.hub_BDD.utilitys.ExcelUtils;

public class CadastroPage {
	public static WebDriver driver;

	public CadastroPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

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

	public void aceitarTermos() {
		ACEITARTERMOS.click();
	}

	public void btnRegistrar() {
		BTNREGISTRAR.click();
	}

	public void preencheCadastro() throws Exception {
		ExcelUtils.setExcelFile(Constantes.path, "Cadastro");
		NOME.sendKeys(ExcelData.nome);
		PAIS.sendKeys(ExcelData.pais);
		EMAIL.sendKeys(ExcelData.email);
		SENHA.sendKeys(ExcelData.senha);
		CONFIRMARSENHA.sendKeys(ExcelData.senha);
		PRIMEIRONOME.sendKeys(ExcelData.nome);
		ULTIMONOME.sendKeys(ExcelData.ultimoNome);
		TELEFONE.sendKeys(ExcelData.telefone);
		CIDADE.sendKeys(ExcelData.cidade);
		ENDERECO.sendKeys(ExcelData.endereco);
		ESTADO.sendKeys(ExcelData.estado);
		CEP.sendKeys(ExcelData.cep);
	}

	public void valida() {
	}
	
	
	
}
