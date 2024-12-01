package GenericUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcellUnit {

	
	
	
	public XSSFSheet returnAllSheetData(String path, String sheetName) throws IOException {
		
		
		
		File file = new File(path);
	    FileInputStream fls = new FileInputStream(file);
	    XSSFWorkbook wb = new XSSFWorkbook(fls);
	    XSSFSheet sheet = wb.getSheet(sheetName);
	    
	    
	    
	    return sheet;
		
	}
	
	
}
//"C:\\Users\\musku keerthana\\OneDrive\\Documents\\Selenium.xlsx"