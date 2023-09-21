package Stream_IO_NIO.NIO_PathFiles;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Example3 {


    public static void main(String[] args) throws IOException {
        Path file = Paths.get("Test7.txt");
        String text = "I don't even know wthat to write:(\nBut I have to because I need to know\nHow to work with methodFile.readAllLines";
//        Files.createFile(file);
//        Files.write(file, text.getBytes(StandardCharsets.UTF_8));
        List<String> fileAsListOfStrings = Files.readAllLines(file);
//        for (String s : fileAsListOfStrings) {
//            System.out.println(s);
//        }
        fileAsListOfStrings.stream().limit(2).forEach(System.out::println);
    }
}
