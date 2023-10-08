package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Example4 
{

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\a784748\\OneDrive - Atos\\Desktop\\study\\Apowersoft\\Practice\\ParameterizationDemo.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		
		//To get total no. of rows in a sheet
		
		int rowSize=book.getSheet("Sheet4").getLastRowNum()+1;
		System.out.println("Total no. of rows in a sheet "+rowSize);
		
		//To get total no. of columns in a sheet
		int cellSize=book.getSheet("Sheet4").getRow(0).getLastCellNum();
		System.out.println("Total no. of column in a sheet "+cellSize);

	}

}
