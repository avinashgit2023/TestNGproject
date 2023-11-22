package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.resources.BaseClass;

import PageObjectModel.homePageObjects;
import PageObjectModel.loginPageObject;

public class LoignTestCases extends BaseClass {

 @Test
 public void invalidLoginTest() throws IOException {

  homePageObjects hpo = new homePageObjects(driver);

  hpo.clickOnMyAccount().click();
  hpo.clickOnLogin().click();

  loginPageObject lpo = new loginPageObject(driver);

  lpo.enterEmail().sendKeys(RegisterTestCases.randomEmail);
  lpo.enterLPassword().sendKeys("test123");
  lpo.clickOnLogin().click();

 }

}