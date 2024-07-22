import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SelfIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:/Automationtools/chromedriver/chromedriver.exe"); // Example path
        WebDriver driver = new ChromeDriver();
        
		//System.setProperty("webdriver.geckodriver.driver", "D:/Automationtools/chromedriver/geckodriver"); // Example path
        //WebDriver driver = new FirefoxDriver();
        
		//System.setProperty("webdriver.Edgedriver.driver", "D:/Automationtools/chromedriver/msedgedriver.exe"); // Example path
        //WebDriver driver = new EdgeDriver();
        
        driver.get("https://rahulshettyacademy.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
        driver.quit();


	}

}
