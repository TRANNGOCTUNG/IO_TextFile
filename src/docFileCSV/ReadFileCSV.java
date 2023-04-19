package docFileCSV;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    private static final String FILE_Header = "id,code,name";

    public static void main(String[] args) throws IOException {
        String filename = "src/docFileCSV/OUTCSV";
        writeCSVFile(filename);

    }
    public static void writeCSVFile(String path) throws IOException {
       Country country = new Country(1, "US", "United States");
       Country country1 = new Country(2, "VN", "Viet Nam");
       Country country2 = new Country(3, "AU", "Australia");

        List<Country > list = new ArrayList<>();
        list.add(country);
        list.add(country1);
        list.add(country2);
        FileWriter fw = null;
        try {
            fw = new FileWriter(path);
            fw.append(FILE_Header);
            fw.append(NEW_LINE_SEPARATOR);
            for (Country c: list
                 ) {
                fw.append(String.valueOf(c.getId()));
                fw.append(COMMA_DELIMITER);
                fw.append(c.getCode());
                fw.append(COMMA_DELIMITER);
                fw.append(c.getName());
                fw.append(NEW_LINE_SEPARATOR);
            }
            System.out.println("CSV file was created successfully !!!");
        } catch (Exception e){
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
            try {
                fw.flush();
                fw.close();

            } catch (IOException i){
                System.out.println("Error while flushing/closing fileWriter !!!");
                i.printStackTrace();
            }
        }

    }
}
