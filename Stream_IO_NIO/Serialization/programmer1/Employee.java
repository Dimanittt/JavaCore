package Stream_IO_NIO.Serialization.programmer1;

import java.io.Serializable;

public class Employee implements Serializable {

    final static long serialVersionUID = 1;

    String name;
    int age;
    transient int salary;
    Car car;

    public Employee(String name,
                    int age,
                    int salary, Car car) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", " + car +
                ", salary=" + salary +
                '}';
    }
}
