package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Example3 {

	public static void main(String[] args) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\study\\Apowersoft\\Practice\\ParameterizationDemo.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		//XSSFSheet sheet=book.getSheet("Sheet3");
		//XSSFRow row=sheet.getRow(0);
		//XSSFCell col=row.getCell(0);
		//System.out.println(col.getBooleanCellValue());
		
		//Method Chaining
		
		boolean value=book.getSheet("Sheet3").getRow(0).getCell(1).getBooleanCellValue();
		//(Always last method return type will be considered)
		System.out.println(value);
		

	}

}
