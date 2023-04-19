package tinh_tong;

import java.io.*;

public class ReadFileExample {
    public void readFileText(String path){
        try{
            File file = new File(path);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line ="";
            int sum = 0;
            while (( line = reader.readLine() ) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            reader.close();
            System.out.println("tổng = " + sum);
        } catch (FileNotFoundException e){

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
