package Stream_IO_NIO.FileTree;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Example3 {
    public static void main(String[] args) throws IOException {
        Path toDelete = Paths.get("C:\\IT (GeekBrains)\\JavaCourse\\Lessons\\Streams_IO_NIO_files\\directoryTest3");
        Files.walkFileTree(toDelete, new MyFileVisitor3());
    }
}

class MyFileVisitor3 extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("Delete file: " + file);
        Files.delete(file);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Delete directory: " + dir);
        Files.delete(dir);
        return FileVisitResult.CONTINUE;
    }
}