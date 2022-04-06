package company.day27;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) {
        int count = 0;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/company/day27/Text.txt"));
            String line;
            String [] words;
            while ((line=bufferedReader.readLine()) != null){
                words = line.split(" ");
                for (String string : words) {
                    if (string.equalsIgnoreCase("hello")) {
                        count++;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.fillInStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(count);
    }

}
