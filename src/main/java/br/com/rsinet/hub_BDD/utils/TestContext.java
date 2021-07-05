package br.com.rsinet.hub_BDD.utils;

import br.com.rsinet.hub_BDD.managers.DriverManager;
import br.com.rsinet.hub_BDD.managers.PageObjectManager;

public class TestContext {
	private DriverManager driverManager;
	private PageObjectManager pageObjectManager;

	public TestContext() {
		driverManager = new DriverManager();
		pageObjectManager = new PageObjectManager(driverManager.criarDriver());

	}

	public DriverManager getDriverManager() {
		return driverManager;

	}

	public PageObjectManager getPageObjectFactory() {
		return pageObjectManager;

	}

}
