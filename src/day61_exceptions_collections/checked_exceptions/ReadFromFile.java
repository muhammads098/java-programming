package day61_exceptions_collections.checked_exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        String filePath="src/day61_exceptions_collections/checked_exceptions/data.txt";
        System.out.println(Files.readAllLines(Paths.get(filePath)));
    }
}
