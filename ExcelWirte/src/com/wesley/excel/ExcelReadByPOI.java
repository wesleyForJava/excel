package com.wesley.excel;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelReadByPOI {
  public static void main(String[] args) {
	
	  
	  
	  try {
		@SuppressWarnings("resource")
		HSSFWorkbook workbook=new HSSFWorkbook(FileUtils.openInputStream(new File("d:/googledownload/excel/jxl_text.xls")));
		   HSSFSheet sheet = workbook.getSheetAt(0);
		   
		   int firstRowNum=0;
		   int lastRowNum=sheet.getLastRowNum();
		   
		   for (int i = firstRowNum; i < lastRowNum; i++) {
			   HSSFRow row = sheet.getRow(i);
               			   
			   int lastCellNum = row.getLastCellNum();
			   for (int j = 0; j < lastCellNum; j++) {
				   HSSFCell cell = row.getCell(j);
				   String cellValue = cell.getStringCellValue();
				   System.out.print(cellValue+"  ");
			}
           System.out.println();			   
		}
		   
		   
		   
		   
	  
	  } catch (Exception e) {
		e.printStackTrace();
	}
	  
 }
}
