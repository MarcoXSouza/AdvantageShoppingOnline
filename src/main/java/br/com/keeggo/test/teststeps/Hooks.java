package br.com.keeggo.test.teststeps;

import br.com.keeggo.core.managers.ConfigFileReader;
import br.com.keeggo.core.utils.TestContext;
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
