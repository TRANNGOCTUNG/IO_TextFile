package doc_file_CSV;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVReaderExample {
    private static  final  String COMMA_DELIMITER = ",";

    public static void main(String[] args) {
        BufferedReader bw = null;
        try {
            String line;
            bw = new BufferedReader(new FileReader("src/doc_file_CSV/CSV"));
            while ((line = bw.readLine()) != null) {
                printCountry(parseCSVLine(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    public static List<String> parseCSVLine(String csvLine) {
        List<String> result = new ArrayList<String>();
        if( csvLine!= null) {
            String[] splitData = csvLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
return result;
    }
    public static  void printCountry(List<String> country){
        System.out.println("Country [ id = " + country.get(0) + ", code = " + country.get(1) + ", name = " + country.get(2) + "]");
    }
}
