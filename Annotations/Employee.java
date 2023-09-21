package Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@MyAnnotation
public class Employee {
    @MyAnnotation
    String name;
    double salary;

    @MyAnnotation
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @MyAnnotation
    void increaseSalary(){
        salary *= 2;
    }

    @Override
    @MyAnnotation
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

@Target({ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE})
@interface MyAnnotation {

}
