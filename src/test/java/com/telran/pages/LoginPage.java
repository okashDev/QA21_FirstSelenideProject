package com.telran.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;


public class LoginPage {
    private By emailLocator = By.cssSelector("[placeholder='Email']");
    private By passwordLocator = By.cssSelector("[placeholder='Password']");
    private By loginButtonLocator =By.xpath("//button[contains(.,'Login')]");
    private By signOutTabLocator = By.xpath("//button[contains(.,'Sign Out')]");
    private By loginFailedTextLocator = By.cssSelector(".login_login__3EHKB > div");

    public LoginPage() {
        open("https://contacts-app.tobbymarshall815.vercel.app/login");
    }

    public void with(String email, String password) {
        $(emailLocator).val(email);
        $(passwordLocator).val(password);
        $(loginButtonLocator).click();
    }

    public void validLogin() {
        $(signOutTabLocator).shouldBe(Condition.visible);
    }

    public void invalidLogin() {
        confirm();
        $(loginFailedTextLocator).shouldBe(Condition.visible);
    }
}
