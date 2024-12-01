package GenericUtil;

import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserChoice {
	static WebDriver driver;
	
	public WebDriver brwChoice(WebDriver driver) throws IOException
	{
		
		Scanner sc = new Scanner(System.in);
//	    System.out.println("Enter Desier Browser");
//	    String browser = "ff";
	    
	    GenericMethod ge = new GenericMethod();
	    String browser =ge.readData(System.getProperty("user.dir")+"\\src\\main\\resources\\config.porperties","browser");
	    
	    
		if(browser.equals("ff"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		else if(browser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
			
			
			
			
			
			return driver;
	}
}
