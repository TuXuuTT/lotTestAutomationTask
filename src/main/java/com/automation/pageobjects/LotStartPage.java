package com.automation.pageobjects;

import com.automation.pageobjects.containerBlocks.BookerBlock;
import com.automation.pageobjects.containerBlocks.HeaderBlock;
import org.openqa.selenium.support.FindBy;

import java.util.Arrays;
import java.util.List;

import static com.codeborne.selenide.Selenide.page;

public class LotStartPage extends BasicPage {

    List<String> headerLinks = Arrays.asList("/", getAppURL() + "check-in", getAppURL() + "my-reservation", "#");
    @FindBy(css = "#bookerContainer")
    private BookerBlock bookerBlock;
    @FindBy(css = ".o-main-header>div.l-row")
    private HeaderBlock headerBlock;

    public FlightSearchResultsPage clickSearch() {
        bookerBlock.clickSearch();
        return page(FlightSearchResultsPage.class);
    }

    public LotStartPage selectDeparture(String cityName) {
        bookerBlock.selectDeparture(cityName);
        return page(this);
    }

    public LotStartPage selectDestination(String cityName) {
        bookerBlock.selectDestination(cityName);
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

    public LotStartPage selectTicketType(boolean isReturn) {
        bookerBlock.selectTicketType(isReturn);
        return page(this);
    }

    public void verifyHeaderLinks() {
        headerBlock.verifyLinks(headerLinks);
    }
}
