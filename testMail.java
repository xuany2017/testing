package TestingS;
import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class testMail {
	//登录方法
	public static void login(WebDriver driver,String username,String
	password){
	driver.findElement(By.id("idInput")).clear();
	driver.findElement(By.id("idInput")).sendKeys(username);
	driver.findElement(By.id("pwdInput")).clear();
	driver.findElement(By.id("pwdInput")).sendKeys(password);
	driver.findElement(By.id("loginBtn")).click();
	}
	//退出方法
	public static void logout(WebDriver driver){
	driver.findElement(By.linkText("退出")).click();
	}
	@Test
	public void verifyLogin() {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://www.126.com");
	String username = "testingwtb";
	String password = "a123456";
	login(driver,username,password);
	String text = driver.findElement(By.id("spnUid")).getText();
	assertEquals(text,"testingwtb@126.com");
	logout(driver);
	driver.quit();
	}
	@Test (dependsOnMethods = {"verifyLogin"})
	public void verifySearchMail() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.126.com");
		String username = "testingwtb";
		String password = "a123456";
		login(driver,username,password);
		//搜索
		WebElement search =driver.findElement(By.xpath(""));
		search.sendKeys("小明");
		search.sendKeys(Keys.ENTER);
		String text =
		driver.findElement(By.className("nui-title-text")).getText();
		System.out.println(text);
		assertEquals(text,"搜索结果");
		logout(driver);
		driver.quit();
		}
	}


