package Learning;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readingfromexcel {

	public static void main(String[] args) throws IOException
	{
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\Testdata.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int totalrows = sheet.getLastRowNum();
		int totalcols = sheet.getRow(1).getLastCellNum();
		
		System.out.println(totalrows);
		System.out.println(totalcols);
		
		for(int r=0;r<=totalrows;r++)
		{
			XSSFRow currentrow= sheet.getRow(r);
			for(int c=0; c<totalcols;c++)
			{
				XSSFCell cell= currentrow.getCell(c);
				System.out.print(cell.toString()+"\t");
			}
			System.out.println();
		}

		workbook.close();
	}

}
