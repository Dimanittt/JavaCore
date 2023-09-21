package Stream_IO_NIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {

        try (FileReader fileReader = new FileReader("Streams_IO_NIO_files\\Test1.txt");) {
            int character;
            System.out.println("\n!Using try with resources here!\n");
            while ((character=fileReader.read())!=-1){
                System.out.print((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\nDone!");
    }
}
