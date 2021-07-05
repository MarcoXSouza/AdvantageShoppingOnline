package br.com.rsinet.hub_BDD.teststeps;

import br.com.rsinet.hub_BDD.managers.ConfigFileReader;
import br.com.rsinet.hub_BDD.utils.TestContext;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	private TestContext testContext;
	private ConfigFileReader configLeitorDeArquivos;

	public Hooks(TestContext context) {
		testContext = context;
		configLeitorDeArquivos = new ConfigFileReader();
	}

	@Before
	public void BeforeSteps() {
		testContext.getDriverManager().iniciarNavegador();
		testContext.getDriverManager().abrirUrl(configLeitorDeArquivos.getUrl());
		
	}

	@After
	public void AfterSteps() {
		testContext.getDriverManager().fecharDriver();
	}


}
