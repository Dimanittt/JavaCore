package Stream_IO_NIO;

import java.io.*;

public class DataInputOutputStream {
    public static void main(String[] args) {
        try (DataOutputStream output = new DataOutputStream(
                new FileOutputStream("Streams_IO_NIO_files\\Test1.bin"));
             DataInputStream input = new DataInputStream(
                     new FileInputStream("Streams_IO_NIO_files\\Test1.bin"));
             ) {
            output.writeInt(123);
            output.writeBoolean(true);
            output.writeChar('G');
            output.writeFloat(3.14f);
            System.out.println(input.readInt());
            System.out.println(input.readBoolean());
            System.out.println(input.readChar());
            System.out.println(input.readFloat());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
