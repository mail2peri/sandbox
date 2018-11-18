package com.qualityarc.training.sandbox;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		File excelFile = new File("C:\\Users\\Local User\\Documents\\QualityArc\\Training\\Data\\TestData.xlsx");
		XSSFWorkbook workboook = new XSSFWorkbook(excelFile);
		XSSFSheet sheet = workboook.getSheetAt(0);
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell =row.getCell(1);
		System.out.println(cell.toString());
		//System.out.println("The string cell value is " + cell.getStringCellValue());
		
		
		
		
		
		
		

	}

}
