package so_sanh_path;

import java.io.File;

public class Compare {
    public static void main(String[] args) {
        File file = new File("test.txt");
        File file1 = new File("test1.txt");
        if(file.compareTo(file1) == 0){
            System.out.println("2 expressions are equal:");
        } else {
            System.out.println("2 expressions unequal:");
        }
    }
}
