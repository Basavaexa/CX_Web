package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AssignTaskForHospitality 
{

	public WebDriver driver;
	public AssignTaskForHospitality(WebDriver driver1)
	{
		driver=driver1;
		PageFactory.initElements(driver1, this);
	}
	
	
	
	public void click_and_Select_Auditors_HP() throws InterruptedException 
	{
		driver.findElement(By.xpath("(//div[text()='Select'])[1]/../../..")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[text()=' Aarav Kumar']")).click(); 
	}

	
	public void click_and_Select_Assets_HP() throws InterruptedException 
	{
		driver.findElement(By.xpath("(//div[text()='Select'])[1]/../../..")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[text()='Hospitality']")).click();
	}

	
	public void click_and_Select_Parent_Category_HP() throws InterruptedException 
	{
		driver.findElement(By.xpath("(//div[text()='Select'])[1]/../../..")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[text()='Restaurants (F&B)']")).click();
	}

	
	
	
	public void click_and_Select_HotelRestaurants_Hotels_HP()  throws InterruptedException 
	{
		driver.findElement(By.xpath("(//div[text()='Select'])[1]/../../..")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[text()='Al Badiya']")).click();
	}

	
	public void click_and_Select_Start_Date_HP() throws InterruptedException
	{
		driver.findElement(By.id("from_date")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//td[text()='25']")).click();
	}

	
	public void click_and_Select_End_Date_HP() throws InterruptedException 
	{
		driver.findElement(By.id("to_date")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//td[text()='28']")).click();
	}

	
	public void click_on_Assign_HP() throws InterruptedException 
	{
		driver.findElement(By.id("assigntask")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[text()='OK']")).click();
	}

	
	
}
