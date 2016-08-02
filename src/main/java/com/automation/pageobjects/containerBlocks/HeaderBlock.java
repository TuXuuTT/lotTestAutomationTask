package com.automation.pageobjects.containerBlocks;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsContainer;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

import static org.testng.AssertJUnit.assertTrue;

public class HeaderBlock extends ElementsContainer {

    private By navigationLink = By.cssSelector(".g-no-padding-b.g-no-letter-spacing>a");
    private By accHeaderLinks = By.cssSelector(".b-horizontal-list.o-add-menu.g-nowrap>li");
    private By accHeaderLogin = By.cssSelector("a[href$='login']");
    private By languagePicker = By.cssSelector("a#languageClick");
    private By languagesSelection = By.cssSelector("#o-top-layer-languages");
    private By countrySelector = By.cssSelector(".country-selector");
    private By btnCloseLanguagePicker = By.cssSelector("#closeLanguageClick");

    public void verifyLinks(List links) {
        List<String> hrefs = getSelf().$$(navigationLink).stream().map(el -> el.getAttribute("href")).collect(Collectors.toList());
        assertTrue("Header does not contain all required link, but contains: " + hrefs, hrefs.containsAll(links));
    }

    public void navigateToLogin() {
        getSelf().$(accHeaderLinks).$(accHeaderLogin).click();
    }

    public void clickLanguagePicker() {
        getSelf().$(languagePicker).click();
    }

    public void verifyLanguagePicker() {
        getSelf().$(languagesSelection).shouldBe(Condition.visible);
        getSelf().$$(countrySelector).shouldHave(CollectionCondition.sizeGreaterThanOrEqual(43));
        getSelf().$(btnCloseLanguagePicker).click();
        getSelf().$(languagesSelection).should(Condition.disappear);
    }
}
