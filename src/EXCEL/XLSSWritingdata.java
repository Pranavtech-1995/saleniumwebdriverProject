package EXCEL;

import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSSWritingdata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	
	
	    FileOutputStream fl= new FileOutputStream(System.getProperty("user.dir")+"\\ExcelWorksheet\\Book2.xlsx");
	
	
	     XSSFWorkbook wb= new XSSFWorkbook();
	     
	    XSSFSheet  Sheet  = wb.createSheet("Book2");
	     XSSFRow   Row1  =Sheet.createRow(0);
	     Row1.createCell(0).setCellValue("Orderdate");
	     Row1.createCell(1).setCellValue("Region");
	     Row1.createCell(2).setCellValue("Rep");
	     Row1.createCell(3).setCellValue("Item");
	     Row1.createCell(4).setCellValue("unit");
	     Row1.createCell(5).setCellValue("UnitCost");
	     Row1.createCell(6).setCellValue("Total");
	     
	     XSSFRow Row2 =Sheet.createRow(1);
	     
	     Row2.createCell(0).setCellValue("06-Jan-2024");
	     Row2.createCell(1).setCellValue("East");
	     Row2.createCell(2).setCellValue("Jones");
	     Row2.createCell(3).setCellValue("East");
	     Row2.createCell(4).setCellValue("95.0");
	     Row2.createCell(5).setCellValue("1.99");
	     Row2.createCell(6).setCellValue("189.05");
	     
	     
	     wb.write(fl);
	     wb.close();
	     fl.close();
	     
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
