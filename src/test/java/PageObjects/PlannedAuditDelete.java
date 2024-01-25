package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PlannedAuditDelete 
{
	public WebDriver driver;
	public PlannedAuditDelete(WebDriver driver1)
	{
		driver=driver1;
		PageFactory.initElements(driver1, this);
	}

	
	
	public void click_on_Planned_Audit() 
	{
		driver.findElement(By.xpath("//span[text()='Planned Audit']")).click();
	}

	
	public void click_and_Select_the_Inspection() 
	{
		driver.findElement(By.name("selectAudit[]")).click(); 
	}

	
	public void click_on_Delete() throws InterruptedException 
	{
		driver.findElement(By.id("deleteAudit")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[text()='Yes'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
	}
	
	
}
