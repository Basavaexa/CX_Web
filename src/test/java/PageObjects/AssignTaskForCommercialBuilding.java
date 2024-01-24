package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AssignTaskForCommercialBuilding 
{

	public WebDriver driver;
	public AssignTaskForCommercialBuilding (WebDriver driver1)
	{
		driver=driver1;
		PageFactory.initElements(driver1, this);
	}
	

	public void click_and_Select_Auditors_CB() throws InterruptedException 
	{
		driver.findElement(By.xpath("(//div[text()='Select'])[1]/../../..")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[text()=' Aarav Kumar']")).click(); 
	}

	
	public void click_and_Select_Assets_CB() throws InterruptedException 
	{
		driver.findElement(By.xpath("(//div[text()='Select'])[1]/../../..")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[text()='Commercial Buildings']")).click();
	}

	
	public void click_and_Select_Commercial_Building() throws InterruptedException
	{
		driver.findElement(By.xpath("(//div[text()='Select'])[2]/../../..")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[text()='ADGM']")).click();
	}

	
	public void click_and_Select_Start_Date_CB() throws InterruptedException 
	{
		driver.findElement(By.id("from_date")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//td[text()='25']")).click();
	}

	
	public void click_and_Select_End_Date_CB() throws InterruptedException 
	{
		driver.findElement(By.id("to_date")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//td[text()='28']")).click();
	}

	
	public void click_on_Assign_CB() throws InterruptedException 
	{
		driver.findElement(By.id("assigntask")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[text()='OK']")).click();
	}
	
	
	
}
