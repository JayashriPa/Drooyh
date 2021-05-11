package Ecommerce.Droogh;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class UserRoles extends LoginPage{

	public static void main(String[] args) throws Exception 
	{
		UserRoles ur=new UserRoles();
		ur.login();
		ur.User_method();

	}
	public void User_method() throws Exception
	{
		JavascriptExecutor je = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//*[@id='root']/div/div[4]/div[1]/div/div[6]/div/div[2]/p"));
		je.executeScript("arguments[0].scrollIntoView(true);",element);
		System.out.println(element.getText());
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id='root']/div/div[4]/div[1]/div/div[6]/div/div[3]/button")).click();
		driver.findElement(By.id("Role_Name")).sendKeys("Pilot Provider");
		driver.findElement(By.id("Description")).sendKeys("Adrone pilot");
		driver.findElement(By.xpath("//*[@id='apikeyform']/div/div/form/div/div[2]/div/div[3]/div/button")).click();
		
		driver.findElement(By.xpath("//*[@id='bindApi']/div/div/div[1]/div[2]/div/div/p/a[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='bindApi']/div/div/div[1]/div[2]/div/div/div[2]/input")).sendKeys("1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='bindApi']/div/div/div[1]/div[2]/div/div/p/a")).click();
		
	}

}
