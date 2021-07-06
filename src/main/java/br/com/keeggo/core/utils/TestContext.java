package br.com.keeggo.core.utils;

import br.com.keeggo.core.managers.DriverManager;
import br.com.keeggo.core.managers.PageObjectManager;

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
