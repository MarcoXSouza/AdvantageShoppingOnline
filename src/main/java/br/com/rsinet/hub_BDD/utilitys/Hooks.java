package br.com.rsinet.hub_BDD.utilitys;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	private TestContext testContext;
	public WebDriver driver;

	public Hooks(TestContext context) {
		testContext = context;
	}

	@Before
	public void iniciaBrowser() {
		testContext.getDriverFactory().iniciaNavegador();
		System.out.println("inicio");
	}

	@After
	public void fechaBrowser() throws IOException, InterruptedException {
		testContext.getDriverFactory().fechaDriver();
		System.out.println("fim");
	}

}
