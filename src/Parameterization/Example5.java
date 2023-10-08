package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Example5 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\study\\Apowersoft\\Practice\\ParameterizationDemo.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		//XSSFSheet sheet=book.getSheet("Sheet4");
		
		int rowSize=book.getSheet("Sheet4").getLastRowNum()+1;
		int cellSize=book.getSheet("Sheet4").getRow(0).getLastCellNum();
		
		for(int i=0;i<rowSize;i++)
		{
			for(int j=0;j<=cellSize-1;j++)
			{
				String str=book.getSheet("Sheet4").getRow(i).getCell(j).getStringCellValue();
				System.out.print(str+"   ");
			}
			System.out.println();
		}
	}

	
}


