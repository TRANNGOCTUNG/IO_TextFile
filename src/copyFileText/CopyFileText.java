package copyFileText;

import java.io.*;

public class CopyFileText {
    public static void main(String[] args) throws IOException {
//        FileInputStream fis = null;
//        FileOutputStream fos = null;
//        try{
//            fis = new FileInputStream("src/copyFileText/inCVS");
//            fos = new FileOutputStream("src/copyFileText/outCVS");
//            int c;
//            while ((c = fis.read()) != -1){
//                fos.write(c);
//            }
//        } finally {
//            if (fis != null){
//                fis.close();
//            }
//            if (fos != null){
//                fos.close();
//            }
//        }
        FileReader in = null;
        FileWriter out = null;
        try{
            in = new FileReader("src/copyFileText/iniCSV");
            out = new FileWriter("src/copyFileText/outtCSV");
            int c;
            while ((c = in.read()) != -1){
                out.write(c);
            }
        } finally {
            if(in == null){
                in.close();
            }
            if(out == null){
                out.close();
            }
        }
    }
}
