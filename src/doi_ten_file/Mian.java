package doi_ten_file;

import java.io.File;

public class Mian {
    public static void main(String[] args) {
        File olFile = new File("test.txt");
        File renameFile = new File("test1.txt");
        if(olFile.renameTo(renameFile)){
            System.out.println("rename");
        } else {
            System.out.println("fail");
        }
    }
}
