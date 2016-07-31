package com.automation.stepDefinitions;

import com.automation.pageobjects.LotStartPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StartPageLayoutStepDefs {
    private LotStartPage lotStartPage;

//    @Given("^Lot start page is opened$")
//    public void lotStartPageIsOpened() {
//        lotStartPage = open(LotStartPage.getAppURL(), LotStartPage.class);
//    } //TODO find out how to reuse one hook step to initialize page in all stepdefs


    @When("^observing page components by default$")
    public void observingPageComponentsByDefault() throws Throwable {
        //syntax sugar
    }

    @Then("^header contains valid links$")
    public void headerContainsValidLinks() throws Throwable {
        lotStartPage.verifyHeaderLinks();
    }

    @And("^carousel component has navigation$")
    public void carouselComponentHasNavigation() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^booker block set to flight$")
    public void bookerBlockSetToFlight() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^current offers components contain valid links$")
    public void currentOffersComponentsContainValidLinks() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^useful info block is displayed$")
    public void usefulInfoBlockIsDisplayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^footer contains valid links$")
    public void footerContainsValidLinks() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^copyright block is displayed$")
    public void copyrightBlockIsDisplayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
