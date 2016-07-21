package com.automation.pageobjects.containerBlocks;

import com.codeborne.selenide.ElementsContainer;
import org.openqa.selenium.By;

public class BookerBlock extends ElementsContainer {
    private By btnTicketTypeReturn = By.cssSelector("a[data-ticket-type=\"RETURN\"]");
    private By btnTicketTypeSingle = By.cssSelector("a[data-ticket-type=\"SINGLE\"]");
    private By btnDepartureCityBox = By.cssSelector("#booker-box-departure");
    private By btnArrivalCityBox = By.cssSelector("#booker-box-destination");
    private By btnDepartureDateBox = By.cssSelector(".iconimg-departure-date");
    private By btnArrivalDateBox = By.cssSelector(".iconimg-return-date");

    private By numOfAdults = By.cssSelector("#numOfAdults");
    private By numOfChildren = By.cssSelector("#numOfInfants");
    private By numOfInfants = By.cssSelector("#numOfInfants");
    private By btnIncrementNum = By.cssSelector(".num-inc");
    private By btnDecrementNumb = By.cssSelector(".num-dec");

    private By btnTicketClassBox = By.cssSelector("#ticket-class");
    private By inputPromoCode = By.cssSelector("#promoCode");

    private By btnSearch = By.cssSelector("#booker-search");

    public void clickSearch() {
        getSelf().$(btnSearch).click();
    }
}