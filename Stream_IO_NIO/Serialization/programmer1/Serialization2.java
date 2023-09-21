package Stream_IO_NIO.Serialization.programmer1;

import java.io.*;

public class Serialization2 {
    public static void main(String[] args) {
        Car car = new Car("VAZ2109", "grey");
        Employee employee = new Employee("Dmitry", 24,
                60000,
                car);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("Streams_IO_NIO_files\\employee1.bin"))
        ) {
            outputStream.writeObject(employee);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\nDone!");
    }
}
