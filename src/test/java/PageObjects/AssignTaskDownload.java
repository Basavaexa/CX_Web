package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AssignTaskDownload 
{

	
	public WebDriver driver;
	public AssignTaskDownload(WebDriver driver1)
	{
		driver=driver1;
		PageFactory.initElements(driver1, this);
	}
	
	
	
	public void click_on_Download_Assign_Report() 
	{
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click(); 
	}

	
	
	
	
}
