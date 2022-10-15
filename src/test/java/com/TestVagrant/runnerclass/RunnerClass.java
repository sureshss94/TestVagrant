package com.TestVagrant.runnerclass;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.TestVagrantBaseclass.BaseClass;
import com.testvagrant.configurationreader.File_Reader_Manager;
import com.tetvagrant.pageobjectmodel.Imdb_Pom;
import com.tetvagrant.pageobjectmodel.Wikipedia_Pom;

public class RunnerClass extends BaseClass {
	public static WebDriver driver = browser_Configuration("chrome");
	public static Imdb_Pom pom = new Imdb_Pom(driver);
	public static Wikipedia_Pom pomWi = new Wikipedia_Pom(driver);
	public static String releaseDateImdb;
	public static String countryImdb;
	public static String countryWiki;
	public static String wikiReleaseDate;

	@Test
	private void imdb_Data() throws Exception {

		getUrl(File_Reader_Manager.get_Instance_Configuration().get_Instance_UrlImdb());
		waitbrowser("wait", 10);

		inputValues(pom.getInput(), File_Reader_Manager.get_Instance_Configuration().get_Instance_Input());
		clickOnElement("Click", pom.getButton());

		clickOnElement("Click", pom.getClick());
		waitbrowser("wait", 10);
		releaseDateImdb = getText(pom.getReleaseDate());
		countryImdb = getText(pom.getCountry());

	}

	@Test
	private void wikipedia_Data() throws Exception {

		getUrl(File_Reader_Manager.get_Instance_Configuration().get_Instance_UrlWiki());

		inputValues(pomWi.getInput(), File_Reader_Manager.get_Instance_Configuration().get_Instance_Input());
		waitbrowser("wait", 10);
		clickOnElement("Click", pomWi.getButton());

		waitbrowser("wait", 10);
		clickOnElement("Click", pomWi.getClick());

		wikiReleaseDate = getText(pomWi.getReleaseDate());
		countryWiki = getText(pomWi.getCountry());
	}

	@Test(priority = 1)
	private void validation() {

		Assert.assertEquals(countryImdb, countryWiki);
		Assert.assertEquals(releaseDateImdb, wikiReleaseDate);

	}

	@AfterClass
	private void close_Browser() {
		driver_Operations("close");
	}

}
