package Stream_IO_NIO.FileTree;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Example2 {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("C:\\IT (GeekBrains)\\JavaCourse\\Lessons\\Streams_IO_NIO_files\\directoryTest1");
        Path destination = Paths.get("C:\\IT (GeekBrains)\\JavaCourse\\Lessons\\Streams_IO_NIO_files\\directoryTest3");
        System.out.println(1);
        if (!Files.exists(destination)){
            Files.createDirectory(destination);
        }
        Files.walkFileTree(source, new MyFileVisitor2(source, destination));
    }

}

class MyFileVisitor2 extends SimpleFileVisitor<Path> {
    Path source;
    Path destination;

    public MyFileVisitor2(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize(dir));
        Files.copy(dir, newDestination, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize(file));
        Files.copy(file, newDestination, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }
}