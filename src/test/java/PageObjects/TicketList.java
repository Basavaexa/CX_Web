package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TicketList 
{


	public WebDriver driver;
	public TicketList(WebDriver driver1)
	{
		driver=driver1;
		PageFactory.initElements(driver1, this);
	}



	public void click_on_CX_Inspection() 
	{
		driver.findElement(By.xpath("//span[text()='CX Inspection']")).click();
	}

	public void click_on_Tickets() 
	{
		driver.findElement(By.xpath("//span[text()='Tickets']")).click();
	}


	public void click_on_View_icon_for_any_Open_Tickets() throws InterruptedException 
	{
		driver.findElement(By.xpath("(//span[@class='fa fa-eye'])[1]")).click();
		Thread.sleep(1000);

	}


	public void click_and_Select_the_Status_Inprogress() throws InterruptedException 
	{
		driver.findElement(By.xpath("(//button[@class='btn dropdown-toggle btn-light'])[1]")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[text()='In Progress']")).click();
	}


	public void upload_Photo(String string)
	{
		driver.findElement(By.id("attachment")).sendKeys(string);
	}


	public void enter_Comment(String string) 
	{
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys(string);
		driver.switchTo().defaultContent();
	}


	public void click_on_Submit() throws InterruptedException 
	{
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);

	}


	public void click_on_View_icon_for_any_Inprogress_Tickets() throws InterruptedException
	{
		driver.findElement(By.xpath("(//span[@class='fa fa-eye'])[1]")).click();
		Thread.sleep(1000);
	}


	public void click_and_Select_the_Status_Disputed() throws InterruptedException 
	{
		driver.findElement(By.xpath("(//button[@class='btn dropdown-toggle btn-light'])[1]")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[text()='Disputed Item']")).click();
	}


	public void upload_Photo_DS(String string)
	{
		driver.findElement(By.id("attachment")).sendKeys(string);
	}


	public void enter_Comment_DS(String string)
	{
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys(string);
		driver.switchTo().defaultContent();
	}


	public void click_on_Submit_DS() throws InterruptedException 
	{
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
	}


	public void click_on_View_icon_for_any_Disputed_Tickets() throws InterruptedException 
	{
		driver.findElement(By.xpath("(//span[@class='fa fa-eye'])[1]")).click();
		Thread.sleep(1000);
	}


	public void click_and_Select_the_Status_Completed() throws InterruptedException 
	{
		driver.findElement(By.xpath("(//button[@class='btn dropdown-toggle btn-light'])[1]")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[text()='Completed']")).click();
	}


	public void upload_Photo_CP(String string) 
	{
		driver.findElement(By.id("attachment")).sendKeys(string);
	}


	public void enter_Comment_CP(String string)
	{
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys(string);
		driver.switchTo().defaultContent();
	}


	public void click_on_Submit_CP() 
	{
		driver.findElement(By.name("submit")).click();
	}


	public void click_on_View_icon_for_any_Completed_Tickets() throws InterruptedException
	{
		driver.findElement(By.xpath("(//span[@class='fa fa-eye'])[1]")).click();
		Thread.sleep(1000);
	}


	public void click_on_Transaction_Logs_Plus_icon() 
	{
		driver.findElement(By.xpath("//span[@onclick='toogle()']")).click();
	}



}
