package com.automation.stepDefinitions;

import com.automation.pageobjects.LotStartPage;
import cucumber.api.java.en.Given;

import static com.codeborne.selenide.Selenide.open;

public class BasicStepDefs {

    @Given("^Lot start page is opened$")
    public void lotStartPageIsOpened() {
        open(LotStartPage.getAppURL(), LotStartPage.class);
    }
}
