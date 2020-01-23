package br.com.rsinet.hub_BDD.PageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	public static WebDriver driver;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "menuUser")
	private WebElement LINKCADASTRO;

	@FindBy(how = How.XPATH, using = "/html/body/login-modal/div/div/div[3]/a[2]")
	private WebElement CRIARCONTA;

	@FindBy(how = How.ID, using = "laptopsImg")
	private WebElement ITEMDOMENU;

	public void Wait() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(CRIARCONTA));

	}

	public void criarConta() {
		CRIARCONTA.sendKeys(Keys.ENTER);
	}

	public void linkCadastro() {
		LINKCADASTRO.click();
	}

	public void escolheItem() {
		ITEMDOMENU.click();
	}

}
