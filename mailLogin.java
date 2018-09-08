package TestingS;
import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class mailLogin {
	private WebDriver driver;
	private String baseUrl;
	@BeforeClass
	public void setUp() throws Exception {
	driver = new ChromeDriver();
	baseUrl = "http://www.126.com";
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	//定义对象数组
	@DataProvider(name="user")
	public Object[][] Users(){
	return new Object[][]{
	{"c1726997045","xzgl1726997045"},
	};
	}
	//调用 user 数组的值
	@Test(dataProvider="user")
	public void testCase(String username,String password) throws Exception {
	driver.get(baseUrl);
	driver.findElement(By.id("idInput")).clear();
	driver.findElement(By.id("idInput")).sendKeys(username);
	driver.findElement(By.id("pwdInput")).clear();
	driver.findElement(By.id("pwdInput")).sendKeys(password);
	driver.findElement(By.id("loginBtn")).click();
	Thread.sleep(2000);
	String text = driver.findElement(By.id("spnUid")).getText();
	assertEquals(text,username+"@126.com");
	}
	@AfterClass
	public void tearDown() throws Exception {
	driver.quit();
	}
}
