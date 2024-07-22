import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

String name = "khadeer";

System.setProperty("Webdriver.chrome.driver", "D/Automationtools/Chromedrivers/chromedrivers.exe");
WebDriver driver = new ChromeDriver();
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://rahulshettyacademy.com/locatorspractice/");
driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(name);
driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("123456");
driver.findElement(By.xpath("//button[@type='submit']")).click();
driver.findElement(By.xpath("//a[normalize-space()='Forgot your password?']")).click();
driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("rahul");
driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rahulshettyacademy");
driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("1234567890");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[normalize-space()='Reset Login']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(name);
driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("rahulshettyacademy");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@type='submit']")).click();
System.out.println(driver.findElement(By.xpath("//p[normalize-space()='You are successfully logged in.']")).getText());
Assert.assertEquals((driver.findElement(By.xpath("//p[normalize-space()='You are successfully logged in.']")).getText()), "You are successfully logged in.");
Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
driver.findElement(By.cssSelector(".logout-btn")).click();
driver.close();












	}

}
