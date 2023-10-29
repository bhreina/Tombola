package com.tombola.steps;

import com.tombola.pages.HomePage;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class HomePageSteps {
    @Then("^User should be redirected to the home page and verify the text britain's biggest bingo site$")
    public void userShouldBeRedirectedToTheHomePageAndVerifyTheTextBritainSBiggestBingoSite() {
        String expectedText = "britain's biggest bingo site";
        String actualText = new HomePage().verifyingTextOnHomePage();
        Assert.assertEquals(expectedText, actualText, "Text not displayed");
        new HomePage().verifyPageTitle();
        new HomePage().verifyTombolaLogoOnTheHomePage();
    }
}
