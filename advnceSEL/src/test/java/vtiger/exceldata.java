package vtiger;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exceldata {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		get the java representation object of the physical file
		FileInputStream fis = new FileInputStream("D:\\JAVA\\advnceSEL\\src\\test\\java\\resource\\testScrptData (1).xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("Bahubalis");
		
	      Row row = sh.getRow(5);
			@SuppressWarnings("unused")
			Cell cell = row.getCell(0);
		
		String v1 = sh.getRow(1).getCell(0).getStringCellValue();
		String v2 = sh.getRow(2).getCell(0).getStringCellValue();
	    String v3 = sh.getRow(3).getCell(0).getStringCellValue();
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		int lastRow = sh.getLastRowNum();
		System.out.println(lastRow);
		
		for (int i = 1; i <= lastRow; i++) {
			String v= sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(v);
		}
		
		
	
		wb.close();
	}
}


