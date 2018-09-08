package TestingS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;;
public class SeleniumTest {
	public static void main(String[] args) {
		System.out.println("srart selenium");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.baidu.com/");
		WebElement txtbox=driver.findElement(By.id("kw"));
		txtbox.sendKeys("selenium java");
		WebElement btn=driver.findElement(By.id("su"));
		btn.click();
		driver.close();
		System.out.println("end selenium");
		}
}


   