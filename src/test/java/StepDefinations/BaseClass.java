//Provis

package StepDefinations;

import org.apache.log4j.Logger;
//import java.util.Properties;
import org.openqa.selenium.WebDriver;

import PageObjects.Assign_Asset_For_AldarDevelopment;
import PageObjects.Assign_Asset_For_Hospitality;
import PageObjects.Login;



public class BaseClass
{
	public WebDriver driver;
	
	
	
	
	
	public Login ln;
	public Assign_Asset_For_Hospitality ah;
	public Assign_Asset_For_AldarDevelopment ad;
	
	
	
	
	public static Logger logger;

}
