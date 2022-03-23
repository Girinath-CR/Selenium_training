package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class RahulShetty_page {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	  driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
	  ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,1200)");
	  driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
	  driver.switchTo().frame("courses-iframe");
	  driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
	  ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,500)");
	  driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
	  driver.findElement(By.xpath("/html/body/app-root/div/app-home/div/section[1]/div/div/div[1]/a/div/div/h3/a")).click();
	  driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
	  ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,500)");
	  driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
	  driver.findElement(By.id("username")).sendKeys("Giri");
	  driver.findElement(By.id("mobileno")).sendKeys("7339131267");
	  driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	  
	  driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
	 
	  driver.findElement(By.id("requirements")).sendKeys("I need to learn about Automation testing in a very detailed manner from the basics.I prefer using"
	  		+ " Selenium with Java as I have a good knowledge in core java.I would like to know about the course duration and fees structure. ");
	  driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
	  ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,900)");
	  driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
	  Select lang = new Select(driver.findElement(By.id("programming-language")));
	  lang.selectByValue("Java");
	  driver.findElement(By.id("sharing")).click();
	  driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
	  ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,1300)");
	  Select tzone = new Select(driver.findElement(By.id("timezone")));
	  tzone.selectByValue("America/Anchorage");
	  driver.findElement(By.id("afford")).click();
	  driver.findElement(By.xpath("//button[text()='Send Message']")).click();
	  driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//button[text()='Close']")).click();
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "F:\\\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
