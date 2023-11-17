package java11.filesAPI.readString;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadStringExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/main/resources/sample.txt");
        String fileContent = Files.readString(path);
        System.out.println(fileContent); // Sample Line 2 Line 3
    }
}
