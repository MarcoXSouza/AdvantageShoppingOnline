package br.com.keeggo.utils;

import br.com.keeggo.managers.DriverManager;
import br.com.keeggo.managers.PageObjectManager;

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
