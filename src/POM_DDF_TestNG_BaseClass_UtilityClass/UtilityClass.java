package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class UtilityClass 
{
	public static String fetchData(int rowindex, int colindex) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\study\\Apowersoft\\Practice\\parameterizationDemo.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet=book.getSheet("Frame");
		String data=sheet.getRow(rowindex).getCell(colindex).getStringCellValue();
		return data;
	}

	public void screenShot(String filename, WebDriver driver) throws IOException
	{
		TakesScreenshot sc=(TakesScreenshot)driver;
		File src=sc.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\study\\Apowersoft\\Practice"+filename+".jpg");
	    FileHandler.copy(src, dest);
		
	}

}
