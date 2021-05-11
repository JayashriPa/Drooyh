package Ecommerce.Droogh;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Limiters extends LoginPage{

	public static void main(String[] args) throws Exception
	{
		Limiters L=new Limiters();
		L.login();
		L.limiters_method();
		

	}
	public void limiters_method() throws Exception
	{
		JavascriptExecutor je = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//*[@id='root']/div/div[4]/div[1]/div/div[5]/div/div[2]/p"));
		je.executeScript("arguments[0].scrollIntoView(true);",element);
		System.out.println(element.getText());
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='root']/div/div[4]/div[1]/div/div[5]/div/div[3]/button")).click();
		driver.findElement(By.id("Limiter_Name")).sendKeys("Quatations");
		driver.findElement(By.name("Limiter_Value")).sendKeys("100");
		driver.findElement(By.id("Description")).sendKeys("No of quatations");
		driver.findElement(By.xpath("//*[@id='apikeyform']/div/div/form/div/div[2]/div/div[4]/div/button")).click();
		driver.findElement(By.xpath("//a[@class='btn btn- btn-info  ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='bindApi']/div/div/div[1]/div[2]/div/div/div[2]/input")).sendKeys("1234");
		driver.findElement(By.xpath("//*[@id='bindApi']/div/div/div[1]/div[2]/div/div/p/a[2]")).click();
		Thread.sleep(3000);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='btn btn- btn-info  ']")).click();
		
	}

}
