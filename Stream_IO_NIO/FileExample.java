package Stream_IO_NIO;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileExample {
    public static void main(String[] args) throws IOException, InterruptedException {
        File file = new File("Streams_IO_NIO_files\\Test2.txt");
        File file1 = new File("Streams_IO_NIO_files\\Test20.txt");
        File folder = new File("C:\\IT (GeekBrains)\\JavaCourse\\Lessons\\Streams_IO_NIO_files");
        File folder1 = new File("C:\\IT (GeekBrains)\\JavaCourse\\Lessons\\Streams_IO_NIO_filess");

        System.out.println("\nfile.getAbsolutePath() - " + file.getAbsolutePath());
        System.out.println("folder.getAbsolutePath() - " + folder.getAbsolutePath() + "\n");

        System.out.println("file.isAbsolute() - " + file.isAbsolute());
        System.out.println("folder.isAbsolute() - " + folder.isAbsolute() + "\n");

        System.out.println("file.isDirectory() - " + file.isDirectory());
        System.out.println("folder.isDirectory() - " + folder.isDirectory() + "\n");

        System.out.println("file.exists() - " + file.exists());
        System.out.println("folder.exists() - " + folder.exists());
        System.out.println("file1.exists() - " + file1.exists());
        System.out.println("folder1.exists() - " + folder1.exists() + "\n");

        System.out.println("file.createNewFile() - " + file.createNewFile());
        System.out.println("file1.createNewFile() - " + file1.createNewFile() + " - but the next step is delete!");
        System.out.println("folder1.mkdir() - " + folder1.mkdir() + " - but the next step is delete!\n");

        System.out.println("file.length() - " + file.length() + " bytes");
        System.out.println("folder.length(), but this is not true, you should count size of all files in the folder - " + folder.length() + "\n");

        Thread.sleep(3000);

        System.out.println("file1.delete() - " + file1.delete());
        System.out.println("folder1.delete() - " + folder1.delete() + " - you can delete folder only when it is empty!");

        File[] files = folder.listFiles();
        System.out.println(Arrays.toString(files) + "\n");

        System.out.println("file.isHidden() - " + file.isHidden());
        System.out.println("file.isHidden() - " + file.canRead());
        System.out.println("file.isHidden() - " + file.canWrite());
        System.out.println("file.isHidden() - " + file.canExecute());
    }
}
