package tests;

import Pages.IndexPage;
import Pages.RegisterPage;
import Pages.WindowsPage;
import base.Hooks;
import helpMethods.ElementMethods;
import helpMethods.PageMethods;
import helpMethods.TabMethods;
import base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TabTest extends Hooks {

    @Test
    public void tabTestMethod(){

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.GoToWindowsPage();

        WindowsPage windowsPage = new WindowsPage(driver);
        windowsPage.DealTab();
        windowsPage.DealWindow();
        windowsPage.DealTabs();

    }
}
