package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AssignTaskForAldarDevelopment 
{

	public WebDriver driver;
	public AssignTaskForAldarDevelopment(WebDriver driver1)
	{
		driver=driver1;
		PageFactory.initElements(driver1, this);
	}
	
	
	
	
	public void click_on_App_User_Configuration() 
	{
		driver.findElement(By.xpath("//span[text()='App & User Configuration']")).click();
	}

	
	public void click_on_Assign_Task()
	{
		driver.findElement(By.xpath("//span[text()='Assign Task']")).click();
	}

	
	public void click_and_Select_Auditors() throws InterruptedException 
	{
		driver.findElement(By.xpath("(//div[text()='Select'])[1]/../../..")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()=' Aarav Kumar']")).click();
	}

	
	public void click_and_Select_Assets() throws InterruptedException 
	{
       driver.findElement(By.xpath("(//div[text()='Select'])[1]/../../..")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='Aldar Development']")).click();
	}

	
	public void click_and_Select_Journey() throws InterruptedException 
	{
        driver.findElement(By.xpath("(//div[text()='Select'])[2]/../../..")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='Customer Care (Aldar Square) & Call Center']")).click();
	}

	
	public void click_and_Select_Start_Date() throws InterruptedException 
	{
        driver.findElement(By.id("from_date")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//td[text()='25']")).click();
	}

	
	public void click_and_Select_End_Date() throws InterruptedException 
	{
        driver.findElement(By.id("to_date")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//td[text()='28']")).click();
	}

	
	public void click_on_Assign() throws InterruptedException 
	{
		driver.findElement(By.id("assigntask")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
	}


	
}
