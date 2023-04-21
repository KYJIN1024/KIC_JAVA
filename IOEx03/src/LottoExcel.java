import java.io.*;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class LottoExcel {

    public static void main(String[] args) {
        String inputFilePath = "./lotto(1~1060).xls";
        String outputFilePath = "result.txt";

        try {
            Workbook workBook = Workbook.getWorkbook(new FileInputStream(inputFilePath));
            Sheet sheet = workBook.getSheet(0);

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath))) {
                for (int i = 4; i < sheet.getColumns(); i++) {
                    Cell cell1 = sheet.getCell(1, i - 1);
                    Cell cell2 = sheet.getCell(2, i - 1);
                    Cell cell3 = sheet.getCell(13, i - 1);
                    Cell cell4 = sheet.getCell(14, i - 1);
                    Cell cell5 = sheet.getCell(15, i - 1);
                    Cell cell6 = sheet.getCell(16, i - 1);
                    Cell cell7 = sheet.getCell(17, i - 1);
                    Cell cell8 = sheet.getCell(18, i - 1);
                    Cell cell9 = sheet.getCell(19, i - 1);

                    System.out.print(cell1.getContents());
                    System.out.print(cell2.getContents());
                    System.out.print(cell3.getContents());
                    System.out.print(cell4.getContents());
                    System.out.print(cell5.getContents());
                    System.out.print(cell6.getContents());
                    System.out.print(cell7.getContents());
                    System.out.print(cell8.getContents());
                    System.out.println(cell9.getContents());

                    bw.write(cell1.getContents());
                    bw.write(cell2.getContents());
                    bw.write(cell3.getContents());
                    bw.write(cell4.getContents());
                    bw.write(cell5.getContents());
                    bw.write(cell6.getContents());
                    bw.write(cell7.getContents());
                    bw.write(cell8.getContents());
                    bw.write(cell9.getContents());
                }
            }
        } catch (BiffException | FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
