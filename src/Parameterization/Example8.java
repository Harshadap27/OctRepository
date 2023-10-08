package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Example8 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\study\\Apowersoft\\Practice\\ParameterizationDemo.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet=book.getSheet("Sheet6");
		
		int rowsize=sheet.getLastRowNum()+1;
		int cellsize=sheet.getRow(0).getLastCellNum();
		
		for(int i=0;i<rowsize;i++)
		{
			for(int j=0;j<cellsize;j++)
			{
				CellType type=sheet.getRow(i).getCell(j).getCellType();
				
				if(type==CellType.STRING)
				{
					System.out.print(sheet.getRow(i).getCell(j).getStringCellValue()+"  ");
				}
				else if(type==CellType.BOOLEAN)
				{
					System.out.print(sheet.getRow(i).getCell(j).getBooleanCellValue()+"  ");
				}
				else
				{
					System.out.print(sheet.getRow(i).getCell(j).getNumericCellValue()+"  ");
				}
				
			}
			System.out.println();
		}
	}

}
