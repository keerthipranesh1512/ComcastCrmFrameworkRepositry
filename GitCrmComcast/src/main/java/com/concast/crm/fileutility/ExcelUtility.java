package com.concast.crm.fileutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author pranesh
 * contains excel utility methods
 */
public class ExcelUtility {
	/**
	 * reading from excel using sheetname,row,cell arguments
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws Exception
	 */
public String readDataFromExcel(String sheetname,int row,int cell) throws Exception
{
	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Orgname.xlsx");
Workbook book=WorkbookFactory.create(fis);
Sheet sheet=book.getSheet(sheetname);
Row rw=sheet.getRow(row);
String data=rw.getCell(cell).toString();
book.close();
return data;
}
/**
 * reading from excel using sheetname argument
 * @param sheetname
 * @return
 * @throws Exception
 */
public int getRowCount (String sheetname) throws Exception
{
	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Orgname.xlsx");
Workbook book=WorkbookFactory.create(fis);
int rowcount=book.getSheet(sheetname).getLastRowNum();
return rowcount;
}
/**
 * reading from excel using sheetname,row,cell,data arguments
 * @param sheetname
 * @param row
 * @param cell
 * @param data
 * @throws Exception
 */
public void writeDatainExcel(String sheetname,int row,int cell,String data) throws Exception
{
	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Orgname.xlsx");
Workbook book=WorkbookFactory.create(fis); 
Sheet sheet=book.getSheet(sheetname);
sheet.getRow(row).createCell(cell);
FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\Orgname.xlsx");
book.write(fos);
book.close();
}
}
