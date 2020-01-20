package br.com.rsinet.hub_BDD.PageFActory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BuscaPage {

	@FindBy(how = How.ID, using = "laptopsImg")
	private WebElement laptop;

	@FindBy(how = How.ID, using = "HP Chromebook 14 G1(ES)")
	private WebElement clicaLaptop;
	
	@FindBy(how = How.ID, using = "save_to_cart")
	private WebElement adicionaAoCarrinho;
	
	@FindBy(how = How.ID, using = "checkOutPopUp")
	private WebElement fazCheckOut;

	public void Laptop() {
		laptop.click();
	}

	public void ClicaLaptop() {
		return clicaLaptop;
	}

	public WebElement AdicionaAoCarrinho() {
		return adicionaAoCarrinho;
	}

	public WebElement FazCheckOut() {
		return fazCheckOut;
	}

	
	
}
