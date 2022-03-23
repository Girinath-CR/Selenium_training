package test;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Assignment1_ng {
	WebDriver driver;
  @Test
  public void f() {
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("http://iamneo.ai");
		
		String expected="We are Hiring";
		String actual = driver.getTitle();
		Assert.assertEquals(expected,actual);
		driver.close();
  }
  @Test
  public void g() {
	  driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().back();
		driver.navigate().to("http://iamneo.ai");
		
		System.out.println(driver.getCurrentUrl());
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "F:\\\\driver\\chromedriver.exe");
		driver = new  ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
