package Stream_IO_NIO.NIO_PathFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class Example1 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("Test5.txt");
        Path directoryPath = Paths.get("C:\\IT (GeekBrains)\\JavaCourse\\Lessons\\Streams_IO_NIO_files\\directoryTest1");
        System.out.println("filePath.getFileName() - " + filePath.getFileName());
        System.out.println("filePath.getParent() - " + filePath.getParent());
        System.out.println("filePath.getRoot() - " + filePath.getRoot());
        System.out.println("filePath.isAbsolute() - " + filePath.isAbsolute());
        System.out.println("filePath.toAbsolutePath() - " + filePath.toAbsolutePath());
        System.out.println("filePath.toAbsolutePath().getParent() - " + filePath.toAbsolutePath().getParent());
        System.out.println("filePath.toAbsolutePath().getRoot() - " + filePath.toAbsolutePath().getRoot());
        System.out.println("directoryPath.getFileName() - " + directoryPath.getFileName());
        System.out.println("directoryPath.getParent() - " + directoryPath.getParent());
        System.out.println("directoryPath.getRoot() - " + directoryPath.getRoot());
        System.out.println("directoryPath.isAbsolute() - " + directoryPath.isAbsolute());
        System.out.println("directoryPath.toAbsolutePath() - " + directoryPath.toAbsolutePath());
        System.out.println("directoryPath.resolve(filePath) - " + directoryPath.resolve(filePath) + "\n");
        Path anotherPath = Paths.get("C:\\IT (GeekBrains)\\JavaCourse\\Lessons\\Streams_IO_NIO_files\\directoryTest1\\A\\B\\C\\Test6.txt");
        System.out.println("directoryPath.relativize(anotherPath) - " + directoryPath.relativize(anotherPath) + "\n");
        if (!Files.exists(filePath)){
            Files.createFile(filePath);
            System.out.println("File Test5.txt created via filePath");
        }
        if (!Files.exists(directoryPath)){
            Files.createDirectory(directoryPath);
            System.out.println("Directory directoryTest1 created via directoryPath\n");
        }
        System.out.println("Files.isReadable(filePath) - " + Files.isReadable(filePath));
        System.out.println("Files.isWritable(filePath) - " + Files.isWritable(filePath));
        System.out.println("Files.isExecutable(filePath) - " + Files.isExecutable(filePath) + "\n");
        Path filePath1 = Paths.get("C:\\IT (GeekBrains)\\JavaCourse\\Lessons\\Test5.txt");
        System.out.println("Files.isSameFile(filePath, filePath1) - " + Files.isSameFile(filePath, filePath1));
        System.out.println("Files.size(filePath) - " + Files.size(filePath));
        System.out.println("Files.getAttribute(filePath, \"creationTime\") - " + Files.getAttribute(filePath, "creationTime") + "\n");
        Map<String, Object> attributes = Files.readAttributes(filePath, "*");
        for (Map.Entry<String, Object> entry : attributes.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
