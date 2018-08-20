package com.wesley.excel;

import java.io.File;
import java.io.IOException;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class ExcelWriteByJXL {
	/**
	 * jxl创建Excel文件
	 * @param args
	 * @throws IOException 
	 */
  public static void main(String[] args) {
	  
	  String [] title= {"id","Name","sex"};

	  File file=new File("d:/googledownload/excel/jxl_text.xls");
	  try {
		file.createNewFile();
		WritableWorkbook workbook=Workbook.createWorkbook(file);
		
		WritableSheet sheet = workbook.createSheet("wesley", 0);
		
		Label label=null;
		
		for (int i = 0; i < title.length; i++) {
			label=new Label(i, 0, title[i]);
			sheet.addCell(label);
		}
		
		for (int i = 1; i <= 10; i++) {
			label=new Label(0, i, "a"+i);
			sheet.addCell(label);
			label=new Label(1, i, "user"+i);
			sheet.addCell(label);
			label=new Label(2, i, "女");
			sheet.addCell(label);
		}
		workbook.write();
		workbook.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
  }
}
