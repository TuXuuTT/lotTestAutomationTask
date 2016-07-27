package com.automation.stepDefinitions;

import com.automation.pageobjects.FlightSearchResultsPage;
import com.automation.pageobjects.LotStartPage;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Selenide.open;

public class StepDefs {
    private LotStartPage lotStartPage;
    private FlightSearchResultsPage flightSearchResultsPage;

    @Before
    public void beforeScenario() {
        //Note: hook that can be executed before each scenario and do not conflict with global testNG hooks from Runner and Basic runner class. As well "before" for scenario is specified in the Background section of feature
    }

    @Given("^Lot start page is opened$")
    public void lotStartPageIsOpened() {
        lotStartPage = open(LotStartPage.getAppURL(), LotStartPage.class);
    }

    @When("^fill destination form$")
    public void fillDestinationForm() {
        lotStartPage.selectDestination("Kiev");
    }

    @And("^click search$")
    public void clickSearch() {
        flightSearchResultsPage = lotStartPage.clickSearch();
    }

    @Then("^search results displayed$")
    public void searchResultsDisplayed() {
        flightSearchResultsPage.checkSearchResultsPageLayout();
    }

    @When("^fill departure form with city name (.*)$")
    public void fillDepartureFormWithCityName(String cityName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^fill destination form with city name (.*)$")
    public void fillDestinationFormWithCityName(String cityName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^select random departure date$")
    public void selectRandomDepartureDate() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^select random return date$")
    public void selectRandomReturnDate() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^search results displayed for specified values$")
    public void searchResultsDisplayedForSpecifiedValues() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
