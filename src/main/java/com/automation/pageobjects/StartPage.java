package com.automation.pageobjects;

import com.automation.pageobjects.containerBlocks.BookerBlock;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class StartPage extends BasicPage {

    @FindBy(css = "#bookerContainer")
    private BookerBlock bookerBlock;

    public StartPage checkToCheck() {
        bookerBlock.clickSearch();
        return page(this);
    }

}
