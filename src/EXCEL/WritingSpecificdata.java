package EXCEL;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingSpecificdata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	
	    FileOutputStream fl = new FileOutputStream(System.getProperty("user.dir")+"//ExcelWorksheet//Book2.xlsx");
	
	
	     XSSFWorkbook wb= new XSSFWorkbook();
	
	      XSSFSheet  sheet=wb.createSheet("Pran");
	      
	         XSSFRow R5=sheet.createRow(5);
	         XSSFCell C7= R5.createCell(7);
	         C7.setCellValue("WELCOME");
	         
	         //if we use same file then it will delete previous data and print its own
	         
	         
	         
	      wb.write(fl);
	      wb.close();
	      fl.close();
	         
	
	
	
	
	
	
	
	}

}
