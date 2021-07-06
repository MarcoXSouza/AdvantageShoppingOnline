package br.com.keeggo.core.managers;

import org.openqa.selenium.WebDriver;

import br.com.keeggo.test.Page.CadastroPage;
import br.com.keeggo.test.Page.HomePage;

public class PageObjectManager {

	private WebDriver driver;

	private CadastroPage cadastroPage;
	private HomePage homePage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public CadastroPage getCadastroPage() {
		return (cadastroPage == null) ? cadastroPage = new CadastroPage(driver) : cadastroPage;
	}

	public HomePage getHomePage() {
		return (homePage == null) ? homePage = new HomePage(driver) : homePage;
	}


}
