/*
package poi_Api;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;


public class Data {
    public static void main(String[] args) throws IOException {
        ArrayList<String> lists=new ArrayList<String> ();
        getDataFromExcelSheet ( "Login" );

    }
    public static void getDataFromExcelSheet(String TestName) throws IOException {
        FileInputStream fis = new FileInputStream;

        int sheetcount = workbook.getNumberOfSheets ();
        for (int i = 0; i < sheetcount; i++) {
            if (workbook.getSheetName ( i ).equalsIgnoreCase ( "sheetA" )) ;

            XSSFSheet sheet = workbook.getSheetAt ( i );
            Iterator<Row> rows = sheet.iterator ();
            Row firstrow = rows.next ();
            Iterator<Cell> firstrowCells = firstrow.iterator ();
            int c = 0;
            int TestColumnPosition = 0;
            while (firstrowCells.hasNext ()) {
                Cell firstrowCell = firstrowCells.next ();
                if (firstrowCell.getStringCellValue ().equalsIgnoreCase ( "Tests" )) {
                    TestColumnPosition = c;
                }
                c++;
            }
            while (rows.hasNext ()) {
                Row row = rows.next ();
                Cell cell = row.getCell ( TestColumnPosition );
                if (cell.getStringCellValue ().equalsIgnoreCase ( "Register" )) {
                    Iterator<Cell> cells = row.iterator ();
                    cells.next ();
                    while (cells.hasNext ()) {
                        Cell currentCell = cells.next ();
                        if (currentCell.getCellType () == CellType.STRING) {
                            System.out.println ( currentCell.getStringCellValue () );

                        } else if (currentCell.getCellType () == CellType.NUMERIC) {
                            System.out.println ( currentCell.getNumericCellValue () );
                        }

                    }
                }
            }


        }
    }
}
*/

