package TestingS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaidu1 {
	public static void main(String[] args) throws InterruptedException{
		System.out.println("B2C΢�Ź��ںŵ�¼");
		WebDriver driver = new ChromeDriver();
		driver.get("http://61.164.47.179:7380/weixinapp/b2c/pages/login.jsp");
		//��¼
		/*driver.get(baseUrl + "/Login/index");
        driver.findElement(By.name("in_yonghCode")).clear();
        driver.findElement(By.name("in_yonghCode")).sendKeys(uname);
        driver.findElement(By.name("in_yonghPwd")).clear();
        driver.findElement(By.name("in_yonghPwd")).sendKeys(upwd);
        driver.findElement(By.id("loginAction")).click();*/
		driver.findElement(By.name("viewport")).clear();
		driver.findElement(By.name("viewport")).sendKeys("18688772747");
		//driver.findElement(By.name("in_yonghPwd")).clear();
		//driver.findElement(By.name("in_yonghPwd")).sendKeys("1234");
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
