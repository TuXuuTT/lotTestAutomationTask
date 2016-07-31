package com.automation.pageobjects.containerBlocks;

import com.codeborne.selenide.ElementsContainer;
import org.openqa.selenium.By;

import java.util.Arrays;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$;
import static org.testng.AssertJUnit.assertTrue;

public class HeaderBlock extends ElementsContainer {

    public By navigationLink = By.cssSelector(".g-no-padding-b.g-no-letter-spacing>a");


    public void verifyLinks(List links) {
        assertTrue("Header does not contain all required links", Arrays.asList($$(navigationLink).getTexts()).containsAll(links));
    }
}
