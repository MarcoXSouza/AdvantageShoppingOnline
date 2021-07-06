package br.com.keeggo.test.teststeps;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import br.com.keeggo.core.managers.ConfigFileReader;
import br.com.keeggo.core.utils.TestContext;
import cucumber.api.Scenario;
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
	public void AfterSteps(Scenario scenario) throws MalformedURLException, Exception {
		String screenshotName = scenario.getName().replaceAll(" ", "_");

		try {
			File sourcePath = ((TakesScreenshot) testContext.getDriverManager().criarDriver())
					.getScreenshotAs(OutputType.FILE);

			File destinationPath = new File(
					"C:\\DEV\\AVALIACAO\\AdvantageShopping\\Report\\screenshots\\"
							+ screenshotName + ".png");

			Files.copy(sourcePath, destinationPath);

			Reporter.addScreenCaptureFromPath(destinationPath.toString());
		}
		
		catch (IOException e) {
			System.out.println("Erro" + e.getMessage());
		}
		
		testContext.getDriverManager().fecharDriver();
	}


}
