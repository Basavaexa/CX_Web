//Provis

package StepDefinations;

import org.apache.log4j.Logger;
//import java.util.Properties;
import org.openqa.selenium.WebDriver;

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



public class BaseClass
{
	public WebDriver driver;
	
	
	
	
	
	public Login ln;
	public AssignTaskForAldarDevelopment AD;
	public AssignTaskForAldarEducation AE;
	public AssignTaskForCommercialBuilding CB;
	public AssignTaskForHospitality HP;
	public AssignTaskDownload DW;
	public ReassignTaskToAuditor RA;
	public FAQ FQ;
	public AddUpdateCategoriesQuestions CQ;
	public TicketList TL;
	public PlannedAuditDelete PD;
    public PlannedAuditCategories PC;
	
	public static Logger logger;

}
