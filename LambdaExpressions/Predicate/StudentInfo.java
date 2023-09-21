package LambdaExpressions.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class StudentInfo {

    public void testStudent(ArrayList<Student> students, Predicate<Student> predicate){
        for (Student student : students){
            if (predicate.test(student)) System.out.println(student);
        }
    }

}

class Test{
    public static void main(String[] args) {
        Student student1 = new Student("Dmitry", 'm', 24, 6, 9.5);
        Student student2 = new Student("Olesya", 'f', 21, 2, 7.8);
        Student student3 = new Student("Alexander", 'm', 25, 4, 6.3);
        Student student4 = new Student("Nikolay", 'm', 30, 7, 9.8);
        Student student5 = new Student("Ksenia", 'f', 28, 9, 5.5);

        ArrayList<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        System.out.println();
        StudentInfo studentInfo = new StudentInfo();

        System.out.println("studentInfo.testStudent(students, x -> x.course > 4):");
        studentInfo.testStudent(students, x -> x.course > 4);
        System.out.println();

        Predicate<Student> p1 = student -> student.course > 5;
        Predicate<Student> p2 = student -> student.sex == 'm';

        System.out.println("studentInfo.testStudent(students, p1.negate().and(p2)):");
        studentInfo.testStudent(students, p1.negate().and(p2));



    }
}

