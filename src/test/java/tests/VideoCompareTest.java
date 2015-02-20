package tests;


import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import utils.Application;


@Story(Application.RozCompare.Compare.class)
@RunWith(ThucydidesRunner.class)
@Concurrent(threads = "1")
public class VideoCompareTest extends BeforeClass {
    @ManagedPages(defaultUrl = "http://stegok.test-lemon.com")
    public Pages pages;

    @WithTag("Авторизация")
    @Test
    public void compareTwoCards() throws InterruptedException {
        compare.addEntry();

        loginPass.addLogin();
        loginPass.addPass();
        enter.addEnter();
       // assertEnter();


        Thread.sleep(5000);
    }


}






