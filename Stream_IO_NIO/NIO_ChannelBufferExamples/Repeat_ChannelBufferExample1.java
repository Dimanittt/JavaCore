package Stream_IO_NIO.NIO_ChannelBufferExamples;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Repeat_ChannelBufferExample1 {
    public static void main(String[] args) throws FileNotFoundException {

        try (RandomAccessFile file = new RandomAccessFile("Streams_IO_NIO_files\\Test3.txt", "rw");
             FileChannel channel = file.getChannel();
        ) {
            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder sonnet = new StringBuilder();

            int byteRead = channel.read(buffer);

            while(byteRead>0){
                System.out.println("Read: " + byteRead + " bytes");

                buffer.flip();

                while (buffer.hasRemaining()){
                    sonnet.append((char) buffer.get());
                }

                buffer.clear();
                byteRead = channel.read(buffer);
            }
            System.out.println(sonnet);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
