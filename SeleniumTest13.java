package TestingS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumTest13 {
	public static void main(String[] args) throws InterruptedException{
		System.out.println("B2C���Ի���¼");
		WebDriver driver = new ChromeDriver();
		driver.get("http://61.164.47.179:2208/b2c_test/login.html");
		//��¼
		/*driver.get(baseUrl + "/Login/index");
        driver.findElement(By.name("in_yonghCode")).clear();
        driver.findElement(By.name("in_yonghCode")).sendKeys(userName);
        driver.findElement(By.name("in_yonghPwd")).clear();
        driver.findElement(By.name("in_yonghPwd")).sendKeys(password);
        driver.findElement(By.id("loginAction")).click();*/
		driver.findElement(By.name("in_yonghCode")).clear();
		driver.findElement(By.name("in_yonghCode")).sendKeys("xuany");
		driver.findElement(By.name("in_yonghPwd")).clear();
		driver.findElement(By.name("in_yonghPwd")).sendKeys("1234");
		driver.findElement(By.id("login")).click();
		Thread.sleep(1000);
		System.out.println("login success!");
		//��¼֮���һЩ������
		//....
		//�˳�
		driver.findElement(By.linkText("�˳���¼")).click();
		driver.quit();
		}
}
