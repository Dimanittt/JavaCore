package Stream_IO_NIO.NIO_ChannelBufferExamples;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class ChannelBufferExample1 {
    public static void main(String[] args) {
        try (RandomAccessFile file =
                     new RandomAccessFile("Streams_IO_NIO_files\\Test3.txt", "rw");
             FileChannel channel = file.getChannel();
        ) {
            //Reading
            ByteBuffer buffer1 = ByteBuffer.allocate(25);
            StringBuilder sonnet = new StringBuilder();
            int byteRead = channel.read(buffer1); //Read from file and write data to buffer, so = 25 (capacity)
            while (byteRead>0){
                System.out.println("Read: " + byteRead);
                buffer1.flip();
                while (buffer1.hasRemaining()){
                    sonnet.append((char) buffer1.get());
                }
                buffer1.clear();
                byteRead = channel.read(buffer1);
            }
            System.out.println(sonnet);
            //Writing
            String text = "\n" +
                    "\n" +
                    "Look in your mirror and tell the face you see that it’s time it should create another If you do not\n" +
                    "renew yourself you would be depriving the world, and stop some woman from becoming a mother.\n" +
                    "For where is the lovely woman whose unploughed womb would not appreciate the way you plow\n" +
                    "your field? Or who is he foolish enough to love himself so much as to neglect reproducing? You are\n" +
                    "the mirror of your mother, and she is the mirror of you, and in you, she recalls the lovely April of her\n" +
                    "youth. In the same way, you will see your youth in your own children, in spite of the wrinkles caused\n" +
                    "by age. But if you live your life avoiding being remembered you will die single and your image will die\n" +
                    "with you.";
//            ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes().length);
//            buffer2.put(text.getBytes(StandardCharsets.UTF_8));
//            buffer2.flip();
            ByteBuffer buffer2 = ByteBuffer.wrap(text.getBytes(StandardCharsets.UTF_8));
            channel.write(buffer2);
            System.out.println("\nDone!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
