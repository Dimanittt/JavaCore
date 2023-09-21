package Stream_IO_NIO.NIO_ChannelBufferExamples;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferExample2 {
    public static void main(String[] args) {
        try(RandomAccessFile file = new RandomAccessFile("Streams_IO_NIO_files\\Test4.txt", "rw");
            FileChannel channel = file.getChannel()
        ){
            ByteBuffer buffer1 = ByteBuffer.allocate(5);
            channel.read(buffer1);
            buffer1.flip();
            System.out.print("\n" + (char) buffer1.get()); //a
            System.out.print((char) buffer1.get()); //b
            System.out.println((char) buffer1.get()); //c
            buffer1.rewind();
            System.out.print((char) buffer1.get()); //a
            System.out.print((char) buffer1.get()); //b
            System.out.println((char) buffer1.get() + "\n"); //c
            buffer1.compact(); //do not erase bytes while reading from channel
            channel.read(buffer1);
            buffer1.flip();
            while(buffer1.hasRemaining()){
                System.out.print((char) buffer1.get());
            }
            buffer1.clear();
            channel.read(buffer1);
            buffer1.flip();
            System.out.println();
            System.out.print((char) buffer1.get());
            System.out.print((char) buffer1.get());
            buffer1.mark(); //mark the current position
            while(buffer1.hasRemaining()){
                System.out.print((char) buffer1.get());
            }
            buffer1.reset();
            while(buffer1.hasRemaining()){
                System.out.print((char) buffer1.get());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
