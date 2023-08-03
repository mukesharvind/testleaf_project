package week3.codemarathon.testcase1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readexceldata() throws IOException {
	
		XSSFWorkbook wb = new XSSFWorkbook("./data/Question.xlsx");
		XSSFSheet sheetnum = wb.getSheetAt(0);
		int lastRowNum = sheetnum.getLastRowNum();
		System.out.println(lastRowNum);

short lastCellNum = sheetnum.getRow(0).getLastCellNum();
System.out.println(lastCellNum);

String [] [] celldata = new String [lastRowNum] [lastCellNum];
		
for (int i = 1; i <= lastRowNum; i++) {
	XSSFRow row = sheetnum.getRow(i);
	
	for (int j = 0; j < lastCellNum; j++) {
		String stringCellValue = row.getCell(j).getStringCellValue();
		System.out.println(stringCellValue);
		celldata[i-1][j]= stringCellValue;
	}
}
return celldata;
	}

}
