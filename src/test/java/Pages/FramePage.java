package Pages;

import Objects.FrameObject;
import java.awt.Frame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class FramePage extends BasePage{

  public FramePage(WebDriver driver) {
    super(driver);
  }


  @FindBy(css = "input[type='text']")
  private WebElement SingleFrame;

  @FindBy(css = "a[href='#Multiple']")
  private WebElement IframeDublu;

  public void DealSingleFrame(FrameObject frameObject){

    frameMethods.SwitchToFrame("singleframe");
    elementMethods.fillElement(SingleFrame, frameObject.getSingleFrame());
    frameMethods.SwitchToBaseFrame();
  }
 public void DealMultipleFrames(FrameObject frameObject){

   elementMethods.clickElement(IframeDublu);
   frameMethods.SwitchToFrame(driver.findElement(By.cssSelector("iframe[src='MultipleFrames.html']")));
   frameMethods.SwitchToFrame(driver.findElement(By.cssSelector("iframe[src='SingleFrame.html']")));
   elementMethods.fillElement(SingleFrame, frameObject.getMultipleFrame());
 }

}
