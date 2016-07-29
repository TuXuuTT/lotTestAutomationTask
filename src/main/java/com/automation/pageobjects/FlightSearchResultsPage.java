package com.automation.pageobjects;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.testng.AssertJUnit.assertEquals;

public class FlightSearchResultsPage extends BasicPage {
    private By listSearchSteps = By.cssSelector(".steps");
    private By flightDirection = By.cssSelector(".flight_direction");
    private By flightDirectionListItem = By.cssSelector(".flight_direction__list__item");
    private By flightDateListItem = By.cssSelector("li.active .flight_pagination__date_number");

    public void verifySearchResultsPageLayout() {
        $(listSearchSteps).shouldBe(Condition.visible);
    }

    public void verifyDepartureCity(String departureCity, boolean roundTrip) {
        $$(flightDirection).get(0).$$(flightDirectionListItem).get(0).shouldHave(Condition.text(departureCity));
        if (roundTrip) {
            $$(flightDirection).get(1).$$(flightDirectionListItem).get(1).shouldHave(Condition.text(departureCity));
        }
    }

    public void verifyArrivalCity(String arrivalCity, boolean roundTrip) {
        $$(flightDirection).get(0).$$(flightDirectionListItem).get(1).shouldHave(Condition.text(arrivalCity));
        if (roundTrip) {
            $$(flightDirection).get(1).$$(flightDirectionListItem).get(0).shouldHave(Condition.text(arrivalCity));
        }
    }

    public void verifyNumberOfFoundRoutes(boolean isItRoundTrip) {
        if (isItRoundTrip) {
            $$(flightDirection).shouldHaveSize(2);
        } else $$(flightDirection).shouldHaveSize(1);
    }

    public void verifyTripDates(int departureDate, int returnDate) {
        $$(flightDateListItem).shouldHaveSize(2);
        assertEquals(Integer.parseInt($$(flightDateListItem).get(0).getText()), departureDate);
        assertEquals(Integer.parseInt($$(flightDateListItem).get(1).getText()), returnDate);
    }

    public void verifyTripDates(int departureDate) {
        $$(flightDateListItem).shouldHaveSize(1);
        assertEquals(Integer.parseInt($$(flightDateListItem).get(0).getText()), departureDate);

    }
}
