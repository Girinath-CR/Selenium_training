package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_3 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "F:\\driver\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 driver.get("https://accounts.lambdatest.com/register");
		 WebElement username = driver.findElement(By.id("name"));
		 username.sendKeys("Girinath CR");
		 WebElement email = driver.findElement(By.id("email"));
		 email.sendKeys("giri85@gmail.com");
		 WebElement pass = driver.findElement(By.id("userpassword"));
		 pass.sendKeys("Robot@1111");
		 WebElement mob = driver.findElement(By.id("phone"));
		 mob.sendKeys("7339131267");
		 WebElement company = driver.findElement(By.id("org_name"));
		 company.sendKeys("Capg");
		 WebElement samp = driver.findElement(By.tagName("samp"));
		 samp.click();
		 WebElement btn = driver.findElement(By.tagName("button"));
		 btn.click();
	}

}
