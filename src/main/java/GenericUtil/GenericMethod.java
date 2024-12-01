package GenericUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class GenericMethod {

	

	 @Test
	 public String readData(String path,String property) throws IOException
    {
		File file = new File(System.getProperty("user.dir")+"/src/main/resources/config.properties");
		//System.out.println(System.getProperty("user.dir"));
		
		
		FileInputStream fis = new FileInputStream(file);
		Properties config = new Properties();
		config.load(fis);
		
   	System.out.println(config.getProperty("browser"));
   	return config.getProperty(property);
    }
	
	
		public void ClickWebElement(WebElement ele , WebDriver driver )
		{
			boolean bool = ele.isDisplayed();
			bool&= ele.isEnabled();
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); 
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			
			if(bool)
			{
				try {
					ele.click();
					}
					catch(ElementClickInterceptedException e)
					{
						e.printStackTrace();
					}
			}
			else {
				System.out.println("The element is not displayed/enabled");
			}
		}
		
		public void sendWebElement(WebElement ele , WebDriver driver , String data )
		{
			boolean bool = ele.isDisplayed();
			bool&= ele.isEnabled();
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); 
			wait.until(ExpectedConditions.visibilityOf(ele));
			
			if(bool)
			{ 
				try {
				ele.clear();	
				ele.sendKeys(data);
				}
				catch(ElementClickInterceptedException e)
				{
					e.printStackTrace();
				}
			}
			else {
				System.out.println("The element is no displayed/enabled");
			}
		}
	}


