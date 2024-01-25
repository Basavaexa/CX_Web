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


import PageObjects.Assign_Asset_For_AldarDevelopment;
import PageObjects.Assign_Asset_For_Hospitality;

import PageObjects.AddUpdateCategoriesQuestions;
import PageObjects.AssignTaskDownload;
import PageObjects.AssignTaskForAldarDevelopment;
import PageObjects.AssignTaskForAldarEducation;
import PageObjects.AssignTaskForCommercialBuilding;
import PageObjects.AssignTaskForHospitality;
import PageObjects.FAQ;

import PageObjects.Login;
import PageObjects.PlannedAuditCategories;
import PageObjects.PlannedAuditDelete;
import PageObjects.ReassignTaskToAuditor;
import PageObjects.TicketList;
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


		
		AD= new AssignTaskForAldarDevelopment(driver);
		AE=new AssignTaskForAldarEducation(driver);
        CB=new AssignTaskForCommercialBuilding(driver);
        HP=new AssignTaskForHospitality(driver);
        DW=new AssignTaskDownload(driver);
        RA=new ReassignTaskToAuditor(driver);
        FQ=new FAQ(driver);
        CQ=new AddUpdateCategoriesQuestions (driver);
        TL=new TicketList(driver);
        PD=new PlannedAuditDelete(driver);
        PC=new PlannedAuditCategories(driver);
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

	@When("Click and Select Add cc")
	public void click_and_Select_Add_cc() throws InterruptedException {
	  ah.click_and_Select_Add_cc();
	}

	@When("Click and Select Add bcc")
	public void click_and_Select_Add_bcc() throws InterruptedException {
	 ah.click_and_Select_Add_bcc();
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

	
	
	
///////////////////////////////////// Add/Update Categories & Questions /////////////////////////////////
	
	
	
	@Then("Click on Add Update Categories Questions")
	public void click_on_Add_Update_Categories_Questions() throws InterruptedException 
	{
	    CQ.click_on_Add_Update_Categories_Questions();
	}

	@Then("Click and Select Asset for Category Question")
	public void click_and_Select_Asset_for_Category_Question() throws InterruptedException 
	{
	    CQ.click_and_Select_Asset_for_Category_Question();
	}

	@Then("Click and Add Parent Category for Category Question {string}")
	public void click_and_Add_Parent_Category_for_Category_Question(String string) throws InterruptedException 
	{
	   CQ.click_and_Add_Parent_Category_for_Category_Question(string);
	}

	@Then("Click and Add Category for Category Question {string}")
	public void click_and_Add_Category_for_Category_Question(String string) throws InterruptedException 
	{
	    CQ.click_and_Add_Category_for_Category_Question(string);
	}

	@Then("Click and Add Question for Category Question {string}")
	public void click_and_Add_Question_for_Category_Question(String string) throws InterruptedException 
	{
	   CQ.click_and_Add_Question_for_Category_Question(string); 
	}

	@Then("Click and Add Options for Category Question {string}")
	public void click_and_Add_Options_for_Category_Question(String string) throws InterruptedException 
	{
	    CQ.click_and_Add_Options_for_Category_Question(string);
	}

	@Then("Click on Add button")
	public void click_on_Add_button() throws InterruptedException 
	{
	    CQ.click_on_Add_button();
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


	

////////////////////////////////////TicketList//////////////////////////////////////////////////////
	
	@Then("Click on CX Inspection")
	public void click_on_CX_Inspection() 
	{
	    TL.click_on_CX_Inspection();
	}

	@Then("Click on Tickets")
	public void click_on_Tickets() 
	{
	   TL.click_on_Tickets(); 
	}

	@Then("Click on View icon for any Open Tickets")
	public void click_on_View_icon_for_any_Open_Tickets() throws InterruptedException 
	{
	    TL.click_on_View_icon_for_any_Open_Tickets();
	}

	@Then("Click and Select the Status Inprogress")
	public void click_and_Select_the_Status_Inprogress() throws InterruptedException 
	{
	    TL.click_and_Select_the_Status_Inprogress();
	}

	@Then("Upload Photo {string}")
	public void upload_Photo(String string)
	{
	    TL.upload_Photo(string);
	}

	@Then("Enter Comment {string}")
	public void enter_Comment(String string) 
	{
	    TL.enter_Comment(string);
	}


	@Then("Click on Submit")
	public void click_on_Submit() throws InterruptedException 
	{
	   TL.click_on_Submit(); 
	}

	@Then("Click on View icon for any Inprogress Tickets")
	public void click_on_View_icon_for_any_Inprogress_Tickets() throws InterruptedException 
	{
	   TL.click_on_View_icon_for_any_Inprogress_Tickets(); 
	}

	@Then("Click and Select the Status Disputed")
	public void click_and_Select_the_Status_Disputed() throws InterruptedException 
	{
	   TL.click_and_Select_the_Status_Disputed();
	}

	@Then("Upload Photo DS  {string}")
	public void upload_Photo_DS(String string) 
	{
	    TL.upload_Photo_DS(string);
	}

	@Then("Enter Comment DS {string}")
	public void enter_Comment_DS(String string) 
	{
	    TL.enter_Comment_DS(string);
	}


	@Then("Click on Submit DS")
	public void click_on_Submit_DS() throws InterruptedException 
	{
	    TL.click_on_Submit_DS();
	}

	@Then("Click on View icon for any Disputed Tickets")
	public void click_on_View_icon_for_any_Disputed_Tickets() throws InterruptedException 
	{
	    TL.click_on_View_icon_for_any_Disputed_Tickets();
	}

	@Then("Click and Select the Status Completed")
	public void click_and_Select_the_Status_Completed() throws InterruptedException 
	{
	    TL.click_and_Select_the_Status_Completed();
	}

	@Then("Upload Photo CP  {string}")
	public void upload_Photo_CP(String string) 
	{
	    TL.upload_Photo_CP(string);
	}

	@Then("Enter Comment CP  {string}")
	public void enter_Comment_CP(String string) 
	{
	   TL.enter_Comment_CP(string);
	}



	@Then("Click on Submit CP")
	public void click_on_Submit_CP() 
	{
	    TL.click_on_Submit_CP();
	}

	@Then("Click on View icon for any Completed Tickets")
	public void click_on_View_icon_for_any_Completed_Tickets() throws InterruptedException 
	{
	    TL.click_on_View_icon_for_any_Completed_Tickets();
	}

	@Then("Click on Transaction Logs Plus icon")
	public void click_on_Transaction_Logs_Plus_icon() 
	{
	    TL.click_on_Transaction_Logs_Plus_icon();

	}


	
	
	
	/////////////////////////////////////////// Planned Audit Delete /////////////////////////////////////
	
	@Then("Click on Planned Audit")
	public void click_on_Planned_Audit() 
	{
	    PD.click_on_Planned_Audit();
	}

	@Then("Click and Select the Inspection")
	public void click_and_Select_the_Inspection() 
	{
	    PD.click_and_Select_the_Inspection();
	}

	@Then("Click on Delete")
	public void click_on_Delete() throws InterruptedException 
	{
	    PD.click_on_Delete();
	}
	
	
/////////////////////////// Planned Audit Categories //////////////////////////////////
	
	@Then("Click on view")
	public void click_on_view() throws InterruptedException 
	{
	   PC.click_on_view();
	}

	@Then("Select category all the No answer then click Submit")
	public void select_category_all_the_No_answer_then_click_Submit() throws InterruptedException 
	{
	   PC.select_category_all_the_No_answer_then_click_Submit(); 
	}

	@Then("Select Category for observation")
	public void select_Category_for_observation() throws InterruptedException 
	{
	   PC.select_Category_for_observation();
	}

	@Then("Select Point")
	public void select_Point() throws InterruptedException 
	{
	    PC.select_Point();
	}

	@Then("Click on Submit for PC")
	public void click_on_Submit_for_PC() 
	{
	    PC.click_on_Submit_for_PC();
	}
	
	
	
	
}
