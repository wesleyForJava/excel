package com.wesley.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelWriteByPOI {
	public static void main(String[] args) {
		
		String [] title= {"id","姓名","年龄"};
		
		HSSFWorkbook workbook=new HSSFWorkbook();
		
		HSSFSheet sheet = workbook.createSheet();
		HSSFRow row = sheet.createRow(0);
		for (int i = 0; i < title.length; i++) {
		    HSSFCell cell = row.createCell(i);
		    cell.setCellValue(title[i]);
		}
		
		for (int i = 1; i < 10; i++) {
			HSSFRow row1 = sheet.createRow(i);
			
			HSSFCell cell1 = row1.createCell(0);
			cell1.setCellValue("id"+1);
			
			HSSFCell cell2 = row1.createCell(1);
			cell2.setCellValue("周"+i);
			
			HSSFCell cell3 = row1.createCell(2);
			cell3.setCellValue("1"+i);
		}
		try {
			FileOutputStream stream=FileUtils.openOutputStream(new File("d:/googledownload/excel/poi_text.xls"));
			workbook.write(stream);
			workbook.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
