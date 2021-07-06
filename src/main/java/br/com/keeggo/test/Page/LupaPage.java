package br.com.keeggo.test.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LupaPage {
	public LupaPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "HP ElitePad 1000 G2 Tablet")
	private WebElement produto;

	@FindBy(name = "save_to_cart")
	private WebElement adicionarAoCarrinho;

	@FindBy(xpath = "//*[@id=\"shoppingCartLink\"]/span")
	private WebElement carrinho;
	
	@FindBy(id = "searchPage")
	private WebElement naoEncontrado;

	public void produto() {
		produto.click();
	}

	public void adicionaAoCarrinho() {
		adicionarAoCarrinho.click();
	}
	
	public String verificaCarrinho() {
		return carrinho.getText();
	}
	
	public String buscaInvalida() {
		return naoEncontrado.getText();
	}
	
}
