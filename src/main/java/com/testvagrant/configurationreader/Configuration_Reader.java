package com.testvagrant.configurationreader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;

	public  Configuration_Reader() throws IOException {

		File f = new File("C:\\Users\\suresh\\TestVagrant\\src\\main\\java\\com\\testvagrant\\configurationreader\\configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();

		p.load(fis);

	}
	public String get_Instance_UrlImdb() {
		String property = p.getProperty("urlimdb");
		return property;
	}
	
	public String get_Instance_UrlWiki() {
		String property = p.getProperty("urlwiki");
		return property;
	}

	public String get_Instance_Input() {

		String value = p.getProperty("input");
		return value;
	}

}
