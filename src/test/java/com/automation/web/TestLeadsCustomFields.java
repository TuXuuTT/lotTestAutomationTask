package com.automation.web;

import com.automation.BaseTest;
import com.automation.pageobjects.StartPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

import static com.codeborne.selenide.Selenide.open;

public class TestLeadsCustomFields extends BaseTest {

    StartPage startPage;
    String randomStr;

    @Override
    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        super.beforeClass();
        startPage = open(StartPage.getAppURL(), StartPage.class)
                .checkToCheck();

    }

    @Features("Lead custom fields functionality")
    @Stories({"Verify custom fields defined in Settings are available to new Leads"})
    @Test(description = "")
    public void testLeadWithCustomFields() {
    }

}