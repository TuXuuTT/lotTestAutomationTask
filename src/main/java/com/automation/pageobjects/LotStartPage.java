package com.automation.pageobjects;

import com.automation.pageobjects.containerBlocks.BookerBlock;
import com.automation.pageobjects.containerBlocks.CarouselBlock;
import com.automation.pageobjects.containerBlocks.HeaderBlock;
import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.Arrays;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertEquals;

public class LotStartPage extends BasicPage {

    private List<String> headerLinks = Arrays.asList("http://www.lot.com/", getAppURL() + "check-in", getAppURL() + "my-reservation", getAppURL() + "#");
    @FindBy(css = "#bookerContainer")
    private BookerBlock bookerBlock;
    @FindBy(css = ".o-main-header>div.l-row")
    private HeaderBlock headerBlock;
    @FindBy(css = "#owl-main-slider")
    private CarouselBlock carouselBlock;

    private By activeBookerTab = By.cssSelector("#bookerLinks ul .active");
    private By currentOffers = By.cssSelector("#contentLinks li>a");
    private By footerLinks = By.cssSelector("#footerLinks");
    private By copyrights = By.cssSelector(".o-copyright");

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

    public void verifyPageIsOpened() {
        assertEquals(getWebDriverCurrent().getCurrentUrl(), getAppURL());
    }

    public void verifyCarouselComponent() {
        carouselBlock.verifyCarouselComponent();
    }

    public void verifyBookerBlockDefaults() {
        $(activeBookerTab).shouldHave(Condition.attribute("href", "http://www.lot.com/"));
    }

    public void verifyOffersComponentDisplayed() {
        $$(currentOffers).shouldHave(CollectionCondition.sizeGreaterThanOrEqual(4));
    }

    public void verifyFooterBlockDisplayed() {
        $(footerLinks).shouldBe(Condition.visible);
    }

    public void verifyCopyrightIsDisplayed() {
        $(copyrights).shouldBe(Condition.visible);
    }
}
