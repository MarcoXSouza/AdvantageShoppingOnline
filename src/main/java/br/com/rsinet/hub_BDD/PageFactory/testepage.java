package br.com.rsinet.hub_BDD.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub_BDD.utilitys.DriverFactory;

public class testepage {

	static WebDriver driver = null;

	public static void main(String[] args) {
		BuscaPage busca = PageFactory.initElements(driver, BuscaPage.class);

		driver = DriverFactory.iniciaNavegador();
		busca.laptop();
		busca.clicaLaptop();
		busca.adicionaAoCarrinho();
		busca.fazCheckOut();
		DriverFactory.fechaDriver(driver);
	}

}
