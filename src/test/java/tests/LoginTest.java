package tests;


import Objects.LoginObject;
import Pages.IndexPage;
import Pages.SignInPage;
import base.BaseTest;
import base.Hooks;
import helpMethods.ElementMethods;
import helpMethods.PageMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTest extends Hooks {


    @Test
    public void loginMethod(){

        LoginObject loginObject = new LoginObject(TestData);

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickSignIn();

        SignInPage signInPage = new SignInPage(driver);
        signInPage.loginInvalid(loginObject);


        //inchidem un browser
        //driver.quit();
    }
}
