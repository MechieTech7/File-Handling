package fileReadingOperations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//many methods but this was widely and commonly used.
public class usingBufferedReader {
    public static void main(String[] args) throws IOException {
        String location = "Buffer.txt";

        FileReader fileReader = new FileReader(location);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String currentLine ;
        while ( (currentLine = bufferedReader.readLine())!=null){
            System.out.println(currentLine);
        }


    }
}
