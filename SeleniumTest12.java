package TestingS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumTest12 {
	/*public static void login(WebDriver driver){
		driver.findElement(By.id("idInput")).clear();
		driver.findElement(By.id("idInput")).sendKeys("xuany");
		driver.findElement(By.id("pwdInput")).clear();
		driver.findElement(By.id("pwdInput")).sendKeys("1234");
		driver.findElement(By.id("loginBtn")).click();
	}
	//退出方法
	public static void logout(WebDriver driver){
	driver.findElement(By.linkText("退出")).click();
	}*/
	public static void main(String[] args) throws InterruptedException{
	System.out.println("可视化数据仓");
	WebDriver driver = new ChromeDriver();
	driver.get("http://s2.ruerp.com/baobiao/");
	//登录
	/*login(driver);*/
	Thread.sleep(1000);
	System.out.println("login success!");
	//登录之后的一些操作。
	//....
	//退出
	/*logout(driver);
	driver.quit();*/
	}
}
