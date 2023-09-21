package Stream_IO_NIO.FileTree;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Example1 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\IT (GeekBrains)\\JavaCourse\\Lessons");
        Files.walkFileTree(path, new MyFileVisitor1());
    }
}

class MyFileVisitor1 extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        if ((dir.getFileName()).toString().charAt(0) == '.') return FileVisitResult.SKIP_SUBTREE;
        System.out.println("Enter the directory: " + dir);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("File name: " + file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.out.println("Error while attempting to: " + file.getFileName());
        return FileVisitResult.TERMINATE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Exit from: " + dir);
        return FileVisitResult.CONTINUE;
    }
}