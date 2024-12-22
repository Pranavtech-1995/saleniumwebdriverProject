package EXCEL;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSSReadingdata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	
	      FileInputStream File = new FileInputStream(System.getProperty("user.dir")+"\\ExcelWorksheet\\Book1.xlsx");
	
	      XSSFWorkbook wb= new XSSFWorkbook(File);
	      
	      XSSFSheet Sheet= wb.getSheet("Sheet1");
	 
	        int  noofrows  =Sheet.getLastRowNum();
	        int   noofcolumn=Sheet.getRow(0).getLastCellNum();
	        //int  noofrows1  =Sheet.getPhysicalNumberOfRows();
	       // int   noofcolumn1=Sheet.getRow(0).getPhysicalNumberOfCells();
	        
	        System.out.println(noofrows);
	        System.out.println(noofcolumn);
	        
	        
	        
	        for (int r=0;r<=noofrows;r++)
	        {
	               XSSFRow rows=Sheet.getRow(r);
	        	
	        	for (int c=0;c<noofcolumn;c++)
	        	{
	        		
	        		XSSFCell s=rows.getCell(c);
	        	    String st=s.toString();
	        		System.out.print(st+"\t");
	        	}
	        	
	        	System.out.println();
	        	
	        }
	        
	      
	      wb.close();
	      File.close();
	      
	
	
	
	
	
	
	}

}
