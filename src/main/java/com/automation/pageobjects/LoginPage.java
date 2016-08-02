package com.automation.pageobjects;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasicPage {
    protected By btnRegister = By.cssSelector("a[href='register']");
    protected By inputLogin = By.cssSelector("input#login");
    protected By inputPassword = By.cssSelector("input#pass");
    protected By btnForgotPassword = By.cssSelector("a[href='forgot-password']");
    protected By btnNext = By.cssSelector("div.f-row input[type='submit']");

    public void verifyPageOpened() {
        $(btnRegister).shouldBe(Condition.enabled);
        $(inputLogin).shouldBe(Condition.visible);
        $(inputPassword).shouldBe(Condition.visible);
        $(btnForgotPassword).shouldBe(Condition.enabled);
        $(btnNext).shouldBe(Condition.enabled);
    }
}
