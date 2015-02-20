package tests;


import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import steps.AuthSteps;

import java.io.IOException;

import static org.hamcrest.core.Is.is;


/**
 * Created by rb on 19.01.15.
 */
public class BeforeClass {

    @Managed(uniqueSession = true)
    public WebDriver driver;
    @Steps
    public AuthSteps compare;
    @Steps
    public AuthSteps loginPass;
    @Steps
    public AuthSteps enter;


    @Before
    public void myTest() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Test\\FrameOrderThucydides\\src\\main\\resourse\\IEDriverServer.exe");
        compare.start_browser();
        driver.manage().window().maximize();


    }

    public void assertEnter() {
        Assert.assertThat(enter.getTitle(), is("Авторизация не прошла"));

    }


    @After
    public void close() throws IOException {
        driver.close();
    }


}



