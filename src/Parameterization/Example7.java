package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Example7 
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\study\\Apowersoft\\Practice\\ParameterizationDemo.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet=book.getSheet("Sheet5");
		
		CellType s=sheet.getRow(5).getCell(4).getCellType();
		
		if(s==CellType.STRING)
		{
			System.out.println(sheet.getRow(5).getCell(4).getCellType());
		}
		else if(s==CellType.BOOLEAN)
		{
			System.out.println(sheet.getRow(5).getCell(4).getCellType());
		}
		else
		{
			System.out.println(sheet.getRow(5).getCell(4).getCellType());
		}
	}

}
