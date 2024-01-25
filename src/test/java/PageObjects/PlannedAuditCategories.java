package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PlannedAuditCategories 
{

	public WebDriver driver;
	public PlannedAuditCategories(WebDriver driver1)
	{
		driver=driver1;
		PageFactory.initElements(driver1, this);
	}
	
	
	
	
	public void click_on_view() throws InterruptedException 
	{
		driver.findElement(By.xpath("(//span[@class='fa fa-eye'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("categorydivid_91")).click();
		Thread.sleep(1000);
	}

	
	public void select_category_all_the_No_answer_then_click_Submit() throws InterruptedException 
	{
		driver.findElement(By.xpath("(//div[text()='Please Select'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Aldar Marketing - Hoarding']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[text()=' Submit '])[1]")).click();
		Thread.sleep(1000);
		
		
		
		
		//driver.findElement(By.xpath("(//div[text()='Please Select'])[1]")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[text()='Beach Management (Mamsha)']")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("(//button[text()=' Submit '])[2]")).click();
	}

	
	public void select_Category_for_observation() throws InterruptedException 
	{
		driver.findElement(By.xpath("(//div[text()='Please Select'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='Community and Lifestyle team'])")).click();
		Thread.sleep(1000);
		
	}

	
	public void select_Point() throws InterruptedException 
	{
		driver.findElement(By.id("is_good_images")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='2']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("is_good_description")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='2']")).click();
		
	}

	
	public void click_on_Submit_for_PC() 
	{
		driver.findElement(By.id("submitInspection")).click();
		
	}
	
	
	

}
