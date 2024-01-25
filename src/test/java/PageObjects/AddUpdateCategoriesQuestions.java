package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddUpdateCategoriesQuestions 
{

	public WebDriver driver;
	public AddUpdateCategoriesQuestions(WebDriver driver1)
	{
		driver=driver1;
		PageFactory.initElements(driver1, this);
	}



	public void click_on_Add_Update_Categories_Questions() throws InterruptedException 
	{
		driver.findElement(By.xpath("//span[text()='App & User Configuration']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Asset Categories']")).click();
	}


	public void click_and_Select_Asset_for_Category_Question() throws InterruptedException 
	{
		driver.findElement(By.xpath("//div[text()='All Assets']")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[text()='Aldar Development']")).click();
	}



	public void click_and_Add_Parent_Category_for_Category_Question(String string) throws InterruptedException 
	{
		driver.findElement(By.xpath("//button[@class='btn dropdown-toggle btn-light bs-placeholder']")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[text()='Add new']")).click();

		Thread.sleep(1000);

		driver.findElement(By.id("new_category_group")).sendKeys(string);
	}


	public void click_and_Add_Category_for_Category_Question(String string) throws InterruptedException 
	{


		driver.findElement(By.xpath("(//button[@class='btn dropdown-toggle bs-placeholder btn-light'])[1]")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("(//span[text()='Add new'])[2]")).click();

		Thread.sleep(1000);

		driver.findElement(By.id("new_category")).sendKeys(string);

	}


	public void click_and_Add_Question_for_Category_Question(String string) throws InterruptedException 
	{
		driver.findElement(By.xpath("(//button[@class='btn dropdown-toggle bs-placeholder btn-light'])[1]")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("(//span[text()='Add new'])[3]")).click();

		Thread.sleep(1000);

		driver.findElement(By.id("new_question")).sendKeys(string);

	}


	public void click_and_Add_Options_for_Category_Question(String string) throws InterruptedException
	{
		driver.findElement(By.xpath("(//button[@class='btn dropdown-toggle bs-placeholder btn-light'])[1]")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("(//span[text()='Add new'])[4]")).click();

		Thread.sleep(1000);

		driver.findElement(By.id("new_option")).sendKeys(string);
	}


	public void click_on_Add_button() throws InterruptedException 
	{
		driver.findElement(By.id("add_new")).click();
		

		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[text()='OK']")).click();
	}







}
