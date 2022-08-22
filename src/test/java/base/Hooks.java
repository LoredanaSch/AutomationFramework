package base;

import PropertiesFile.PropertiesUtility;
import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
public class Hooks extends BaseTest{

  public HashMap<String, String> TestData;

  @Before
  public void PrepareEnvironment(){
    Setup();
    String className = this.getClass().getSimpleName();// linie de cod care iti da numele clasei care ruleaza
    PropertiesUtility propertiesUtility = new PropertiesUtility(className);
    TestData = propertiesUtility.GetAllKeyValues();

  }

  @After
  public void ClearEnvironment(){
    driver.quit();
  }

}
