package genericUtilityOrLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SampleproP {

	public static void main(String[] args)throws Exception {
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\Sindhu\\Desktop\\Selenium work space\\chromedriver-win64\\chromedriver.exe");
	FileInputStream fis=new FileInputStream(IconstantUtility.excelPath);
	
	Workbook book = new WorkbookFactory.create(fis);
	Sheet sh = book.getSheet("sheet1");
	sh.createRow(9).createCell(1).setCellValue("angry bird");
	FileOutputStream fos = FileOutputStream(IconstntUtility.excelPath);
	book.write(fos);
	}

}

