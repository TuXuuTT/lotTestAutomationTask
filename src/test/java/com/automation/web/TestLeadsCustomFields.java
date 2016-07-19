package com.automation.web;

import com.automation.BaseTest;
import com.automation.pageobjects.BaseAppLoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

import static com.codeborne.selenide.Selenide.open;

public class TestLeadsCustomFields extends BaseTest {

    BaseAppLoginPage settingsPage;
    String randomStr;

    @Override
    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        super.beforeClass();
        settingsPage = open(BaseAppLoginPage.getPageURL(), BaseAppLoginPage.class)
                .loginAsAdmin();
    }

    @Features("Lead custom fields functionality")
    @Stories({"Verify custom fields defined in Settings are available to new Leads"})
    @Test(description = "")
    public void testLeadWithCustomFields() {
    }

}