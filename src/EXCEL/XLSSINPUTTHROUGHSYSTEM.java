package EXCEL;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSSINPUTTHROUGHSYSTEM {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	
	        FileOutputStream fl = new FileOutputStream(System.getProperty("user.dir")+"\\ExcelWorksheet\\data.xlsx");
	
	
	         XSSFWorkbook wb = new XSSFWorkbook();
	         
	         Scanner S = new Scanner(System.in);
	         System.out.println("Enter sheet name");
	          String Sheet  =S.next();
	          
	           XSSFSheet   Sheet1=wb.createSheet(Sheet);
	            System.out.println("Enter no of row");
	            int rowscount =S.nextInt();
	            System.out.println("Enter no of cell");
	            int columncount =S.nextInt();
	            
	            for (int r=0;r<=rowscount;r++)
	            {
	            	XSSFRow currentrow =Sheet1.createRow(r);
	            	for (int c=0;c<columncount;c++)
	            	{
	            		XSSFCell cell=currentrow.createCell(c);
	            		
	            		cell.setCellValue(S.next());
	            		
	            		}
	            	
	            }
	            
	            
	            System.out.println("file is created");
	            
	          wb.write(fl) ;
	          wb.close();
	          fl.close();
	          S.close();
	}
	        
}


