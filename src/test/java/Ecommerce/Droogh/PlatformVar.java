package Ecommerce.Droogh;

import org.openqa.selenium.By;

public class PlatformVar extends LoginPage{

	public static void main(String[] args) throws Exception 
	{
		PlatformVar pv=new PlatformVar();
		pv.login();
		pv.Platform();

	}
	public void Platform() throws Exception
	{
		driver.findElement(By.xpath("//*[@id='root']/div/div[4]/div[1]/div/div[3]/div/div[3]/button")).click();
		driver.findElement(By.name("Variable_Name")).sendKeys("varchar12");
		driver.findElement(By.name("Variable_Value")).sendKeys("11");
		driver.findElement(By.name("Description")).sendKeys("Platform variable var21 value is 11ch");
		driver.findElement(By.xpath("//*[@id='apikeyform']/div/div/form/div/div[2]/div/div[4]/div/button")).click();
		driver.findElement(By.xpath("//*[@id='bindApi']/div/div/div[1]/div[2]/div/div/p/a[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='bindApi']/div/div/div[1]/div[2]/div/div/div[2]/input")).sendKeys("1234");
		driver.findElement(By.xpath("//*[@id='bindApi']/div/div/div[1]/div[2]/div/div/p/a[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='btn btn- btn-info  ']")).click();
		
	}

}
