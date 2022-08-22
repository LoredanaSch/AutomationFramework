package tests;

import Objects.AlertObject;
import Objects.RegisterObject;
import Pages.IndexPage;
import Pages.RegisterPage;
import base.BaseTest;
import base.Hooks;
import helpMethods.ElementMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RegisterTest extends Hooks {


    @Test
    public void registerMethod() {


        RegisterObject registerObject = new RegisterObject(TestData);

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(driver);
        //registerPage.LanguagesOptions = null; avand access la elemente pot strica codul
        registerPage.RegisterProcess(registerObject);


        //inchidem browserul
        //driver.quit();
    }
}
