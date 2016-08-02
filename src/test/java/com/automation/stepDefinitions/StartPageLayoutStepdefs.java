package com.automation.stepDefinitions;

import com.automation.pageobjects.LoginPage;
import com.automation.pageobjects.LotStartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Selenide.page;

public class StartPageLayoutStepdefs {
    private LotStartPage lotStartPage = page(LotStartPage.class);
    private LoginPage loginPage;

    @When("^observing page components by default$")
    public void observingPageComponentsByDefault() throws Throwable {
        lotStartPage.verifyPageIsOpened(); //more like syntax sugar, does not have any reasonable value yet
    }

    @Then("^header contains valid links$")
    public void headerContainsValidLinks() throws Throwable {
        lotStartPage.verifyHeaderLinks();
    }

    @And("^carousel component has navigation$")
    public void carouselComponentHasNavigation() throws Throwable {
        lotStartPage.verifyCarouselComponent();
    }

    @And("^booker block set to flight$")
    public void bookerBlockSetToFlight() throws Throwable {
        lotStartPage.verifyBookerBlockDefaults();
    }


    @And("^current offers components displayed$")
    public void currentOffersComponentsDisplayed() throws Throwable {
        lotStartPage.verifyOffersComponentDisplayed();
    }


    @And("^footer block is displayed$")
    public void footerBlockIsDisplayed() throws Throwable {
        lotStartPage.verifyFooterBlockDisplayed();
    }

    @And("^copyright block is displayed$")
    public void copyrightBlockIsDisplayed() throws Throwable {
        lotStartPage.verifyCopyrightIsDisplayed();
    }

    @When("^click on Login$")
    public void clickOnLogin() throws Throwable {
        loginPage = lotStartPage.navigateToLogin();
    }

    @Then("^login page displayed$")
    public void loginPageDisplayed() throws Throwable {
        loginPage.verifyPageOpened();
    }

    @When("^click on language$")
    public void clickOnLanguage() throws Throwable {
        lotStartPage.openLanguagePicker();
    }

    @Then("^country picker shown$")
    public void countryPickerShown() throws Throwable {
        lotStartPage.verifyLanguagePicker();
    }

    @Then("^return date should be displayed (.*)")
    public void returnDateShouldBeDisplayedFalse(String shouldBeDisplayed) throws Throwable {
        lotStartPage.verifyReturnDateVisibility(Boolean.parseBoolean(shouldBeDisplayed));
    }
}
