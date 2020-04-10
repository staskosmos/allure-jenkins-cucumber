package by.varyn.allure.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginInPage {
    private  SelenideElement loginInput = $(By.cssSelector("#email"));
    private SelenideElement passwordInput = $(By.cssSelector("#password"));

    public void inputLogin(String text) {
        this.loginInput.val(text);
    }

    public void inputPassword(String text) {
        this.passwordInput.val(text);
    }
}
