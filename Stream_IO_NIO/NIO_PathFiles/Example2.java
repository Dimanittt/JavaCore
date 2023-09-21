package Stream_IO_NIO.NIO_PathFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Example2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("Test5.txt");
        Path directoryPath = Paths.get("C:\\IT (GeekBrains)\\JavaCourse\\Lessons\\Streams_IO_NIO_files\\directoryTest1");
        Path directoryPath1 = Paths.get("C:\\IT (GeekBrains)\\JavaCourse\\Lessons\\Streams_IO_NIO_files\\directoryTest2");
//        Files.copy(filePath, directoryPath.resolve(filePath));
        Files.copy(filePath, directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);
        Files.copy(filePath, directoryPath.resolve("Test6.txt"), StandardCopyOption.REPLACE_EXISTING);
        Files.copy(directoryPath1, directoryPath.resolve(directoryPath1.getFileName()));
        System.out.println("Done!");
        //Files.move the same as Files.copy except Ctrl+C turns into Ctrl+X
        Files.move(Paths.get("Test5.txt"), Paths.get("Test6.txt")); //renaming

    }
}
