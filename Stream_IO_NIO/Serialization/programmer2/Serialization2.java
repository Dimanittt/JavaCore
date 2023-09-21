package Stream_IO_NIO.Serialization.programmer2;

import Stream_IO_NIO.Serialization.programmer1.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Serialization2 {

    public static void main(String[] args) {
        Employee bestEmployee;
        try (ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("Streams_IO_NIO_files\\employee1.bin"))
        ) {
            bestEmployee = (Employee) inputStream.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(bestEmployee);
    }
}
