package fileWritingOperations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class UsingFileOutputStream {
    public static void main(String[] args) throws IOException {
        String location = "FileOs.txt";
        String content = "This method gives output as of our input// raw type";

        FileOutputStream outputStream = new FileOutputStream(location);
        byte[] result =content.getBytes(StandardCharsets.UTF_8);
        outputStream.write(result);
        outputStream.close();
    }
}
