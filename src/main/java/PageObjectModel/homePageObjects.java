package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePageObjects {

		 public WebDriver driver; // This driver is null

		 private By myAccount = By.xpath("//i[@class='fa fa-user']");

		 private By register = By.xpath("//a[normalize-space()='Register']");

		 private By login = By.xpath("//a[normalize-space()='Login']");

		 public homePageObjects(WebDriver driver) {

		  this.driver = driver;

		 }

		 public WebElement clickOnMyAccount() {

		  return driver.findElement(myAccount);
		 }

		 public WebElement clickOnRegister() {

		  return driver.findElement(register);
		 }

		 public WebElement clickOnLogin() {

		  return driver.findElement(login);
		 }

		}

