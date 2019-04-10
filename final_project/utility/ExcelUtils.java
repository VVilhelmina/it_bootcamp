package utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;

public class ExcelUtils {

	// References to private fields for storing Excel objects
	private static HSSFSheet ExcelWSheet;
	private static HSSFWorkbook ExcelWBook;
	private static HSSFCell Cell;
	private static HSSFRow Row;
	// Turning data into String
	private static DataFormatter formatter;

	// Method that sets Excel file and worksheet name
	public static void setExcelFile(String Path, String SheetName) throws Exception {
		try {
			// Loading an Excel file from the destination defined through Path
			FileInputStream ExcelFile = new FileInputStream(Path);

			// Excel file opening
			ExcelWBook = new HSSFWorkbook(ExcelFile);

			// Taking the worksheet from the Excel file
			ExcelWSheet = ExcelWBook.getSheet(SheetName);

			// Initializing dataformatter object
			formatter = new DataFormatter();
		} catch (Exception e) {
			throw (e);
		}
	}

	// Taking the data from the Excel table from given row and column number
	public static String getCellData(int RowNum, int ColNum) throws Exception {
		try {
			// Defining the cell with the row number and column number
			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
			// Turning a cell data into a String
			String CellData = formatter.formatCellValue(Cell);
			return CellData;
		} catch (Exception e) {
			return "";
		}
	}

	public static void setCellData(String Result, int RowNum, int ColNum) throws Exception {
		try {
			// Defining the row by the row number
			Row = ExcelWSheet.getRow(RowNum);

			// Defining the cell position
			Cell = Row.getCell(ColNum, MissingCellPolicy.RETURN_BLANK_AS_NULL);

			// If the cell is empty or unexisting
			if (Cell == null) {
				// Creating the cell on the desired location
				Cell = Row.createCell(ColNum);

				// Setting the value of the cell
				Cell.setCellValue(Result);
			} else {
				// Overwriting the existing data with a new data
				Cell.setCellValue(Result);
			}
			// Writing the changes in the Excel file
			FileOutputStream fileOut = new FileOutputStream(Constants.Path_TestData + Constants.File_TestData);
			ExcelWBook.write(fileOut);

			// Clearing the data from the file
			fileOut.flush();

			// Closing the output stream towards the file
			fileOut.close();
		} catch (Exception e) {
			throw (e);
		}
	}

	// Returns worksheet reference
	public static HSSFSheet getWorkSheet() {
		return ExcelWSheet;
	}
}
