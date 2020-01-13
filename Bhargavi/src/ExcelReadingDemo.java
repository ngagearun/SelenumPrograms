import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelReadingDemo {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fi=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\arun.xlsx");
		Workbook wb=WorkbookFactory.create(fi);
		Sheet S=wb.getSheet("ReadingData");
		int row_count=S.getLastRowNum();
		int cols_count=S.getRow(1).getLastCellNum();
		Row row;
		for(int i=0;i<row_count;i++){
			row =S.getRow(i);
			for(int j=0;j<cols_count;j++){
				String values =row.getCell(j).getStringCellValue();
				System.out.println(values);
			}
		}

		wb.close();
		fi.close();
	}

}
