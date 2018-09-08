package TestingS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumTest3 {
	public static void main(String[] args){
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.youdao.com");
		driver.findElement(By.id("query")).sendKeys("submit");
		//提交输入的内容
		driver.findElement(By.id("query")).submit();
		driver.quit();
		}
		}

