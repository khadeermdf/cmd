import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDropDown1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		Thread.sleep(2000);
		
		/*int i =1;
		while(i<5)
		{
			driver.findElement(By.cssSelector("#hrefIncAdt")).click();
			i++;
		}*/
		System.out.println(driver.findElement(By.cssSelector("#divpaxinfo")).getText());
		for(int i = 1; i<5; i++) {
			driver.findElement(By.cssSelector("#hrefIncAdt")).click();
			
		}
	     driver.findElement(By.cssSelector("#btnclosepaxoption")).click();
	     System.out.println(driver.findElement(By.cssSelector("#divpaxinfo")).getText());
		}
		

	}

