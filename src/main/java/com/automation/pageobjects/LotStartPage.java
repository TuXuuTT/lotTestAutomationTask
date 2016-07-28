package com.automation.pageobjects;

import com.automation.pageobjects.containerBlocks.BookerBlock;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class LotStartPage extends BasicPage {

    @FindBy(css = "#bookerContainer")
    private BookerBlock bookerBlock;

    public LotStartPage selectDestination(String cityName) {
        bookerBlock.selectDestination(cityName);
        return page(this);
    }

    public FlightSearchResultsPage clickSearch() {
        bookerBlock.clickSearch();
        return page(FlightSearchResultsPage.class);
    }

    public LotStartPage selectDeparture(String cityName) {
        bookerBlock.selectDeparture(cityName);
        return page(this);
    }

    public LotStartPage selectDepartureDate(int date) {
        bookerBlock.selectDepartureDate(date);
        return page(this);
    }

    public LotStartPage selectReturnDate(int date) {
        bookerBlock.selectReturnDate(date);
        return page(this);

    }
}
