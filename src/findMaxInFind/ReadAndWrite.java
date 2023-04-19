package findMaxInFind;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public  List<Integer> readFide(String getPath){
        List<Integer> numbers = new ArrayList<Integer>();
        try {
            File file = new File(getPath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = " ";
            while ((line = reader.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("File không tồn tại: " + e.getMessage());
        }
        return numbers;
    }
    public int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) > max){
                max = numbers.get(i);
            }
        }
        return max;
    }
    public void writeFile(String filePath,int max){
        try{
            FileWriter  writer = new FileWriter(filePath,true);
            BufferedWriter buff = new BufferedWriter(writer);
            buff.write("Giá trị lớn nhất trong file: " + max);
            buff.flush();
            buff.close();
        } catch (IOException e){
            System.out.println("Không tìm thấy: ");
        }
    }
}
