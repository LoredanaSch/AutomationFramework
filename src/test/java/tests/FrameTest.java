package tests;

import Objects.FrameObject;
import Pages.FramePage;
import Pages.IndexPage;
import Pages.RegisterPage;
import base.BaseTest;
import base.Hooks;
import org.junit.Test;

public class FrameTest extends Hooks {

    @Test
    public void FrameMethod(){

        FrameObject frameObject = new FrameObject(TestData);

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.GoToFramePage();

        FramePage framePage = new FramePage(driver);
        framePage.DealSingleFrame(frameObject);
        framePage.DealMultipleFrames(frameObject);
}
}
