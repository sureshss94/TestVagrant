package com.tetvagrant.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wikipedia_Pom {
	public WebDriver driver;
	
	
	@FindBy(id="searchInput")
	private WebElement input;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement button;
	
	public Wikipedia_Pom(WebDriver driver2) {

	this.driver=driver2;
	PageFactory.initElements(driver, this);
	
	}

	public WebElement getInput() {
		return input;
	}

	public WebElement getButton() {
		return button;
	}

	public WebElement getClick() {
		return click;
	}

	public WebElement getReleaseDate() {
		return releaseDate;
	}

	public WebElement getCountry() {
		return country;
	}

	@FindBy(xpath="(//a[contains(@title,'Pushpa')])[2]")
	private WebElement click;
	
	@FindBy(xpath="(//table/tbody/tr[12]/td)[1]")
	private WebElement releaseDate;
	
	@FindBy(xpath="(//table/tbody/tr[14]/td)[1]")
	private WebElement country;
	
	
	
	
	
	
	
	

}
