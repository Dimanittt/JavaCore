package Stream_IO_NIO.Serialization.programmer1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Serialization1 {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("Dmitry");
        employees.add("Olesya");
        employees.add("Alexander");

        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("Streams_IO_NIO_files\\employees1.bin"))
        ) {
            outputStream.writeObject(employees);
            System.out.println("\nDone!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
