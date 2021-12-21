package fileWritingOperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


// instead of throwing exception tried with try catch
// performance speed improves
// better than FileWriter
public class UsingBufferedWriter {
    public static void main(String[] args) {

            String location = "Buffer.txt";
            String content = "I learnt bufferedwriter too";
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(location);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        try {
            bufferedWriter.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
