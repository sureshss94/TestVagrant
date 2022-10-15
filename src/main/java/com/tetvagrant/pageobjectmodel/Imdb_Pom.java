package com.tetvagrant.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Imdb_Pom {
	public WebDriver driver;
	
	@FindBy(name="q")
	private WebElement input ;
	

	@FindBy(xpath="//button[@type='submit']")
	private WebElement button;

	@FindBy(xpath="//a[contains(text(),'Part 1')]")
	private WebElement click ;

	@FindBy(xpath="(//div[@class='ipc-title__wrapper'])[7]//following::a[contains(text(),'December ')]")
	private WebElement releaseDate;
	

	@FindBy(xpath="((//div[@class='ipc-title__wrapper'])[7]//following::a[contains(@class,'metadata')])[4]")
	private WebElement country ;


	public Imdb_Pom(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver,this);
	
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

	
}
