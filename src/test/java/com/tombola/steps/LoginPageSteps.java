package com.tombola.steps;

import com.tombola.pages.TombolaLoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginPageSteps {



    @Given("^User is on the login page$")
    public void userIsOnTheLoginPage() {

    }

    @When("^User clicks on accept cookies button$")
    public void userClicksOnAcceptCookiesButton() {
        new TombolaLoginPage().acceptCookies();
    }

    @And("^Verify the text on the Login Page 'Login to'$")
    public void verifyTheTextOnTheLoginPageLoginTo() {
        String expectedText = "Login to";
        String actualText = new TombolaLoginPage().verifyingTextOnLoginPage();
        Assert.assertEquals(expectedText, actualText, "Text not displayed");
    }

    @And("^User enters valid User Name$")
    public void userEntersValidUserName() {
        new TombolaLoginPage().enterUserNameIntoUserField("techtest2");
    }

    @And("^User enters valid Password$")
    public void userEntersValidPassword() {
        new TombolaLoginPage().enterPasswordIntoPasswordField("TechTest2!");
    }

    @And("^User clicks the login button$")
    public void userClicksTheLoginButton() {
        new TombolaLoginPage().clickOnLoginButton();
    }

}
