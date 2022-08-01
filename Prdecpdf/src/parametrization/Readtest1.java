package parametrization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readtest1 {
	
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new 	FileInputStream("C:\\amt\\parameterization\\Testdata.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
		short len = sh.getRow(0).getLastCellNum();
		
		for(int i=0; i<=len-1; i++){
			
		String test1 = sh.getRow(1).getCell(i).getStringCellValue();
			System.out.println(test1);
		
		
}
}}