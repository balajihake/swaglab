package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class parametration {
public static String getExcalSheet(int Row,int cell, String sheetname) throws EncryptedDocumentException, IOException{
	FileInputStream file=new FileInputStream("C:\\Users\\HP\\Documents\\swaglab.xlsx");
	String value=WorkbookFactory.create(file).getSheet(sheetname).getRow(Row).getCell(cell).getStringCellValue();
	return value;
	
}

}
