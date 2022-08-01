package parametrization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readtest {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new 	FileInputStream("C:\\amt\\parameterization\\Testdata.xlsx");
		
		String test = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(test);

		
		

		
		}

}
