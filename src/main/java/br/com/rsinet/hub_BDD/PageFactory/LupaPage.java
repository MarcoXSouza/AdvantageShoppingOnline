package br.com.rsinet.hub_BDD.PageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LupaPage {
	public LupaPage(WebDriver driver){
	     PageFactory.initElements(driver, this);
	 }

	@FindBy(how = How.ID, using = "menuSearch")
	private WebElement MENU;

	@FindBy(how = How.ID, using = "autoComplete")
	private WebElement DIGITA;

	@FindBy(how = How.LINK_TEXT, using = "HP Pavilion 15z Laptop") 
	private WebElement PRODUTO;

	@FindBy(how = How.NAME, using = "save_to_cart")
	private WebElement ADICIONARAOCARRINHO;

	@FindBy(how = How.ID, using = "checkOutPopUp")
	private WebElement FAZERCHECKOUT;

	public void menu() {
		MENU.click();
	}

	public void digita() {
		DIGITA.sendKeys("HP Pavilion 15z Laptop" + Keys.ENTER);
	}

	public void produto() {
		PRODUTO.click();
	}

	public void adicionaAoCarrinho() {
		ADICIONARAOCARRINHO.click();
	}

	public void fazerCheckOut() {
		FAZERCHECKOUT.click();
	}
}
