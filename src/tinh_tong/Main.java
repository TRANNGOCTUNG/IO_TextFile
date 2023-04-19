package tinh_tong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường dẫn: ");
        String path = scanner.nextLine();
        ReadFileExample example = new ReadFileExample();
        example.readFileText(path);
    }
}
