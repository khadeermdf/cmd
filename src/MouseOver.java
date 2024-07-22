import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D:/Automationtools/chromedriver/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "D:/Automationtools/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();//Chrome driver class
		driver.get("https://www.flipkart.com/");
		Actions a = new Actions(driver);// creates new class passing through driver parameter
		
		WebElement move =driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/header[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]"));
		//a.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();
		a.moveToElement(driver.findElement(By.cssSelector("input[placeholder='Search for Products, Brands and More']"))).click().keyDown("hello").build().perform();
		
	}

}
