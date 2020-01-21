package br.com.rsinet.hub_BDD.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BuscaPage {
	public BuscaPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "laptopsImg")
	private WebElement LAPTOP;

	@FindBy(how = How.LINK_TEXT, using = "HP Chromebook 14 G1(ES)")
	private WebElement CLICALAPTOP;

	@FindBy(how = How.NAME, using = "save_to_cart")
	private WebElement ADICIONAAOCARRINHO;

	@FindBy(how = How.ID, using = "checkOutPopUp")
	private WebElement FAZCHECKOUT;

	public void laptop() {
		LAPTOP.click();
	}

	public void clicaLaptop() {
		CLICALAPTOP.click();
	}

	public void adicionaAoCarrinho() {
		ADICIONAAOCARRINHO.click();
	}

	public void fazCheckOut() {
		FAZCHECKOUT.click();
	}

}