package br.com.rsinet.hub_BDD.Runners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features"
		, glue = "br.com.rsinet.hub_BDD.teststeps"
		, monochrome = true
		, dryRun = false
		, plugin = {"com.cucumber.listener.ExtentCucumberFormatter:C:\\Users\\marcos.souza\\Documents\\Marcos\\Java\\ProjetoWebBdd\\ProjetoBDD\\Report\\report.html"}
		, tags = {"@Cadastro_Falha"}
		)

	public class Runner {
		@AfterClass
		public static void writeExtentReport() {
			Reporter.loadXMLConfig(new File("C:\\Users\\marcos.souza\\Documents\\Marcos\\Java\\ProjetoWebBdd\\ProjetoBDD\\Config.xml"));
		}
	}