package findMax2;

import java.io.File;
import java.io.FileWriter;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WriteAndFind work = new WriteAndFind();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Đường dẫn file: ");
        String file = scanner.nextLine();
        File file1 = new File(file);
        List<Integer> numbers = work.writeFile(file1.getPath());
        int maxValue = work.findMax2(numbers);
        work.writeMax(file1.getPath(),maxValue);
    }
}
