package br.com.keeggo.test.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuscaPage {
	public BuscaPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "1")
	private WebElement itens;

	@FindBy(name = "save_to_cart")
	private WebElement adicionaAoCarrinho;

	@FindBy(name = "quantity")
	private WebElement quantidade;

	@FindBy(id = "Description")
	private WebElement mensagem;

	@FindBy(xpath = "//*[@id=\"productProperties\"]/label")
	private WebElement texto;

	public String produto() {
		return "HP PAVILION 15T TOUCH LAPTOP";
	}

	public String qtdExcedida() {
		return "Oops! We only have 10 in stock. We updated your order accordingly";
	}

	public void escolheItem() {
		itens.click();
	}

	public void adicionaAoCarrinho() {
		adicionaAoCarrinho.click();
	}

	public void quantidade() {
		quantidade.sendKeys("11");
	}

	public String comparaPositivo() {
		return mensagem.getText();
	}

	public String comparaNegativo() {
		return texto.getText();
	}

}