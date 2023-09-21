package Stream_IO_NIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        String text = "I would like to become Java master!";
        String text1 = "\nAnd get a job application to Aston :)\n";
        FileWriter writer = null;
        try {
            writer = new FileWriter("C:\\IT (GeekBrains)\\JavaCourse\\Lessons\\Streams_IO_NIO_files\\Test1.txt", true);
            for (int i = 0; i < text.length(); i++) {
                writer.write(text.charAt(i));
            }
            writer.write(text1);
            System.out.println("Done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            writer.close();
        }
    }
}
