package Stream_IO_NIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("Streams_IO_NIO_files\\Test1.txt", "rw")
        ) {
            int c = file.read();
            System.out.println((char) c);

            String s1 = file.readLine();
            System.out.println(s1);

            file.seek(41); //move to pointed position
            String s2 = file.readLine();
            System.out.println(s2);

            System.out.println(file.getFilePointer());

//            file.seek(0);
//            String s3 = "Hello";
//
//            file.writeBytes(s3); //write symbols above the old ones

            file.seek(file.length()-1);
            String s4 = "\n\n\t\t\t\t\tDmitry Starostin";
            file.writeBytes(s4);

        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
