package com.tombola.pages;

import com.tombola.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TombolaLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(TombolaLoginPage.class.getName());

    public TombolaLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    WebElement acceptCookiesButton;

    @CacheLookup
    @FindBy(xpath = "//h3[contains(text(),'Login to')]")
    WebElement verifyLoginToText;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")
    WebElement userName;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//button[@id='btnLogin']")
    WebElement clickLoginButton;

    public void acceptCookies(){
        clickOnElement(acceptCookiesButton);
        log.info("Clicking on accept cookies button: " + acceptCookiesButton.toString());
    }

    public String verifyingTextOnLoginPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Login to')]")));
        String message = getTextFromElement(verifyLoginToText);
        log.info("Verifying text from Login Page: " + verifyLoginToText.toString());
        return message;
    }

    public void  enterUserNameIntoUserField(String name) {
        log.info("Enter first name: " + userName.toString());
        sendTextToElement(userName, name );
    }

    public void enterPasswordIntoPasswordField(String pswd) {
        log.info("Enter the password: " + password.toString());
        sendTextToElement(password, pswd);
    }

    public void clickOnLoginButton(){
        log.info("Click on Register button: " + clickLoginButton);
        clickOnElement(clickLoginButton);
    }

}
