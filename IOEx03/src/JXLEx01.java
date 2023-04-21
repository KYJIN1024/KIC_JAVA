import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class JXLEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Workbook workbook = null;
		
		try {
			workbook = Workbook.getWorkbook(new FileInputStream("./jxlrwtest.xls"));
			
			System.out.println( workbook.getVersion()); //2.6.12
			System.out.println( "위크시트 갯수:"+ workbook.getNumberOfSheets());  // 위크시트 갯수:2
			
			String[] sheetNames = workbook.getSheetNames();
			System.out.println(Arrays.toString(sheetNames)); //[original, modified]
			
			Sheet sheet = workbook.getSheet(0); // original
			
			System.out.println( sheet.getName() ); 
			
			System.out.println( sheet.getRows());  //175
			System.out.println( sheet.getColumns()); //256
			
			//
			Cell cell = sheet.getCell( 0, 2 );
			System.out.println( cell.getContents()); //Java Excel API Modify Test
			
			
			
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			if(workbook != null)
				workbook.close();;
		}
	}

}
