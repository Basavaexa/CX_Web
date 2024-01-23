package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ReassignTaskToAuditor 

{

	public WebDriver driver;
	public ReassignTaskToAuditor(WebDriver driver1)
	{
		driver=driver1;
		PageFactory.initElements(driver1, this);
	}


	public void click_and_Select_the_Auditor_for_Reassign() throws InterruptedException 
	{
		driver.findElement(By.xpath("(//button[@class='btn dropdown-toggle btn-light bs-placeholder'])[1]")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[text()='Aafaq Ahmad ']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//button[text()='Yes'])[2]")).click();
	}




}
