package Collections;

import java.util.LinkedList;

public class LinkedListExample1 {
    public static void main(String[] args) {
        Student student1 = new Student("Dmitry", 4);
        Student student3 = new Student("Olesya", 3);
        Student student2 = new Student("Alexander", 3);
        Student student4 = new Student("Kolya", 2);
        Student student5 = new Student("Varya", 1);
        LinkedList<Student> linkedList = new LinkedList<>();
        linkedList.add(student1);
        linkedList.add(student2);
        linkedList.add(student3);
        linkedList.add(student4);
        linkedList.add(student5);
        System.out.println("linkedList: " + linkedList);
        System.out.println("LinkedList is preferrable when you provide less search operations and provide more of delete/add operations");
    }


}

class Student{
    String name;
    int course;

    public Student(String name, int age) {
        this.name = name;
        this.course = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}