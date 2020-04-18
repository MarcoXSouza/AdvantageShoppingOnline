package br.com.rsinet.hub_BDD.utils;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_BDD.managers.DriverFactory;
import br.com.rsinet.hub_BDD.managers.FileReaderManager;

public class Wait {

	public void untilJqueryIsDone() {
		untilJqueryIsDone(DriverFactory.getDriver(),
				FileReaderManager.getInstance().getConfigFileReader().getImplicitlyWait());
	}

	public static void untilJqueryIsDone(WebDriver driver, Long timeoutInSeconds) {
		until(DriverFactory.getDriver(), (d) -> {
			Boolean isJqueryCallDone = (Boolean) ((JavascriptExecutor) driver).executeScript("return jQuery.active==0");
			if (!isJqueryCallDone)
				System.out.println("JQuery call is in Progress");
			return isJqueryCallDone;
		}, timeoutInSeconds);
	}

	public void untilPageLoadComplete() {
		untilPageLoadComplete(DriverFactory.getDriver(),
				FileReaderManager.getInstance().getConfigFileReader().getImplicitlyWait());
	}

	public static void untilPageLoadComplete(WebDriver driver, Long timeoutInSeconds) {
		until(driver, (d) -> {
			Boolean isPageLoaded = (Boolean) ((JavascriptExecutor) driver).executeScript("return document.readyState")
					.equals("complete");
			if (!isPageLoaded)
				System.out.println("Document is loading");
			return isPageLoaded;
		}, timeoutInSeconds);
	}

	public void until(WebDriver driver, Function<WebDriver, Boolean> waitCondition) {
		until(DriverFactory.getDriver(), waitCondition,
				FileReaderManager.getInstance().getConfigFileReader().getImplicitlyWait());
	}

	@SuppressWarnings("deprecation")
	private static void until(WebDriver driver, Function<WebDriver, Boolean> waitCondition, Long timeoutInSeconds) {
		WebDriverWait webDriverWait = new WebDriverWait(driver, timeoutInSeconds);
		webDriverWait.withTimeout(timeoutInSeconds, TimeUnit.SECONDS);
		try {
			webDriverWait.until(waitCondition);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
