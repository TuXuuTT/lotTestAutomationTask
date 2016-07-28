package com.automation.stepDefinitions;

import com.automation.pageobjects.FlightSearchResultsPage;
import com.automation.pageobjects.LotStartPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Random;

import static com.codeborne.selenide.Selenide.open;

public class StepDefs {
    private int departureDate = (new Random()).ints(1, 6).findFirst().getAsInt();
    private int returnDate = departureDate * 2;
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

    @And("^click search$")
    public void clickSearch() {
        flightSearchResultsPage = lotStartPage.clickSearch();
    }

    @Then("^search results page displayed$")
    public void searchResultsPageDisplayed() {
        flightSearchResultsPage.verifySearchResultsPageLayout();
    }

    @When("^fill departure form with city name (.*)$")
    public void fillDepartureFormWithCityName(String cityName) throws Throwable {
        lotStartPage.selectDeparture(cityName);
    }

    @And("^fill destination form with city name (.*)$")
    public void fillDestinationFormWithCityName(String cityName) throws Throwable {
        lotStartPage.selectDestination(cityName);
    }

    @And("^select random valid departure date$")
    public void selectRandomValidDepartureDate() throws Throwable {
        lotStartPage.selectDepartureDate(departureDate);
    }

    @And("^select random valid return date$")
    public void selectRandomValidReturnDate() throws Throwable {
        lotStartPage.selectReturnDate(returnDate);
    }

    @And("^search results displayed for specified (.*) and (.*) also if round trip is (.*)$")
    public void searchResultsDisplayedForSpecifiedDepartureAndArrival(String departureCity, String arrivalCity, String isItRoundTrip) throws Throwable {
        boolean isRoundTrip = Boolean.parseBoolean(isItRoundTrip);
        flightSearchResultsPage.verifyNumberOfFoundRoutes(isRoundTrip);
        flightSearchResultsPage.verifyDepartureCity(departureCity, isRoundTrip);
        flightSearchResultsPage.verifyArrivalCity(arrivalCity, isRoundTrip);
    }
}
