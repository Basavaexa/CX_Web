package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.When;



	public class Assign_Asset_For_Hospitality {
		
		public WebDriver driver;
		public Assign_Asset_For_Hospitality(WebDriver driver1)
		{
			driver=driver1;
			PageFactory.initElements(driver1, this);
		}
		
		public void click_on_App_and_configuration() {
			driver.findElement(By.xpath("//span[text()='App & User Configuration']")).click();

		}

		public void click_on_Assign_Asset() {
			driver.findElement(By.xpath("//span[text()='Assign Asset']")).click();

		}

		public void click_and_Select_SLA_user() throws InterruptedException {
			
			driver.findElement(By.xpath("(//div[text()='Select'])[1]")).click();
			Thread.sleep(1000);
			//driver.findElement(By.id("champions_list")).click();
			driver.findElement(By.xpath("//*[@id=\"searchForm\"]/div[1]/div[1]/div/div/div/div[2]/ul/li[52]/a")).click();
			//driver.findElement(By.xpath("//*[@id=\"searchForm\"]/div[1]/div[1]/div/div/div/div[2]/ul/li[1]/a/span")).click();
			

		}

		public void click_and_Select_asset() {
			driver.findElement(By.xpath("(//div[text()='Select'])[1]")).click();

			
			driver.findElement(By.xpath("//span[text()=' Hospitality ']")).click();

		   
		}

		public void click_and_Select_parent_category() throws InterruptedException {
			Thread.sleep(1000);

			driver.findElement(By.xpath("(//div[text()='Select'])[1]")).click();
			
			driver.findElement(By.xpath("//span[text()='Beach Clubs']")).click();
			Thread.sleep(1000);
			//driver.findElement(By.id("categoryGroup")).click();


		}

		public void click_and_Select_hotels() throws InterruptedException {
			driver.findElement(By.xpath("(//div[text()='Select'])[1]")).click();

		 // driver.findElement(By.id("id_community")).click();
			driver.findElement(By.xpath("//span[text()='Kai Beach']")).click();
			Thread.sleep(1000);
			//driver.findElement(By.xpath("//*[@id=\"content\"]/div[5]/div/div[1]/h3/div")).click();
			
			 // driver.findElement(By.id("id_community")).click();


		  
		}

		public void click_and_Select_level() throws InterruptedException {
		  driver.findElement(By.xpath("(//div[text()='Select'])[1]")).click();
		  Thread.sleep(1000);
		  
		  
		 driver.findElement(By.xpath("//span[text()=' 1']")).click();
		

		}

		public void click_and_Select_category() throws InterruptedException {
			Thread.sleep(1000);
			
			  driver.findElement(By.xpath("(//div[text()='Select'])[1]")).click();
				Thread.sleep(1000);

		   driver.findElement(By.xpath("//span[text()='Call Answering']")).click();
		}

		public void click_and_Select_category_user() {
			driver.findElement(By.xpath("(//div[text()='Select'])[1]")).click();

			   driver.findElement(By.xpath("//span[text()='Akram Al Ameer (aameer@mailinator12.com) ']")).click();
		  
		}

		public void click_and_Select_Add_cc() {
			driver.findElement(By.xpath("(//div[text()='Select'])[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"searchForm\"]/div[3]/div[1]/div/div/div/div/div[3]/ul/li[7]/a")).click();

			 //  driver.findElement(By.xpath("//*[@id=\"searchForm\"]/div[3]/div[1]/div/div/div/div/div[3]/ul/li[2]/a/span[21]")).click();
			   
			  // driver.findElement(By.xpath("//*[@id=\"content\"]/div[5]/div/div[1]/h3/div")).click();
		}

		public void click_and_Select_Add_bcc() {
			driver.findElement(By.xpath("(//div[text()='Select'])[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"searchForm\"]/div[3]/div[2]/div/div/div/div/div[3]/ul/li[4]/a")).click();
			  // driver.findElement(By.xpath("//*[@id=\"content\"]/div[5]/div/div[1]/h3/div")).click();

		}

		public void click_on_assign() {
		  driver.findElement(By.id("assigntask")).click();
		}



	}


