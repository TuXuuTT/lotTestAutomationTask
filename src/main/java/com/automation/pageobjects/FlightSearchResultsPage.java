package com.automation.pageobjects;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FlightSearchResultsPage extends BasicPage {
    private By listSearchSteps = By.cssSelector(".steps");
    private By flightDirection = By.cssSelector(".flight_direction");
    private By flightDirectionListItem = By.cssSelector(".flight_direction__list__item");

    public void checkSearchResultsPageLayout() {
        $(listSearchSteps).shouldBe(Condition.visible);
    }

    public void checkDepartureCity(String departureCity, boolean roundTrip) {
        $$(flightDirection).get(0).$$(flightDirectionListItem).get(0).shouldHave(Condition.text(departureCity));
        if (roundTrip) {
            $$(flightDirection).get(1).$$(flightDirectionListItem).get(1).shouldHave(Condition.text(departureCity));
        }
    }

    public void checkArrivalCity(String arrivalCity, boolean roundTrip) {
        $$(flightDirection).get(0).$$(flightDirectionListItem).get(1).shouldHave(Condition.text(arrivalCity));
        if (roundTrip) {
            $$(flightDirection).get(1).$$(flightDirectionListItem).get(0).shouldHave(Condition.text(arrivalCity));
        }

    }

    public void checkNumberOfFoundRoutes(boolean isItRoundTrip) {
        if (isItRoundTrip) {
            $$(flightDirection).shouldHaveSize(2);
        } else $$(flightDirection).shouldHaveSize(1);
    }
}
