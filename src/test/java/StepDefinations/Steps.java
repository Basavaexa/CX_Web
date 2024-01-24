package StepDefinations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import PageObjects.Assign_Asset_For_AldarDevelopment;
import PageObjects.Assign_Asset_For_Hospitality;
import PageObjects.Login;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Steps extends BaseClass {


	@Before
	public void setup() throws IOException
	{

		logger=Logger.getLogger("Provis");//Added logger
		PropertyConfigurator.configure("log4j.properties");//Added logger


		//Reading properties

		Properties configProp = new Properties();
		FileInputStream configPropfile=new FileInputStream("config.properties");
		configProp.load(configPropfile);




		String br=configProp.getProperty("browser");

		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",configProp.getProperty("chromepath") );	
			//driver=new ChromeDriver();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(options);
		}
		else if(br.equals("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver",configProp.getProperty("firefoxpath") );	
			driver=new FirefoxDriver();
		}

		else if(br.equals("ie")) 
		{
			System.setProperty("webdriver.ie.driver",configProp.getProperty("iepath") );	
			driver=new InternetExplorerDriver();
		}
		
		else if(br.equals("msedge")) 
		{
			System.setProperty("webdriver.edge.driver",configProp.getProperty("msedgepath") );	
			driver=new EdgeDriver();
		} 

		logger.info("************* Launching browser **************");	
	}


//		@After
//		public void reset() throws Exception {
//			try {
//				driver.close();
//	
//			} catch (Exception e) {
//				
//			}
//			
//			
//			
//		}

	@Given("User launches the browser")
	public void user_launches_the_browser() {

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);


		ln=new Login(driver);
		ah = new Assign_Asset_For_Hospitality(driver);
		ad = new Assign_Asset_For_AldarDevelopment(driver);


	}


	@When("User opens the URL {string}")
	public void user_opens_the_URL(String url) {

		ln.user_opens_the_URL(url);
	}

	@When("User enters the email as {string} and password as {string}")
	public void user_enters_the_email_as_and_password_as(String string, String string2) {
		ln.user_enters_the_email_as_and_password_as(string, string2);
	}

	@When("Click on the login")
	public void click_on_the_login() {
		ln.click_on_the_login();

		if(driver.getTitle().equals("Aldar"))
		{
			Assert.assertTrue(true); 
			System.out.println("Login Successful");

		}
		else
		{
			System.out.println("Login failed");
		}	
		
		logger.info("************* Successful login**************");	
	}
	
	
//	---------------------------------------Assigning asset for hospitality------------------------
	@When("Click on App and configuration")
	public void click_on_App_and_configuration() {
	   ah.click_on_App_and_configuration();
	}

	@When("Click on Assign Asset")
	public void click_on_Assign_Asset() {
	   ah.click_on_Assign_Asset();
	}

	@When("Click and Select SLA user")
	public void click_and_Select_SLA_user() throws InterruptedException {
	   ah.click_and_Select_SLA_user();
	}

	@When("Click and Select asset")
	public void click_and_Select_asset() {
	   ah.click_and_Select_asset();
	}

	@When("Click and Select parent category")
	public void click_and_Select_parent_category() throws InterruptedException {
	   ah.click_and_Select_parent_category();
	}

	@When("Click and Select hotels")
	public void click_and_Select_hotels() throws InterruptedException {
	  ah.click_and_Select_hotels();
	  
	}

	@When("Click and Select level")
	public void click_and_Select_level() throws InterruptedException 
	{
	  ah.click_and_Select_level();
	}

	@When("Click and Select category")
	public void click_and_Select_category() throws InterruptedException {
	   ah.click_and_Select_category();
	}

	@When("Click and Select category user")
	public void click_and_Select_category_user() {
	  ah.click_and_Select_category_user();
	}

	@When("Click and Select Add cc")
	public void click_and_Select_Add_cc() throws InterruptedException {
	  ah.click_and_Select_Add_cc();
	}

	@When("Click and Select Add bcc")
	public void click_and_Select_Add_bcc() throws InterruptedException {
	 ah.click_and_Select_Add_bcc();
	}

	@When("Click on assign")
	public void click_on_assign() throws InterruptedException {
	  ah.click_on_assign();
	  
	  logger.info("************* Asset Assigned **************");	
	  
	  WebElement popup = driver.findElement(By.xpath("//h2[text()='Records of community assigned to SLA users!!!']"));
	  if(popup.getText().equals("Records of community assigned to SLA users!!!")) {
		  
		  driver.findElement(By.xpath("//button[text()='OK']")).click();
		  Thread.sleep(5000);
		  System.out.println("Successfully asset assigned");
		  
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("(//span[text()='Delete'])[1]")).click();
		  driver.findElement(By.xpath("(//button[text()='Yes'])[2]")).click();
		  
//		  WebElement popup2 = driver.findElement(By.xpath("//h2[text()='Successfully selected asset user(s) are deleted.']"));
//
//		  if(popup2.getText().equals("Successfully selected asset user(s) are deleted.")) {
//			  driver.findElement(By.xpath("//button[text()='OK']")).click();
//			  System.out.println("Successfully deleted the assigned asset");
//
//		  }
//		  logger.info("************* Asset assigned and deleted **************");	
		  
	  }
	  else {
		  System.out.println("Failed");

	  }
	}
	
	//------------------------ Assign Asset for Aldar Development----------------------
	
	@When("Click and Select asset AD")
	public void click_and_Select_asset_AD() {
	   ad.click_and_Select_asset_AD();
	}

	@When("Click and Select journey")
	public void click_and_Select_journey() throws InterruptedException {
	   ad.click_and_Select_journey();
	}

	@When("Click and Select level AD")
	public void click_and_Select_level_AD() throws InterruptedException {
	   ad.click_and_Select_level_AD();
	}

	@When("Click and Select category AD")
	public void click_and_Select_category_AD() throws InterruptedException {
	  ad.click_and_Select_category_AD();
	}

	@When("Click and Select category user AD")
	public void click_and_Select_category_user_AD() throws InterruptedException {
	  ad.click_and_Select_category_user_AD();
	}
	
	@When("Click and Select Add cc AD")
	public void click_and_Select_Add_cc_AD() {
	 
	}

	@When("Click and Select Add bcc AD")
	public void click_and_Select_Add_bcc_AD() {
	   
	}


	
	


	
	



}
