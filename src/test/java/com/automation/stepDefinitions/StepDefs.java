package com.automation.stepDefinitions;

import com.automation.pageobjects.LotStartPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.assertTrue;

public class StepDefs {
    LotStartPage lotStartPage;

    @Before
    public void beforeScenario() {
        //hook that can be executed before each scenario and do not conflict with global testNG hooks from Runner and Basic runner class
    }

    @Given("^Lot start page is opened$")
    public void lotStartPageIsOpened() throws Throwable {
        lotStartPage = open(LotStartPage.getAppURL(), LotStartPage.class);
    }

    @Given("^I am on start page$")
    public void iAmOnStartPage() throws Throwable {
    }

    @When("^I fill in search form$")
    public void iFillInSearchForm() throws Throwable {

    }

    @And("^click search button$")
    public void clickSearchButton() throws Throwable {
        lotStartPage.clickSearch();
    }

    @Then("^search results displayed$")
    public void searchResultsDisplayed() throws Throwable {
        assertTrue(false);
    }
}
