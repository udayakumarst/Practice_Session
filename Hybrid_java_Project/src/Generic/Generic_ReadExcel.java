package Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_ReadExcel 
{
	public static String getData(String sheet, int row, int column) throws IOException
	{
		String val="";
		FileInputStream fis=new FileInputStream("./excel/hybrid.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		Cell c= wb.getSheet(sheet).getRow(row).getCell(column);
		return val = c.getStringCellValue();		
	}
}
