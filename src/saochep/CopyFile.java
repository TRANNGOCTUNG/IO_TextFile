package saochep;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try{
            inputStream = new FileInputStream("src/saochep/input");
            outputStream = new FileOutputStream("src/saochep/out");
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer))!= -1){
                outputStream.write(buffer,0,length );
            }
            System.out.println("SuccessFull:");
        } catch (IOException e){
            e.printStackTrace();

        }finally {
            if (inputStream != null)
                inputStream.close();
            if (outputStream != null)
                outputStream.close();
        }
    }
}
