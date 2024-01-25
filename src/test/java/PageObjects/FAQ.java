package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FAQ 
{

	public WebDriver driver;
	public FAQ (WebDriver driver1)
	{
		driver=driver1;
		PageFactory.initElements(driver1, this);
	}
	
	
	public void click_on_FAQ() 
	{
		driver.findElement(By.xpath("//span[text()='FAQ']")).click();
	}

	
	public void click_and_Select_Role() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[@class='btn dropdown-toggle btn-light bs-placeholder']")).click();
		
        Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='CX Central Team']")).click();
	}

	
	public void enter_the_Question(String string) 
	{
		driver.findElement(By.id("question")).sendKeys(string);
	}

	
	public void enter_Answer(String string) 
	{
		driver.findElement(By.id("answer")).sendKeys(string);
	}

	
	public void click_on_Add() throws InterruptedException 
	{
		driver.findElement(By.id("addFAQ")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
	}


	
}
