package com.tombola.pages;

import com.tombola.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//div[@class='tagline']")
    WebElement verifyTextHomePage;

    @CacheLookup
    @FindBy(xpath = "//div[@class='logo iac']")
    WebElement verifyTombolaLogoOnHomePage;

    public String verifyingTextOnHomePage() {
        String message = getTextFromElement(verifyTextHomePage);
        log.info("Verifying text from Login Page: " + verifyTextHomePage.toString());
        return message;
    }
    public void verifyPageTitle(){
        String pageTitle = driver.getTitle();
        Assert.assertEquals("tombola - britain's biggest bingo site", pageTitle);
    }
    public void verifyTombolaLogoOnTheHomePage(){
        Assert.assertTrue(verifyTombolaLogoOnHomePage.isDisplayed());
    }
}
