package TestingS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumTest4 {
	public static void main(String[] args){
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.126.com");
		System.out.println("126�����¼");
		//��ȡ��ǰ�� title �� url
		System.out.printf("title of current page is %s\n", driver.getTitle());
		System.out.printf("url of current page is %s\n", driver.getCurrentUrl());
		//��¼ 126 ����
		/*
		 *  driver.find_element_by_name("email").clear()  
             driver.find_element_by_name("email").send_keys("username")  
             driver.find_element_by_name("password").clear()  
             driver.find_element_by_name("password").send_keys("password")  
            driver.find_element_by_id("dologin").click()  
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("c1726997045@126.com");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("xzgl373846778");
		driver.findElement(By.id("dologin")).click();*/
		driver.switchTo().frame("x-URS-iframe");
		//��λ�˺š����롢��¼
		driver.findElement(By.cssSelector("[class='j-inputtext dlemail']")).sendKeys("c1726997045");
		driver.findElement(By.cssSelector("[class='j-inputtext dlpwd']")).sendKeys("xzgl373846778");
		driver.findElement(By.xpath("//div[@class='f-cb loginbox']/a")).click();
		/*driver.quit();	*/
		System.out.println("After login================");
		//��ȡ��ǰ�� title �� url
		System.out.printf("title of current page is %s\n", driver.getTitle());
		System.out.printf("url of current page is %s\n", driver.getCurrentUrl());
		//��õ�¼�û���
		String text = driver.findElement(By.id("spnUid")).getText();
		System.out.println(text);
		driver.quit();
	}
}
