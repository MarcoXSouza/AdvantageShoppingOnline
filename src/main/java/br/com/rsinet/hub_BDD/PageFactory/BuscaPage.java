package br.com.rsinet.hub_BDD.PageFactory;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class BuscaPage {
	public BuscaPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "1")
	private WebElement ITENS;

	@FindBy(how = How.NAME, using = "save_to_cart")
	private WebElement ADICIONAAOCARRINHO;

	@FindBy(how = How.NAME, using = "quantity")
	private WebElement QUANTIDADE;

	@FindBy(how = How.ID, using = "Description")
	private WebElement MENSAGEM;

	@FindBy(how = How.XPATH, using = "//*[@id=\"productProperties\"]/label")
	private WebElement TEXTO;

	public void escolheItem() {
		ITENS.click();
	}

	public void adicionaAoCarrinho() {
		ADICIONAAOCARRINHO.click();
	}

	public void quantidade() {
		QUANTIDADE.sendKeys("11");
	}

	public void comparaPositivo() {
		String text = MENSAGEM.getText();
		Assert.assertTrue(text.contains("HP PAVILION 15T TOUCH LAPTOP"));
	}
	
	public void comparaNegativo() {
		String text = TEXTO.getText();
		Assert.assertTrue(text.equals("Oops! We only have 10 in stock. We updated your order accordingly"));
	}
	
}