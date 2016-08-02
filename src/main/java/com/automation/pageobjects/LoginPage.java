package com.automation.pageobjects;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasicPage {
    private By btnRegister = By.cssSelector("a[href='register']");
    private By inputLogin = By.cssSelector("input#login");
    private By inputPassword = By.cssSelector("input#pass");
    private By btnForgotPassword = By.cssSelector("a[href='forgot-password']");
    private By btnNext = By.cssSelector("div.f-row input[type='submit']");

    public void verifyPageOpened() {
        $(btnRegister).shouldBe(Condition.enabled);
        $(inputLogin).shouldBe(Condition.visible);
        $(inputPassword).shouldBe(Condition.visible);
        $(btnForgotPassword).shouldBe(Condition.enabled);
        $(btnNext).shouldBe(Condition.enabled);
    }
}
