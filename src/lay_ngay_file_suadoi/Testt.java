package lay_ngay_file_suadoi;

import java.io.File;
import java.util.Date;

public class Testt {
    public static void main(String[] args) {
        File file = new File("test.txt");
        Long lastModified = file.lastModified();
        Date date = new Date(lastModified);
        System.out.println(date);
    }
}
