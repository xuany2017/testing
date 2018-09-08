package TestingS;
import java.util.concurrent.TimeUnit;  

import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
  
public class SeleniumFirst {  
  
    public static void main(String[] args) {  
          
             System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");    
           
         WebDriver driver = new ChromeDriver();    
              
         driver.manage().window().maximize();    
               
         driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);       
          
         driver.get("https://www.baidu.com");    
         //�ж�title�ǲ��� �ٶ�һ�£����֪��  
           
         try{  
             String baidu_title = "�ٶ�һ�£����֪��";  
             assert baidu_title == driver.getTitle();  
             System.out.println("Test Pass");  
               
         }catch(Exception e){  
             e.printStackTrace();  
         }  
                
         //�رղ��˳������    
         driver.quit();    
    }  
  
}  