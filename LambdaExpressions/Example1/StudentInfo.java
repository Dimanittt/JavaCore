package LambdaExpressions.Example1;

import java.util.*;

public class StudentInfo {


    void printStudentOverGrade(ArrayList<Student> students, double grade){
        for (Student student : students){
            if (student.avgGrade > grade) System.out.println(student);
        }
    }

    void printStudentUnderAge(ArrayList<Student> students, int age){
        for (Student student : students){
            if (student.age < age) System.out.println(student);
        }
    }

    void printStudentMixCondition(ArrayList<Student> students, int age, double grade, char sex){
        for (Student student : students){
            if (student.age > age && student.avgGrade < grade && student.sex==sex)
                System.out.println(student);
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

        StudentInfo studentInfo = new StudentInfo();

        System.out.println("studentInfo.printStudentOverGrade(students, 7.0):");
        studentInfo.printStudentOverGrade(students, 7.0);
        System.out.println();
        System.out.println("studentInfo.printStudentUnderAge(students, 25):");
        studentInfo.printStudentUnderAge(students, 25);
        System.out.println();
        System.out.println("studentInfo.printStudentMixCondition(students, 23, 7.5, 'm'):");
        studentInfo.printStudentMixCondition(students, 23, 8, 'm');


    }
}