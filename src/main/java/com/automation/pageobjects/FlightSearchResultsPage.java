package com.automation.pageobjects;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FlightSearchResultsPage extends BasicPage {
    private By listSearchSteps = By.cssSelector(".steps");

    public void checkSearchResultsPageLayout() {
        $(listSearchSteps).shouldBe(Condition.visible);
    }
}
