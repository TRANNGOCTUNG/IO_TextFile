package creat_file;

import java.io.File;
import java.io.IOException;

public class CreatFile {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            if (file.createNewFile()) {
                System.out.println("Success: ");
            } else {
                System.out.println("False: ");
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
