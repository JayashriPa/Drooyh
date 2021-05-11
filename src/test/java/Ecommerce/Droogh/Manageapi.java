package Ecommerce.Droogh;


import org.openqa.selenium.By;


public class Manageapi extends LoginPage {

	public static void main(String[] args) throws Exception 
	{
		Manageapi ap=new Manageapi();
		ap.login();
		
		ap.apikey();

	}
	 public void apikey() throws Exception 
	 {
		 driver.findElement(By.xpath("//*[@id='root']/div/div[4]/div[1]/div/div[2]/div/div[3]/button")).click();
		 
		 driver.findElement(By.name("Key_Name")).sendKeys("ServiceApi");
		 driver.findElement(By.name("Key_Value")).sendKeys("Service47");
		 driver.findElement(By.name("Description")).sendKeys("SErvice apis to customers");
		 driver.findElement(By.xpath("//*[@id='apikeyform']/div/div/form/div/div[2]/div/div[4]/div/button")).click();
		 driver.findElement(By.xpath("//*[@id='bindApi']/div/div/div[1]/div[2]/div/div/p/a[2]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id='bindApi']/div/div/div[1]/div[2]/div/div/div[2]/input")).sendKeys("1234");
		 driver.findElement(By.xpath("//*[@id='bindApi']/div/div/div[1]/div[2]/div/div/p/a[2]")).click();
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//a[@class='btn btn- btn-info  ']")).click();
		 
		
	}

}