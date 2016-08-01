package com.automation.pageobjects.containerBlocks;

import com.codeborne.selenide.ElementsContainer;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

import static org.testng.AssertJUnit.assertTrue;

public class HeaderBlock extends ElementsContainer {

    public By navigationLink = By.cssSelector(".g-no-padding-b.g-no-letter-spacing>a");


    public void verifyLinks(List links) {
        List<String> hrefs = getSelf().$$(navigationLink).stream().map(el -> el.getAttribute("href")).collect(Collectors.toList());
        assertTrue("Header does not contain all required link, but contains: " + hrefs, hrefs.containsAll(links));
    }
}
