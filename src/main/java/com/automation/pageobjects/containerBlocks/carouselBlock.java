package com.automation.pageobjects.containerBlocks;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class CarouselBlock extends ElementsContainer {
    private By carouselImagesList = By.cssSelector("div.owl-wrapper-outer ul");
    private By nextSlide = By.cssSelector(".owl-next");
    private By prevSlide = By.cssSelector(".owl-prev");
    private By pauseSlide = By.cssSelector(".owl-pause");
    private By playSlide = By.cssSelector(".owl-play");
    private By horizontalSlideList = By.cssSelector(".owl-pagination");

    public CarouselBlock() {
    }

    public void verifyCarouselComponent() {
        getSelf().$(carouselImagesList).shouldBe(Condition.visible);
        getSelf().$(carouselImagesList).$$("li").shouldHave(CollectionCondition.sizeGreaterThan(1));
        verifyCarouselControls();
    }

    private void verifyCarouselControls() {
        getSelf().$(playSlide).shouldBe(Condition.hidden);
        getSelf().$(pauseSlide).click();
        getSelf().$(playSlide).shouldBe(Condition.visible);
        int oldActiveSlideIndex = getActiveSlideNumber();
        getSelf().$(nextSlide).click();
        int newActiveSlideIndex = getActiveSlideNumber();
        assertNotEquals(oldActiveSlideIndex, newActiveSlideIndex);
        getSelf().$(prevSlide).click();
        assertEquals(oldActiveSlideIndex, getActiveSlideNumber());
    }

    private int getActiveSlideNumber() {
        List<SelenideElement> slides = getSelf().$(horizontalSlideList).$$("li>a");
        int index = 999;
        for (SelenideElement element : slides) {
            if (element.has(Condition.cssClass("active"))) {
                index = slides.indexOf(element);
                break;
            }
        }
        return index;
    }
}