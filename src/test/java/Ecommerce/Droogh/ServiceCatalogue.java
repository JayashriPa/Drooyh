package Ecommerce.Droogh;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ServiceCatalogue extends LoginPage{

	public static void main(String[] args) throws Exception {
		ServiceCatalogue sc=new ServiceCatalogue();
		sc.login();
		sc.Servicemethod();

	}
	public void Servicemethod() throws Exception
	{
		//((JavascriptExecutor)driver).executeScript("scroll(0,600)");
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//*[@id='root']/div/div[4]/div[1]/div/div[4]/div/div[2]/p"));
		je.executeScript("arguments[0].scrollIntoView(true);",element);
		//System.out.println(element.getText());
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='root']/div/div[4]/div[1]/div/div[4]/div/div[3]/button")).click();
		driver.findElement(By.name("Service_Name")).sendKeys("WildLife conservation");
		driver.findElement(By.id("Percentage_Value")).sendKeys("80");
		driver.findElement(By.name("Service_Description")).sendKeys("WildLife conservation also known as eco drones");
		Thread.sleep(8000);
		//driver.findElement(By.xpath("//*[@id='addsc']/div/div/form/div/div[2]/div[4]/div/div/div[2]/button")).sendKeys("C:\\Users\\HP\\Desktop\\drone.PNG");
		Actions act=new Actions(driver);
		////button[@class='btn-round btn btn-default']
		WebElement chosefile=driver.findElement(By.xpath("//*[@id='addsc']/div/div/form/div/div[2]/div[4]/div/div[1]/input"));

		act.moveToElement(chosefile).perform();
		Thread.sleep(6000);
		chosefile.sendKeys("C:\\Users\\HP\\Desktop\\drone.PNG");
		Thread.sleep(4000);
		
		JavascriptExecutor je1 = (JavascriptExecutor) driver;
		WebElement element1 = driver.findElement(By.xpath("//*[@id='addsc']/div/div/form/div/div[2]/div[5]/div/div/button"));
		je1.executeScript("arguments[0].scrollIntoView(true);",element1);
		System.out.println(element1.getText());
		element1.click();
		
		//driver.findElement(By.xpath("//*[@id='addsc']/div/div/form/div/div[2]/div[5]/div/div/button")).click();
		driver.findElement(By.xpath("//a[@class='btn btn- btn-info  ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='bindServiceCatalogue']/div/div/div[1]/div[2]/div/div/div[2]/input")).sendKeys("1234");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='btn btn- btn-info  ']")).click();
		driver.findElement(By.xpath("//a[@class='btn btn- btn-info  ']")).click();//For Done
		
		
		
		
	}

}
