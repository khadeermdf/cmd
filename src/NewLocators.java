import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class NewLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name= "khadeer";
		
		System.setProperty("webdriver.chrome.driver", "D:/Automationtools/chromedriver/chromedriver.exe"); // Example path
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
         driver.get("https://rahulshettyacademy.com/locatorspractice/");
         driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys(name);
         driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("rahulshettyacademy");
         driver.findElement(By.cssSelector("button[type='submit']")).click();
         Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] p")).getText());
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] p")).getText(), "You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
        driver.findElement(By.cssSelector(".logout-btn")).click();
        driver.close();
	}

}
