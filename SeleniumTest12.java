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
	//�˳�����
	public static void logout(WebDriver driver){
	driver.findElement(By.linkText("�˳�")).click();
	}*/
	public static void main(String[] args) throws InterruptedException{
	System.out.println("���ӻ����ݲ�");
	WebDriver driver = new ChromeDriver();
	driver.get("http://s2.ruerp.com/baobiao/");
	//��¼
	/*login(driver);*/
	Thread.sleep(1000);
	System.out.println("login success!");
	//��¼֮���һЩ������
	//....
	//�˳�
	/*logout(driver);
	driver.quit();*/
	}
}
