package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Open the browser
        System.setProperty("webdriver.chrome.driver", "F:\\driver\\chromedriver.exe");
        //System.setProperty("webdriver.edge.driver","" )
        // 1.Open the browser
        WebDriver driver = new ChromeDriver();
        //Launch the  url
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/");
        WebElement title_Login=driver.findElement(By.id("logInPanelHeading"));
        //Name of the text
        System.out.println(title_Login.getText());
        //Print Tag name
        System.out.println(title_Login.getTagName());
        
        WebElement uname=driver.findElement(By.id("txtUsername"));
        WebElement pwd=driver.findElement(By.id("txtPassword"));
        uname.clear();
        uname.sendKeys("Admin");
        pwd.clear();
        pwd.sendKeys("admin123");
        WebElement loginBtn=driver.findElement(By.name("Submit"));
        //WebElement loginBtn=driver.findElement(By.id("btnLogin"));
        loginBtn.click();
        //Perform the Step to Executed

 

    }

 

}

	
