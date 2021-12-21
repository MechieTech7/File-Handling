package fileWritingOperations;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsingPath {
    public static void main(String[] args) throws IOException {
        String location = "Path.txt";
        String content = "This method gives output as of our input// raw type";

        Path path = Paths.get(location);
        Files.write(path,content.getBytes(StandardCharsets.UTF_8));

    }
}
