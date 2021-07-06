package br.com.keeggo.core.managers;

import org.openqa.selenium.WebDriver;

import br.com.keeggo.test.Page.CadastroPage;
import br.com.keeggo.test.Page.LoginPage;

public class PageObjectManager {

	private WebDriver driver;

	private CadastroPage cadastroPage;
	private LoginPage loginPage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public CadastroPage getCadastroPage() {
		return (cadastroPage == null) ? cadastroPage = new CadastroPage(driver) : cadastroPage;
	}

	public LoginPage getLoginPage() {
		return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
	}


}
