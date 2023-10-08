package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Example6 
{

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\study\\Apowersoft\\Practice\\ParameterizationDemo.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet=book.getSheet("Sheet5");
		
		System.out.println(sheet.getRow(3).getCell(4).getCellType());
		
		CellType type=sheet.getRow(0).getCell(1).getCellType();
		System.out.println(type);
		
		System.out.println(sheet.getRow(4).getCell(6).getCellType());

	}

}
