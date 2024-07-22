import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PractiseDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/Automationtools/chromedriver/chromedriver.exe"); // Example path
        WebDriver driver = new ChromeDriver();
        WebElement PractiseDropDown = driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(PractiseDropDown);
        dropdown.selectByIndex(3);
	}

}
