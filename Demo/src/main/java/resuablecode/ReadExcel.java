package resuablecode;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel {
    public static String getData(String s, int a, int b) throws IOException{
        FileInputStream fis= new FileInputStream(new File("src/main/resources/testdata/testdata.xlsx"));
        XSSFWorkbook w = new XSSFWorkbook(fis);
        XSSFSheet sheet= w.getSheet(s);
      // String r= sheet.getRow(a).getCell(b).getStringCellValue();
       // return r;
        XSSFRow exRow= sheet.getRow(a);
        XSSFCell exCell=exRow.getCell(b);
        DataFormatter dataFormatter = new DataFormatter();
        String dataEx = dataFormatter.formatCellValue(exCell);
        return dataEx;
    }
}
