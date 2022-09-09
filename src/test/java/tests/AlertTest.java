package tests;


import Objects.AlertObject;
import Pages.AlertPage;
import Pages.IndexPage;
import Pages.RegisterPage;
import base.Hooks;
import org.junit.Test;

public class AlertTest extends Hooks {

    @Test
    public void alertMethod() {

        AlertObject alertObject = new AlertObject(TestData);

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.GoToAlertPage();

        AlertPage alertPage = new AlertPage(driver);
        alertPage.DealAlertOk();
        alertPage.DealAlertOkCancel();
        alertPage.DealAlertSendKeys(alertObject);
    }
}
