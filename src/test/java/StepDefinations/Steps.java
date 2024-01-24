package StepDefinations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import PageObjects.AssignTaskDownload;
import PageObjects.AssignTaskForAldarDevelopment;
import PageObjects.AssignTaskForAldarEducation;
import PageObjects.AssignTaskForCommercialBuilding;
import PageObjects.AssignTaskForHospitality;
import PageObjects.FAQ;
import PageObjects.Login;
import PageObjects.ReassignTaskToAuditor;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
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

		logger.info("************* Launching browser**************");	
	}

	
	
	
	

	//	@After
	//	public void reset() throws Exception {
	//		try {
	//			driver.close();
	//
	//		} catch (Exception e) {
	//			
	//		}
	//		
	//		
	//		
	//	}

	@Given("User launches the browser")
	public void user_launches_the_browser() {

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);


		ln=new Login(driver);
		
		AD= new AssignTaskForAldarDevelopment(driver);
		AE=new AssignTaskForAldarEducation(driver);
        CB=new AssignTaskForCommercialBuilding(driver);
        HP=new AssignTaskForHospitality(driver);
        DW=new AssignTaskDownload(driver);
        RA=new ReassignTaskToAuditor(driver);
        FQ=new FAQ(driver);
        
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
	}

/////////////////////////////////////// Assign Task For Aldar Development///////////////////////////////////
	
	
	
	@Then("Click on App_User_Configuration")
	public void click_on_App_User_Configuration() 
	{
	    AD.click_on_App_User_Configuration();
	}

	@Then("Click on Assign Task")
	public void click_on_Assign_Task() 
	{
	    AD.click_on_Assign_Task();
	}

	@Then("Click and Select Auditors")
	public void click_and_Select_Auditors() throws InterruptedException 
	{
	    AD.click_and_Select_Auditors();
	}

	@Then("Click and Select Assets")
	public void click_and_Select_Assets() throws InterruptedException 
	{
	   AD.click_and_Select_Assets();
	}

	@Then("Click and Select Journey")
	public void click_and_Select_Journey() throws InterruptedException 
	{
	    AD.click_and_Select_Journey();
	}

	@Then("Click and Select Start Date")
	public void click_and_Select_Start_Date() throws InterruptedException 
	{
	    AD.click_and_Select_Start_Date();
	}

	@Then("Click and Select End Date")
	public void click_and_Select_End_Date() throws InterruptedException 
	{
	    AD.click_and_Select_End_Date();
	}

	@Then("Click on Assign")
	public void click_on_Assign() throws InterruptedException 
	{
	   AD.click_on_Assign();
	}


	
	
	
	////////////////////////////// Assign Task for Aldar Education /////////////////////////
	
	
	@Then("Click and Select Auditors AE")
	public void click_and_Select_Auditors_AE() throws InterruptedException 
	{
	    AE.click_and_Select_Auditors_AE();
	}

	@Then("Click and Select Assets AE")
	public void click_and_Select_Assets_AE() throws InterruptedException
	{
	    AE.click_and_Select_Assets_AE();
	}

	@Then("Click and Select Location")
	public void click_and_Select_Location() throws InterruptedException 
	{
	  AE.click_and_Select_Location();  
	}

	@Then("Click and Select Start Date AE")
	public void click_and_Select_Start_Date_AE() throws InterruptedException
	{
	    AE.click_and_Select_Start_Date_AE();
	}

	@Then("Click and Select End Date AE")
	public void click_and_Select_End_Date_AE() throws InterruptedException 
	{
	    AE.click_and_Select_End_Date_AE();
	}

	@Then("Click on Assign AE")
	public void click_on_Assign_AE() throws InterruptedException 
	{
	    AE.click_on_Assign_AE();
	}

/////////////////////////	Assign Task for Commercial Building ////////////////////////////////
	
	
	@Then("Click and Select Auditors CB")
	public void click_and_Select_Auditors_CB() throws InterruptedException 
	{
	    CB.click_and_Select_Auditors_CB();
	}

	@Then("Click and Select Assets CB")
	public void click_and_Select_Assets_CB() throws InterruptedException 
	{
	   CB.click_and_Select_Assets_CB();
	}

	@Then("Click and Select Commercial Building")
	public void click_and_Select_Commercial_Building() throws InterruptedException 
	{
	    CB.click_and_Select_Commercial_Building();
	}

	@Then("Click and Select Start Date CB")
	public void click_and_Select_Start_Date_CB() throws InterruptedException 
	{
	    CB.click_and_Select_Start_Date_CB();
	}

	@Then("Click and Select End Date CB")
	public void click_and_Select_End_Date_CB() throws InterruptedException 
	{
	    CB.click_and_Select_End_Date_CB();
	}

	@Then("Click on Assign CB")
	public void click_on_Assign_CB() throws InterruptedException 
	{
	    CB.click_on_Assign_CB();
	}

	
	
	////////////////////////// Assign Task for Hospitality ///////////////////////////////////
	
	
	@Then("Click and Select Auditors HP")
	public void click_and_Select_Auditors_HP() throws InterruptedException 
	{
	   HP.click_and_Select_Auditors_HP();
	}

	@Then("Click and Select Assets HP")
	public void click_and_Select_Assets_HP() throws InterruptedException 
	{
	    HP.click_and_Select_Assets_HP();
	}

	@Then("Click and Select Parent Category HP")
	public void click_and_Select_Parent_Category_HP() throws InterruptedException 
	{
	    HP.click_and_Select_Parent_Category_HP();
	}

	@Then("Click and Select HotelRestaurants Hotels HP")
	public void click_and_Select_HotelRestaurants_Hotels_HP() throws InterruptedException
	{
	    HP.click_and_Select_HotelRestaurants_Hotels_HP();
	}

	@Then("Click and Select Start Date HP")
	public void click_and_Select_Start_Date_HP() throws InterruptedException 
	{
	    HP.click_and_Select_Start_Date_HP();
	}

	@Then("Click and Select End Date HP")
	public void click_and_Select_End_Date_HP() throws InterruptedException 
	{
	    HP.click_and_Select_End_Date_HP();
	}

	@Then("Click on Assign HP")
	public void click_on_Assign_HP() throws InterruptedException 
	{
	    HP.click_on_Assign_HP();
	}

	
	
	
	//////////////////////////  Assign Task Download /////////////////////////////////
	
	
	@Then("Click on Download Assign Report")
	public void click_on_Download_Assign_Report() 
	{
	   DW.click_on_Download_Assign_Report();
	}

	
	
	///////////////////// ReAssign Task ////////////////////////////////////
	
	@Then("Click and Select the Auditor for Reassign")
	public void click_and_Select_the_Auditor_for_Reassign() throws InterruptedException 
	{
	   RA.click_and_Select_the_Auditor_for_Reassign();
	}


	
//////////////////////////////////// FAQ ////////////////////////////////////
	
	@Then("Click on FAQ")
	public void click_on_FAQ() 
	{
		FQ.click_on_FAQ();
	  
	}

	@Then("Click and Select Role")
	public void click_and_Select_Role() throws InterruptedException 
	{
	    FQ.click_and_Select_Role();
	}

	@Then("Enter the Question {string}")
	public void enter_the_Question(String string) 
	{
	    FQ.enter_the_Question(string);
	}

	@Then("Enter Answer{string}")
	public void enter_Answer(String string)
    {
	   FQ.enter_Answer(string);
	}

	@Then("Click on Add")
	public void click_on_Add() throws InterruptedException 
	{
	   FQ.click_on_Add(); 
	}

	
	
	
	
	
	
	
	
}
