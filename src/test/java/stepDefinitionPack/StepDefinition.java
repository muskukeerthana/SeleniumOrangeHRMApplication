package stepDefinitionPack;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageClass.webSite;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends webSite {
	webSite site = new webSite();
    
	
	static WebDriver driver;
	@Given("Open the Desired browser choice")
	public void open_the_desired_browser_choice() throws IOException {
		site.dataFromExcel();
		site.openBrowser();
		site.callingDataFromExcel();
		System.out.println("The desired browser choice ");
	}

	@Given("Dashboard Page")
	public void dashboard_page() {
	   site.dashBoard();
	   System.out.println("The dashboard lunch");
	}
	@Given("open the Quick Launch")
	public void open_the_quick_launch() throws InterruptedException {
	    site.assignLeaveQuick();
	    Thread.sleep(30);
	    site.dashBoard();
	    site.leaveListQuick();
	    site.dashBoard();
	    site.timeSheetsQuick();
	    site.dashBoard();
	    site.myLeave();
	    site.dashBoard();
        site.dashBoard();
        site.myTimesheet();
        
	  }
	@Then("closing the website")
	public void closing_the_website() {
	    site.cleanUpData();
	    site.logOut();
	    site. quitWebsite();
	    }
	
	
	@Given("Admin page full Functionality")
	public void admin_page_full_functionality() throws InterruptedException {
	     site.admin();
		 Thread.sleep(30);
         site.userManagement();
	     site.AddData();
	     //site.deleteTheRecord();
	}
	@Given("Delete All The Record")
	public void delete_all_the_record() {
		site.delete();
	}
	
}
