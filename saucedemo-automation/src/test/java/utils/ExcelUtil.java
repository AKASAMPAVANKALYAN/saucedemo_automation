package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;

public class ExcelUtil {

    public static String getStringData(String path, String sheetName, int rowNum, int colNum) throws IOException {
        FileInputStream fis = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheet(sheetName);
        String cellValue = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
        workbook.close();
        return cellValue;
    }

    public static int getNumericData(String path, String sheetName, int rowNum, int colNum) throws IOException {
        FileInputStream fis = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheet(sheetName);
        int value = (int) sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
        workbook.close();
        return value;
    }
}
