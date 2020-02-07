package br.com.rsinet.hub_BDD.utilitys;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_BDD.PageFactory.BuscaPage;
import br.com.rsinet.hub_BDD.PageFactory.CadastroPage;
import br.com.rsinet.hub_BDD.PageFactory.HomePage;
import br.com.rsinet.hub_BDD.PageFactory.LupaPage;

public class PageObjectManager {

	private WebDriver driver;

	private CadastroPage cadastroPage;
	private BuscaPage buscaPage;
	private LupaPage lupaPage;
	private HomePage homePage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public CadastroPage getCadastroPage() {
		return (cadastroPage == null) ? cadastroPage = new CadastroPage(driver) : cadastroPage;	}

	public BuscaPage getBuscaPage() {
		return (buscaPage == null) ? buscaPage = new BuscaPage(driver) : buscaPage;	}

	public LupaPage getLupaPage() {
		return (lupaPage == null) ? lupaPage = new LupaPage(driver) : lupaPage;	}

	public HomePage getHomePage() {
		return (homePage == null) ? homePage = new HomePage(driver) : homePage;	}


	
	
	
}
