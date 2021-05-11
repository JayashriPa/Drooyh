package Ecommerce.Droogh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPage 
{

	public static WebDriver driver=null;
	
    public  void login() throws Exception
   {

		System.setProperty("webdriver.chrome.driver", "D:\\EclipseWorkSpace\\Droogh\\target\\chromedriver.exe"); 
		System.setProperty("webdriver.chrome.silentOutput","true");

		// Instantiate a ChromeDriver class.     
		 driver=new ChromeDriver();  


		// Launch Website  
		driver.navigate().to("https://drooyhmaster.web.app/");  

		//Maximize the browser  
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("adminthree@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");

		driver.findElement(By.xpath("//*[@id='loginform']/div/div[2]/div/div[2]/div/div[2]/form/div[3]/button")).click();
		System.out.println("Login was successful!!!!");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='otpform']/div/div/div/div/div[2]/button")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.name("otpvalue")).sendKeys("1234");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='otpform']/div/div/div/div/div[2]/form/button")).click();
		Thread.sleep(10000);
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("scroll(0, 250);");
		
		
		
	}
}


