package br.com.rsinet.hub_BDD.Runners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import br.com.rsinet.hub_BDD.managers.FileReaderManager;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features"
		, glue = "br.com.rsinet.hub_BDD.teststeps"
		, monochrome = true
		, dryRun = false
		, plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Report\\report.html"}
		, tags = {"@Lupa"}
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
