package by.varyn.allure.steps;

import by.varyn.allure.config.UserConfig;
import by.varyn.allure.pages.LoginInPage;
import io.cucumber.java.en.Then;

public class LogInPageDef {
    LoginInPage loginInPage = new LoginInPage();

    @Then("Input login")
    public void inputLogin() {
        loginInPage.inputLogin(UserConfig.USER_LOGIN);
    }

    @Then("Input password")
    public void inputPassword() {
        loginInPage.inputPassword(UserConfig.USER_PASSWORD);
    }
}
