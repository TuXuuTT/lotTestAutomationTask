package com.automation.pageobjects.containerBlocks;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsContainer;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class BookerBlock extends ElementsContainer {
    private By bookerBoxTextLabel = By.cssSelector(".booker-box>p.text-label");
    private By btnTicketTypeReturn = By.cssSelector("a[data-ticket-type=\"RETURN\"]");
    private By btnTicketTypeSingle = By.cssSelector("a[data-ticket-type=\"SINGLE\"]");
    private By btnDepartureCityBox = By.cssSelector("#booker-box-departure");
    private By btnArrivalCityBox = By.cssSelector("#booker-box-destination");
    private By btnDepartureDateBox = By.cssSelector(".iconimg-departure-date");
    private By btnArrivalDateBox = By.cssSelector(".iconimg-return-date");
    private By datePickerRightNumber = By.cssSelector(".ui-datepicker-group-last .ui-datepicker-calendar a");

    private By numOfAdults = By.cssSelector("#numOfAdults");
    private By numOfChildren = By.cssSelector("#numOfInfants");
    private By numOfInfants = By.cssSelector("#numOfInfants");
    private By btnIncrementNum = By.cssSelector(".num-inc");

    private By btnDecrementNumb = By.cssSelector(".num-dec");
    private By btnTicketClassBox = By.cssSelector("#ticket-class");

    private By inputPromoCode = By.cssSelector("#promoCode");

    private By liAirportSelector = By.cssSelector(".airport-selector-airport");
    private By btnSearch = By.cssSelector("#booker-search");

    public void clickSearch() {
        getSelf().$(btnSearch).click();
    }

    private void selectCity(String cityName, By cityBox) {
        getSelf().$(cityBox).click();
        getSelf().$(cityBox).$("input").val(cityName);
        getSelf().$$(liAirportSelector).shouldHave(CollectionCondition.sizeLessThanOrEqual(2)).last().click();
        getSelf().$(bookerBoxTextLabel).click();
    }

    public void selectDeparture(String cityName) {
        selectCity(cityName, btnDepartureCityBox);
    }

    public void selectDestination(String cityName) {
        selectCity(cityName, btnArrivalCityBox);
    }

    private void selectDateFromRightPickerSection(int date, By dateBox) {
        $(dateBox).click();
        $$(datePickerRightNumber).get(date - 1).click();
        getSelf().$(bookerBoxTextLabel).click();
    }

    public void selectDepartureDate(int date) {
        selectDateFromRightPickerSection(date, btnDepartureDateBox);
    }

    public void selectReturnDate(int date) {
        selectDateFromRightPickerSection(date, btnArrivalDateBox);

    }


}