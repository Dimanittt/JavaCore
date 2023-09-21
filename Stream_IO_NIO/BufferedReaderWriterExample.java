package Stream_IO_NIO;

import java.io.*;

public class BufferedReaderWriterExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(
                new FileReader("Streams_IO_NIO_files\\Test1.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("Streams_IO_NIO_files\\Test2.txt"))
        ) {
//            int character;
//            while ((character=reader.read())!=-1){
//                writer.write(character);
//            }
            String line;
            while((line = reader.readLine())!=null){
                writer.write(line);
                writer.write('\n');
            }
            System.out.println("\nDone!\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
