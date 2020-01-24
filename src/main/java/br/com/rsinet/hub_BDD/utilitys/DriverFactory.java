package br.com.rsinet.hub_BDD.utilitys;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	private DriverFactory() {
	}

	public static WebDriver iniciaNavegador() {
		WebDriver driver = null;

		if (driver == null) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.advantageonlineshopping.com/#/");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		}
		return driver;

	}

	public static void fechaDriver(WebDriver driver) {
		if (null != driver) {
			driver.quit();
			driver = null;

		}

	}

}
