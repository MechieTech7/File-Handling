package fileWritingOperations;

import java.io.FileWriter;
import java.io.IOException;
//1.Location(where file is present) 2.Content(wt to be thr)
//Directly interacting with files
//less performance
public class UsingFileWriter  {
    public static void main(String[] args) throws IOException {
        String location = "Example.txt";
        String content = "I learnt how to write a file";
        FileWriter fileWriter = new FileWriter(location);
        fileWriter.write(content);
        fileWriter.close();
    }
}
