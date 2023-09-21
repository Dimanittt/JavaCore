package LambdaExpressions.Example3;

import java.util.*;

public class StudentInfo {

    void testStudent(ArrayList<Student> students, StudentCheck studentCheck){
        for (Student student : students){
            if (studentCheck.check(student)) System.out.println(student);
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

        StudentCheck studentCheck = student -> student.age > 24;

        System.out.println("studentInfo.testStudent(students, studentCheck):");
        studentInfo.testStudent(students, studentCheck);

        System.out.println();
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.course- o2.course;
            }
        });

        System.out.println("students sorted via Comparator with course: " + students);

        Collections.sort(students, (x, y) -> x.age-y.age);
        System.out.println();

        System.out.println("students sorted via lambda with age: " + students);

    }
}

interface StudentCheck{
    boolean check(Student student);
}

class CheckOverGrade implements StudentCheck {

    @Override
    public boolean check(Student student) {
        return student.avgGrade>7;
    }
}