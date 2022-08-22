package Pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WindowsPage extends BasePage {

  public WindowsPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(css = ".nav-stacked>li>a")
  private List<WebElement> TabsList;


  @FindBy(css = "#Tabbed button")
  private WebElement NewTabWindows;


  @FindBy(css = "#Seperate button")
  private WebElement NewSeparateWindow;

  @FindBy(css = "#Multiple button")
  private WebElement NewMultipleWindows;

  public void DealTab(){
    elementMethods.clickElement(TabsList.get(0));
    elementMethods.clickElement(NewTabWindows);
    tabMethods.SwitchSpecificTabWindow(1);
    tabMethods.CloseSpecificTabWindow();
    tabMethods.SwitchSpecificTabWindow(0);
  }

  public void DealWindow(){
    elementMethods.clickElement(TabsList.get(1));
    elementMethods.clickElement(NewSeparateWindow);
    tabMethods.SwitchSpecificTabWindow(1);
    tabMethods.CloseSpecificTabWindow();
    tabMethods.SwitchSpecificTabWindow(0);
  }

  public void DealTabs(){
    elementMethods.clickElement(TabsList.get(2));
    elementMethods.clickElement(NewMultipleWindows);
    tabMethods.SwitchSpecificTabWindow(2);
    tabMethods.CloseSpecificTabWindow();
    tabMethods.SwitchSpecificTabWindow(1);
    tabMethods.CloseSpecificTabWindow();
    tabMethods.SwitchSpecificTabWindow(0);
  }
}
