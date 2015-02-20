package AuthPage;

import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Auth extends PageObject {
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 20000;

    @FindBy(className = "ajaxPage")
    private WebElement addEntry;

    @FindBy(id  = "input-email")
    private WebElement addLogin;

    @FindBy(id = "input-password")
    private WebElement addPass;

    @FindBy(xpath  = "//*[@id='ajax2login']/input")
    private WebElement addEnter;




    public Auth(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);
    }


    public void setClickEntry() {
        clickOn(addEntry);
    }

    public void setLoginIn() {enter("fazen7@mail.ru").into(addLogin);}
    public void setPassIn() {enter("12345").into(addPass);}

    public void setEnterIn() {

        clickOn(addEnter);}



}
