package Stream_IO_NIO;

import java.io.*;

public class InputOutputStreams {


    public static void main(String[] args) {
        try (FileInputStream reader = new FileInputStream("Streams_IO_NIO_files\\img.png");
             FileOutputStream writer = new FileOutputStream("Streams_IO_NIO_files\\img1.png");
        ) {
            int i;
            while((i = reader.read())!=-1){
                writer.write(i);
            }
            System.out.println("Done");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
