import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelWritigDemo {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub

		
		FileInputStream fi=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\arun.xlsx");
		Workbook wb=WorkbookFactory.create(fi);
		
		Sheet S=wb.createSheet("Sheet2");
		S.createRow(20).createCell(1).setCellValue("HelloWorld");
		FileOutputStream fo=new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\arun.xlsx");
		wb.write(fo);
		wb.close();
		fo.close();fi.close();
		
	}

}
