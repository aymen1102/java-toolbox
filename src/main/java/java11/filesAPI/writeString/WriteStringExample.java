package java11.filesAPI.writeString;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteStringExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/main/resources/sample.txt");
        String fileContent = Files.readString(path);

        String newFileContent = fileContent.replace("Line","Lines");
        Path newFilePath = Paths.get("src/main/resources/new-sample.txt");

        Files.writeString(newFilePath,newFileContent);
    }

}
