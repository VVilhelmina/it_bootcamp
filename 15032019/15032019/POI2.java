package novipaket;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class POI2 {

	public static void main(String[] args)throws IOException {
		File src = new File("C:\\Users\\bobic\\Desktop\\data.xls");
		FileInputStream fis = new FileInputStream(src);
		HSSFWorkbook wbe = new HSSFWorkbook(fis);
		HSSFSheet sheet1 = wbe.getSheetAt(0);
		int rowcount = sheet1.getLastRowNum();
		System.out.println("Total row count is " + (rowcount + 1));
		for (int i = 0; i <= rowcount; i++) {
			HSSFRow r = sheet1.getRow(i);
			if (r != null) {
				int cellNum=r.getLastCellNum();
				for(int j=0;j<cellNum;j++) {
					HSSFCell celija1=r.getCell(j);
					String data0 = celija1.getStringCellValue();
					System.out.print(data0+" ");
				}
				System.out.println("");
				
			} else {
				System.out.println("<Empty row>");
			}
		}
		wbe.close();


	}

}
