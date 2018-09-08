package TestingS;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumTest8 {
	public static void main(String[] arge) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.baidu.com");
		//获得当前窗口句柄
		String sreach_handle = driver.getWindowHandle();
		//打开百度注册窗口
		System.out.println(sreach_handle);
		driver.findElement(By.linkText("登录")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("立即注册")).click();
		//获得所有窗口句柄
		Set<String> handles = driver.getWindowHandles();
		//判断是否为注册窗口，并操作注册窗口上的元素
		for(String handle : handles){
		if (handle.equals(sreach_handle)==false){
		//切换到注册页面
		driver.switchTo().window(handle);
		System.out.println("now register window!");
		Thread.sleep(2000);
		driver.findElement(By.name("account")).clear();
		driver.findElement(By.name("account")).sendKeys("username");
		driver.findElement(By.name("password")).sendKeys("password");
		Thread.sleep(2000);
		//......
		//关闭当前窗口
		driver.close();
		}
		}
		//判断是否为百度首页，并操作首页上的元素
		for(String handle : handles){
		if (handle.equals(sreach_handle)){
		//切换到注册页面
		driver.switchTo().window(handle);
		Thread.sleep(2000);
		driver.findElement(By.className("close-btn")).click();
		System.out.println("now baidu sreach page!");
		driver.findElement(By.id("kw")).sendKeys("webdriver");
		driver.findElement(By.id("su")).click();
		Thread.sleep(2000);
		}
		}
		driver.quit();
	}
}
