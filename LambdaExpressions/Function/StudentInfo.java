package LambdaExpressions.Function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;


public class StudentInfo {


    static double avgOfSmth(ArrayList<Student> students, Function<Student, Double> function){
        double result = 0;
        for (Student student : students){
            result += function.apply(student);
        }
        return result/students.size();
    }

}

class Test{

    static int sqr(int a, int b){
        Function<Integer, Integer> function = x -> x * a;
        int result = 1;
        for (int i = 0; i < b; i++) {
            result = function.apply(result);
        }
        return result;
    }

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

        System.out.println("studentInfo.avgOfSmth(students, student -> (double) student.course) = "
                + studentInfo.avgOfSmth(students, student -> (double) student.course));

        System.out.println("sqr(2,10) = " + sqr(2,10));

    }
}