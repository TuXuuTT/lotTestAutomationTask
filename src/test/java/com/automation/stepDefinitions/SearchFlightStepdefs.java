package com.automation.stepDefinitions;

import com.automation.pageobjects.FlightSearchResultsPage;
import com.automation.pageobjects.LotStartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Random;

import static com.codeborne.selenide.Selenide.page;

public class SearchFlightStepDefs {
    private int departureDate = (new Random()).ints(1, 10).findFirst().getAsInt();
    private int returnDate = departureDate * 2;
    private LotStartPage lotStartPage = page(LotStartPage.class);
    private FlightSearchResultsPage flightSearchResultsPage;

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

    @And("^search results displayed for specified (.*) and (.*) if round trip (.*)$")
    public void searchResultsDisplayedForSpecifiedDepartureAndArrival(String departureCity, String arrivalCity, String isItRoundTrip) throws Throwable {
        boolean isRoundTrip = Boolean.parseBoolean(isItRoundTrip);
        flightSearchResultsPage.verifyNumberOfFoundRoutes(isRoundTrip);
        flightSearchResultsPage.verifyDepartureCity(departureCity, isRoundTrip);
        flightSearchResultsPage.verifyArrivalCity(arrivalCity, isRoundTrip);
    }

    @And("^search results displayed for specified dates if round trip (.*)$")
    public void searchResultsDisplayedForSpecifiedDates(String isItRoundTrip) throws Throwable {
        if (Boolean.parseBoolean(isItRoundTrip)) {
            flightSearchResultsPage.verifyTripDates(departureDate, returnDate);
        } else flightSearchResultsPage.verifyTripDates(departureDate);
    }

    @And("^select ticket type (.*)$")
    public void selectTicketTypeIsRoundTrip(String isItRoundTrip) throws Throwable {
        lotStartPage.selectTicketType(Boolean.parseBoolean(isItRoundTrip));
    }
}
