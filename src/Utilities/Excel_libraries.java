package Utilities;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_libraries {
	public static String FetchStringData(String SheetName,int rownum,int cellnum) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		File f=new File(Constants.FILEPATH);
		FileInputStream fis= new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fis);
		String data=wb.getSheet(SheetName).getRow(rownum).getCell(cellnum).getStringCellValue();
		return data;
		
	}
	public static double FetchNumericData(String SheetName,int rownum,int cellnum) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		File f=new File(Constants.FILEPATH);
		FileInputStream fis= new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fis);
		double data=wb.getSheet(SheetName).getRow(rownum).getCell(cellnum).getNumericCellValue();
		return data;
		
	}
}
/*
 * steps to setup actitime project
 * 
 * 1.open google type actitimedownload
 * 2.click on the first link click on try free
 * 
 */
