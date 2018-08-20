package com.wesley.excel;

import java.io.File;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ExcelReadByJXL {
	public static void main(String[] args) {
		try {
		Workbook workbook = Workbook.getWorkbook(new File("d:/googledownload/excel/jxl_text.xls"));
		
		Sheet sheet = workbook.getSheet(0);
		for (int i = 0; i < sheet.getRows(); i++) {
			for (int j = 0; j < sheet.getColumns(); j++) {
				  Cell cell = sheet.getCell(j, i);
				  System.out.print(cell.getContents());
				  System.out.print("  ");
			}
			System.out.println();
		}
		workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
