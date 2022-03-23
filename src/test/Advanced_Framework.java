package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Advanced_Framework {
	WebDriver driver;
  @Test
  public void f() {
	  driver.manage().window().maximize();
		driver.navigate().to("http://www.fb.com");
		String expected = "http://www.facebook.com";
		String actual = driver.getCurrentUrl();
		if(expected.equalsIgnoreCase(actual))
			System.out.println("Pass");
		else
			System.out.println("Fail");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("Giri");
		driver.findElement(By.name("lastname")).sendKeys("Uchiha");
		driver.findElement(By.name("reg_email__")).sendKeys("7339131267");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Robot@1111");
		Select day = new Select(driver.findElement(By.name("birthday_day")));
		day.selectByValue("24");
		Select month = new Select(driver.findElement(By.name("birthday_month")));
		month.selectByValue("6");
		Select year = new Select(driver.findElement(By.name("birthday_year")));
		year.selectByValue("1999");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.name("websubmit")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "F:\\\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
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
