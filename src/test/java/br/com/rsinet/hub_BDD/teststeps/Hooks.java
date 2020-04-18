package br.com.rsinet.hub_BDD.teststeps;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import br.com.rsinet.hub_BDD.managers.TestContext;
import br.com.rsinet.hub_BDD.utils.Wait;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	private TestContext testContext;
	private Wait wait;

	public Hooks(TestContext context) {
		testContext = context;
		wait = testContext.getPageObjectFactory().getWait();
	}

	@Before
	public void iniciaBrowser() {
		testContext.getDriverFactory().iniciaNavegador();
	}

	@After
	public void afterScenario(Scenario scenario) throws MalformedURLException, Exception {
		wait.untilPageLoadComplete();
		String screenshotName = scenario.getName().replaceAll(" ", "_");
		try {
			File sourcePath = ((TakesScreenshot) testContext.getDriverFactory().iniciaNavegador())
					.getScreenshotAs(OutputType.FILE);

			File destinationPath = new File((System.getProperty("user.dir") + "\\Report\\" + screenshotName + ".png"));

			Files.copy(sourcePath, destinationPath);

			Reporter.addScreenCaptureFromPath(destinationPath.toString());
		} catch (IOException e) {
			System.out.println("Erro" + e.getMessage());
		}

		testContext.getDriverFactory().fechaDriver();
	}

}
