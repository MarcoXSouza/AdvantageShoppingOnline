package br.com.keeggo.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import br.com.keeggo.core.managers.FileReaderManager;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features"
		, glue = "br.com.keeggo.test.teststeps"
		, monochrome = true
		, dryRun = false
		, plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Report\\report.html"}
		, tags = {"@Cadastro_com_sucesso"}
		)

	public class Runner {
		@AfterClass
		public static void writeExtentReport() {
			Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigFileReader().getReportConfigPath()));
			Reporter.setSystemInfo("Marcos.Xavier", System.getProperty("user.name"));
			Reporter.setSystemInfo("SO", "Windows 10 64 bit");
			Reporter.setSystemInfo("Java version", "1.8.0_231");
		}
	}
