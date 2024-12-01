package PageClass;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GenericUtil.BrowserChoice;
import GenericUtil.GenericMethod;
import io.cucumber.java.en.Given;


public class webSite extends GenericMethod {

	//Actions action = new Actions(driver1);
	private JavascriptExecutor idriver;
	JavascriptExecutor js = (JavascriptExecutor) idriver;
	static WebDriver driver1;
	  static File files;
	   static FileInputStream fls;
	   static XSSFWorkbook wb;
	   static XSSFSheet sheet;
	   static WebDriver driver;
	   static String url;
	   static BrowserChoice bc;
	   static GenericUtil.ExcellUnit ec;
	   java.util.List<WebElement> links ;
	  
	   
	   String path ="C:\\Users\\musku keerthana\\OneDrive\\Documents\\Selenium.xlsx";
       String PassWord = "//child::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::div[2]//input[@name='password']";
       String Submit ="//button[@type='submit']";
       String board ="//h6";
	   String UserName ="//div[@class='oxd-form-row']//child::div[@class='oxd-input-group oxd-input-field-bottom-space']//following-sibling::div[2]//input[@name='username']";
	   String  dashbordLeave ="//span[text()='Leave']";
	   String dashboard = "//span[text()='Dashboard']";
	   //String Apply = "//a[text()='Apply']/../..//a";
	   //String Leavel = "//a[text()='Leave List']";
	   String AssignLeave ="//button[@title='Assign Leave']";
	   String LeaveList ="//button[@title='Leave List']";
	   String timeSheet = "//button[@title='Timesheets']";
	   String Time = "//span[text()='Time']";
       String applyLeave = "//button[@title='Apply Leave']";
       String myLeave = "//button[@title='My Leave']";
       String myTimeSheet = "//button[@title='My Timesheet']";
       String Adminclick = "//span[text()='Admin']";
       String AdminText = "//h6[text()='Admin']";
       String UserManagement = "//span[text()='User Management ']";
	   String user = "//a[contains(text(),'User')]";
	   String userText = "//h6[text()='User Management']";
	   String Add ="//button[text()=' Add ']";
       String userrollSelect = "(//div[text()='-- Select --'])[1]";
       String userrollSelect1 = "(//div[text()='-- Select --'])[2]";

       String selectAdmin = "(//span[text()='Admin'])[2]";
       String EmployeeName = "//input[@placeholder=\"Type for hints...\"]";
       String Status = "(//div[text()='-- Select --'])[2]";
       String SelectStatus = "//span[text()='Enabled']";
       String userName = "(//input[@autocomplete='off'])[1]";
       String Password = "(//input[@type='password'])[1]";
       String conformPassword = "(//input[@type='password'])[2]";
       String Save = "//button[text()=' Save ']";
       String ListBox = "(//div[@role='listbox'])[1]";
       String qualification ="//span[text()='Qualifications ']";
       String skills="//a[text()='Skills']";
       String deleteRecord = "(//input[@type='checkbox'])[i]";
       String names = "(//div//div[@role='cell'][2])[i]";
       String deletebutton = "//button[text()=' Delete Selected ']";
	   String deleteAlert = "//button[text()=' Yes, Delete ']";
	   String nnumber = "(//div[@role='row']//div[2])[i]";
	   //int n= (int) nnumber;
	   
			//String str = sheet.getRow(0).getCell(0).toString();
			//str.click();
	 // @BeforeTest
		public void openBrowser() throws IOException
		{ 
		   BrowserChoice bc = new BrowserChoice();
		   driver1= bc.brwChoice(driver1);
		   
		}
			
		//@BeforeClass
		public void callingDataFromExcel(){
			url = sheet.getRow(0).getCell(0).toString();
			driver1.get(url);
			String cred[] = new String[2]; 
			
			cred[0]=sheet.getRow(1).getCell(0).toString();
			cred[1]=sheet.getRow(2).getCell(0).toString();
			
			WebElement Username =driver1.findElement(By.xpath(UserName));
			sendWebElement(Username , driver1, cred[0]);
		
		    WebElement Password = driver1.findElement(By.xpath(PassWord));
		    sendWebElement(Password ,driver1, cred[1]);

		    
		    WebElement button = driver1.findElement(By.xpath(Submit));
		    button.click();
		    
		    WebElement dashbord = driver1.findElement(By.xpath(board));
		    String text = dashbord.getText();
		    
		    if(text .equals("Dashboard"))
		    {
		    	System.out.println("The page was successfully loaded");
		    }
		    else
		    {
		    	System.out.println("The page was not successfully loaded");
		    }
		} 
		
//		//@BeforeMethod
//    	public void dashboardLeave()
//		{ 
//			WebElement DashBoard = driver1.findElement(By.xpath(dashbordLeave));
//			ClickWebElement(DashBoard,driver1);
//			
//			
//		    links = driver1.findElements(By.xpath(Apply));
//			
//		}
		
		

		//"//a[text()='Apply']/../..//a"
		
//		public void  assignLeaveText()
//		{
//			int count=0;
//			
//			WebElement e = null;
//			for(WebElement ele : links)
//			{
//				count++;
//				if(count ==1)
//				{
//					e = ele;
//				}
//			}
//			
//			ClickWebElement(e,driver1);
//			System.out.println(driver1.getCurrentUrl());
//		}
//		@Test 
//		public void leaveList()
//		{
//			WebElement LeaveList = driver1.findElement(By.xpath(Leavel));
//			ClickWebElement(LeaveList , driver1);
//			//System.out.println(driver1.getCurrentUrl()); 
//			
//			
//		}
//		@Test 
//		public void timeSheet()
//		{
//			WebElement Timesheets = driver1.findElement(By.xpath(Time));
//			ClickWebElement(Timesheets , driver1);
//			System.out.println(driver1.getCurrentUrl());
//		}
		
		public void dashBoard() {
			WebElement dashBoard = driver1.findElement(By.xpath(dashboard));
			ClickWebElement(dashBoard , driver1);
		}
		public void assignLeaveQuick() {
			WebElement assignLeave= driver1.findElement(By.xpath(AssignLeave));
			ClickWebElement( assignLeave , driver1);
		}
		//@Test
		public void leaveListQuick() {
			WebElement leaveList = driver1.findElement(By.xpath(LeaveList));
			ClickWebElement(leaveList , driver1);
		}
		//@Test
		public void timeSheetsQuick() {
			WebElement timeSheets = driver1.findElement(By.xpath(timeSheet));
			ClickWebElement(timeSheets , driver1);
		}
		//@Test
		public void applyLeave() {
			WebElement ApplyLeave = driver1.findElement(By.xpath(applyLeave));
			ClickWebElement(ApplyLeave , driver1);
			System.out.println(driver1.getCurrentUrl());
		}
		//@Test
		public void myLeave() {
			WebElement myleave = driver1.findElement(By.xpath(myLeave));
			ClickWebElement(myleave , driver1);
			System.out.println(driver1.getCurrentUrl());
		}
		//@Test
		public void myTimesheet() {
			WebElement myTimesheet = driver1.findElement(By.xpath(myTimeSheet));
			ClickWebElement(myTimesheet , driver1);
			System.out.println(driver1.getCurrentUrl());
		}
		public void admin()
		{
			WebElement Admin = driver1.findElement(By.xpath(Adminclick));
			ClickWebElement(Admin , driver1);
			System.out.println(driver1.getCurrentUrl());
			WebElement adminText = driver1.findElement(By.xpath(AdminText));
			System.out.println(adminText.getText());
		}
		public void userManagement()

		{
			WebElement Management = driver1.findElement(By.xpath(UserManagement));
			ClickWebElement(Management,driver1);
//			WebElement User = driver1.findElement(By.xpath(user));
//			WebElement UserText = driver.findElement(By.xpath(userText));
		//	System.out.println(UserText.getText());
			
		}
		public void AddData() throws InterruptedException

		{
			Actions action = new Actions(driver1);

			WebElement AddData = driver1.findElement(By.xpath(Add));
			ClickWebElement(AddData , driver1);
			WebElement userRoll = driver1.findElement(By.xpath(userrollSelect));
			userRoll.click();
			WebElement SelectAdmin = driver1.findElement(By.xpath(selectAdmin));
			SelectAdmin.click();
			WebElement employeeName = driver1.findElement(By.xpath(EmployeeName));
			employeeName.click();
			employeeName.sendKeys("Ra");
			Thread.sleep(100);
			employeeName.sendKeys(Keys.BACK_SPACE);
			//employeeName.sendKeys("i");
			WebElement listBox = driver1.findElement(By.xpath(ListBox));
			listBox.click();
			Thread.sleep(200);
			WebElement status = driver1.findElement(By.xpath(userrollSelect1));
			//status.click();
			action.doubleClick(status).build().perform();
			Thread.sleep(200);
            
			//status.click();
            WebElement selectStatus = driver1.findElement(By.xpath(SelectStatus));
			ClickWebElement(selectStatus , driver1);
			WebElement Username = driver1.findElement(By.xpath(userName));
			Username.click();
			Username.sendKeys("Ramesita");
			WebElement password = driver1.findElement(By.xpath(Password));
			password.click();
			password.sendKeys("Because1");
			WebElement ConformPassword = driver1.findElement(By.xpath(conformPassword));
			ConformPassword.click();
			ConformPassword.sendKeys("Because1");
			WebElement save = driver1.findElement(By.xpath(Save));
			ClickWebElement(save,driver1);
	}
		
		
		public void delete() {
			
			ArrayList<String> listofQulification = new ArrayList<>();
			WebElement Admin = driver1.findElement(By.xpath(Adminclick));
			ClickWebElement(Admin , driver1);
			System.out.print("Admin");
			WebElement Qualification = driver1.findElement(By.xpath(qualification));
			ClickWebElement(Qualification,driver1);
			Actions act = new Actions(driver1);
			WebElement Skills = driver1.findElement(By.xpath(skills));
			act.moveToElement(Skills).build().perform();
		    
            Skills.click();
            
            //ArrayList<WebElement> listItems = new ArrayList<>(driver.findElements(By.xpath("//div//div[@role='cell'][2]")));
//            List<WebElement> list_element = driver.findElements(By.xpath("//div//div[@role='cell'][2]"));
//            //int totalcms = listItems.size();
//            //System.out.println(totalcms);
//            for(int i=1;i<=list_element.size();i++)
//			{
//            	System.out.println(list_element.get(i).getAttribute("placeholder"));
//            	//listofQulification.add(driver.findElement(By.xpath("//div//div[@role='cell'][2]"+"["+i+"]")).getText());
//            	//listofQulification.add((driver.findElements(By.xpath("//div//div[@role='cell'][2]"+"["+i+"]"))).getText());
//				//WebElement RecordDelete = driver1.findElement(By.xpath(deleteRecord));
//				//System.out.println(listofQulification);
//			}
//			WebElement RecordDelete = driver1.findElement(By.xpath(deleteRecord));
//			ClickWebElement(RecordDelete,driver1);
//			System.out.print("Select the item");
//            WebElement Deletebutton = driver1.findElement(By.xpath(deletebutton));
//			Deletebutton.click();
//			WebElement Deletealert = driver1.findElement(By.xpath(deleteAlert));
//			Deletealert.click();
		}



		
		
    	//@AfterMethod 
		public void cleanUpData()
		{
			System.out.println("clean up activity");
		}
		
		//@AfterClass
		public void logOut()
		{
		System.out.println("log out");
      }
		//@AfterTest
    	public void quitWebsite()
		{
			driver1.quit();
		}
//		@AfterSuite
//		public void asuite() throws IOException 
//		{
//			wb.close();
//			
//		}

		   
		  // @BeforeSuite
		public void dataFromExcel() throws IOException {
			// TODO Auto-generated method stub
			 GenericUtil.ExcellUnit ec = new GenericUtil.ExcellUnit();
			 sheet = ec.returnAllSheetData(path,"sheet1");
		}


		
  	
}
