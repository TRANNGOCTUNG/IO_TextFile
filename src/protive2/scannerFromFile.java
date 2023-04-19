package protive2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class scannerFromFile {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String firstname = scanner.next();
                String mi = scanner.next();
                String lastname = scanner.next();
                double core = scanner.nextDouble();
                System.out.println(firstname + " " + mi + " " + lastname + " " + core);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException();
        }
    }
}
