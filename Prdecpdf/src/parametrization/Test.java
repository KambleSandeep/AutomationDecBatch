package parametrization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.vel.config.Configurations;

public class Test {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		Test t1 = new Test();

		String name = t1.readExcelSheet(1, 1);
		t1.readExcelSheet(2, 1);
		t1.readExcelSheet(3, 1);
		t1.readExcelSheet(4, 1);

	}

	public String readExcelSheet(int row, int col) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream(Configurations.excelsheetPath);

		Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");

		String data= sh.getRow(row).getCell(col).getStringCellValue();
		System.out.println(data);
		return data;

	}
}
