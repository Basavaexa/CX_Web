package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.When;


public class Assign_Asset_For_AldarDevelopment {

	public WebDriver driver;
	public Assign_Asset_For_AldarDevelopment(WebDriver driver1)
	{
		driver=driver1;
		PageFactory.initElements(driver1, this);
	}







	public void click_and_Select_asset_AD() {
		driver.findElement(By.xpath("(//div[text()='Select'])[1]")).click();
		driver.findElement(By.xpath("//span[text()=' Aldar Development ']")).click();



	}

	public void click_and_Select_journey() throws InterruptedException {
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//div[text()='Select'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='Customer Care (Aldar Square) & Call Center'])[2]")).click(); 
	}

	public void click_and_Select_level_AD() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[text()='Select'])[2]")).click();
		driver.findElement(By.xpath("//span[text()=' 1']")).click();
	}

	public void click_and_Select_category_AD() throws InterruptedException {
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//div[text()='Select'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[text()='Call']")).click();
	}

	public void click_and_Select_category_user_AD() throws InterruptedException {
		driver.findElement(By.xpath("(//div[text()='Select'])[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[text()='Aarooj Mallick (a.mallick@mailinator2.com) ']")).click();
	}
	
	public void click_and_Select_Add_cc_AD() {
		driver.findElement(By.xpath("(//div[text()='Select'])[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"searchForm\"]/div[3]/div[1]/div/div/div/div/div[3]/ul/li[7]/a")).click();
	}

	public void click_and_Select_Add_bcc_AD() {
		driver.findElement(By.xpath("(//div[text()='Select'])[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"searchForm\"]/div[3]/div[1]/div/div/div/div/div[3]/ul/li[7]/a")).click();
	}



}
