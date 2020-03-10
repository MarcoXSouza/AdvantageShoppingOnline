package br.com.rsinet.hub_BDD.PageFactory;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LupaPage {
	public LupaPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "2")
	private WebElement produto;

	@FindBy(how = How.NAME, using = "save_to_cart")
	private WebElement adicionarAoCarrinho;

	@FindBy(how = How.XPATH, using = "//*[@id=\"shoppingCartLink\"]/span")
	private WebElement carrinho;
	
	@FindBy(how = How.ID, using = "searchPage")
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
