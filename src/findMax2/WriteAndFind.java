package findMax2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndFind {
    public List<Integer> writeFile(String getPath){
        List<Integer> result = new ArrayList<Integer>();
        try {
            File file = new File(getPath);
            if(! file.exists()){
                throw new IOException();
            }
            BufferedReader buff = new BufferedReader(new FileReader(file));
            String line = " ";
            while ((line = buff.readLine()) != null){
                result.add(Integer.parseInt(line));
            }
            buff.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        return result;
    }
    public  int findMax2(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) > max){
                max = numbers.get(i);
            }
        }
        return max;
    }
    public void writeMax(String getPath,int max){
        try {
            FileWriter fw = new FileWriter(getPath, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Giá trị lớn nhất = " + max);
            bw.flush();
            bw.close();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
