package findMaxInFind;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ReadAndWrite readAndWrite = new ReadAndWrite();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường dẫn file: ");
        String path = scanner.nextLine();
        File file = new File(path);
        List<Integer> result = readAndWrite.readFide(file.getPath());
        int maxValue = readAndWrite.findMax(result);
        readAndWrite.writeFile(file.getPath(), maxValue);
    }
}
