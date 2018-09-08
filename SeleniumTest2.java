package TestingS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;;
public class SeleniumTest2 {
	public static void main(String[] args) {
		System.out.println("selenium开始");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.baidu.com/");
		WebElement txtbox=driver.findElement(By.id("kw"));
		txtbox.sendKeys("景德镇陶瓷大学");
		WebElement btn=driver.findElement(By.id("su"));
		btn.click();
		driver.close();
		System.out.println("selenium结束");
		}
}