package TestingS;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class SelenumTest9 {
	private WebDriver driver;
	private String baseUrl;
	@BeforeMethod
	public void setUp() throws Exception {
	driver = new ChromeDriver();
	baseUrl = "http://www.126.com";
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void testCase() throws Exception {
	driver.get(baseUrl);
	driver.findElement(By.id("idInput")).clear();
	driver.findElement(By.id("idInput")).sendKeys("testingwtb");
	driver.findElement(By.id("pwdInput")).clear();
	driver.findElement(By.id("pwdInput")).sendKeys("a123456");
	driver.findElement(By.id("loginBtn")).click();
	Thread.sleep(2000);
	String text = driver.findElement(By.id("spnUid")).getText();
	Assert.assertEquals(text,"testingwtb@126.com");
	}
	@AfterMethod
	public void tearDown() throws Exception {
	driver.quit();
	}
}
