package com.wesley.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelWriteByPOIHigh {
	public static void main(String[] args) {
		
		String [] title= {"id","姓名","年龄"};
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		Sheet sheet = workbook.createSheet();
		 Row row = sheet.createRow(0);
		for (int i = 0; i < title.length; i++) {
		     Cell cell = row.createCell(i);
		    cell.setCellValue(title[i]);
		}
		
		for (int i = 1; i < 10; i++) {
			 Row row1 = sheet.createRow(i);
			
			 Cell cell1 = row1.createCell(0);
			cell1.setCellValue("id"+1);
			
			 Cell cell2 = row1.createCell(1);
			cell2.setCellValue("周"+i);
			
			 Cell cell3 = row1.createCell(2);
			cell3.setCellValue("1"+i);
		}
		try {
			FileOutputStream stream=FileUtils.openOutputStream(new File("d:/googledownload/excel/poi_text.xlsx"));
			workbook.write(stream);
			workbook.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
