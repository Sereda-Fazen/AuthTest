package steps;

import AuthPage.Auth;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;



public class AuthSteps extends ScenarioSteps {
    Auth authPage;

    public AuthSteps(Pages pages) {
        super(pages);
    }

    @Step ("Запустил браузер")
    public void start_browser() {
        Auth loginPage = getPages().get(Auth.class);
        loginPage.open();
    }

    @Step ("Нажал кнопку Войти")
    public void addEntry() {authPage.setClickEntry();
    }

    @Step ("<strong>Ввел логин</strong>")
    public void addLogin() {authPage.setLoginIn();
    }

    @Step ("Ввел пароль")
    public void addPass() {authPage.setPassIn();
    }

    @Step ("Кликнул Вход" )
    public void addEnter() {authPage.setEnterIn();
    }

    @Step
    public String getTitle() {
       return authPage.getTitle();
    }






}


