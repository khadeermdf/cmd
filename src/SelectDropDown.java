import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
WebElement StaticDropDown = driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));

Select dropdown = new Select(StaticDropDown);
dropdown.selectByIndex(3);
System.out.println(dropdown.getFirstSelectedOption().getText());
dropdown.selectByVisibleText("INR");
System.out.println(dropdown.getFirstSelectedOption().getText());
dropdown.selectByValue("USD");
System.out.println(dropdown.getFirstSelectedOption().getText());
	}

}
