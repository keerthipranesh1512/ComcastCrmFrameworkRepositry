package Prac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test2 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\pranesh\\Desktop\\Practice\\da.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("poi");
		int rw = sh.getLastRowNum();
		
		for(int i=1;i<=rw;i++)
		{
			Row row=sh.getRow(i);
			String data1=row.getCell(0).toString();
			String data2=row.getCell(1).toString();
			System.out.println(data1 + "\t" + data2);
		}


	}
}
