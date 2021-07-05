package br.com.rsinet.hub_BDD.managers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import br.com.rsinet.hub_BDD.enums.DriverType;

public class ConfigFileReader {
	private Properties properties;
	private final String propertyFilePath = "Configs//Configurations.properties";

	public ConfigFileReader() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties não encontrado em " + propertyFilePath);
		}

	}
	
	public String getUrl() {
		 String url = properties.getProperty("url");
		 if(url != null) return url;
		 else throw new RuntimeException("url não especificada no arquivo Configuracao.properties.");
		 }
	
	public DriverType getBrowser() {
		String browserName = properties.getProperty("browser");
		if(browserName == null || browserName.equals("chrome")) return DriverType.CHROME;
		else if(browserName.equalsIgnoreCase("firefox")) return DriverType.FIREFOX;
		else if(browserName.equals("iexplorer")) return DriverType.INTERNETEXPLORER;
		else throw new RuntimeException("Valor da chave e nome do navegador em Configuracao.properties não corresponde: " + browserName);
	}
	
	public Boolean getBrowserWindowSize() {
		String windowSize = properties.getProperty("windowMaximize");
		if(windowSize != null) return Boolean.valueOf(windowSize);
		return true;
	}
	

	public long getImplicitlyWait() {
		String implicitlyWait = properties.getProperty("implicitlyWait");
		if (implicitlyWait != null)
			try {
			return Long.parseLong(implicitlyWait);
			}catch(NumberFormatException e){
			throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
			}
		return 30;
	}

	public String getReportConfigPath() {
		String reportConfigPath = properties.getProperty("reportConfigPath");
		if (reportConfigPath != null)
			return reportConfigPath;
		else
			throw new RuntimeException(
					"Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
	}
}
