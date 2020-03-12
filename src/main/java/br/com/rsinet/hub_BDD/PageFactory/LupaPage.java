package br.com.rsinet.hub_BDD.PageFactory;

import org.junit.Assert;
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
	
	public void verificaCarrinho() {
		String compararCarrinho = carrinho.getText();
		Assert.assertTrue(compararCarrinho.equals("1"));
	}
	
	public void buscaInvalida() {
		String naoEncontrada = naoEncontrado.getText();
		Assert.assertTrue(naoEncontrada.contains("No results for "));
	}
	
}
