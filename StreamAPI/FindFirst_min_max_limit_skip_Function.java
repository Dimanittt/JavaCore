package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindFirst_min_max_limit_skip_Function {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student student1 = new Student("Dmitry", 'm', 24, 6, 9.5);
        Student student2 = new Student("Olesya", 'f', 21, 2, 7.8);
        Student student3 = new Student("Alexander", 'm', 25, 4, 6.3);
        Student student4 = new Student("Nikolay", 'm', 30, 7, 9.8);
        Student student5 = new Student("Ksenia", 'f', 28, 9, 5.5);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        Student first = students.stream()
                .filter(student -> student.getAge() > 24)
                .sorted((studentX, studentY) -> studentY.getAge()-studentX.getAge())
                .findFirst()
                .get();

        System.out.println("first: " + first);

        Student maxAge = students.stream().min((x,y) -> x.getAge() - y.getAge()).get();
        System.out.println("maxAge: " + maxAge);

        Student minAge = students.stream().max((x,y) -> x.getAge() - y.getAge()).get();
        System.out.println("minAge: " + minAge);
        System.out.println();

        System.out.println("students.stream().limit(2).forEach(System.out::println):");
        students.stream().limit(2).forEach(System.out::println);

        System.out.println();

        System.out.println("students.stream().skip(2).forEach(System.out::println):");
        students.stream().skip(2).forEach(System.out::println);
        System.out.println();

        double averageDrages = students.stream().mapToDouble(x -> x.getAvgGrade()).average().getAsDouble();
        System.out.println("averageDrages = " + String.format("%.2f", averageDrages));
        System.out.println();

        List<Integer> ages = students.stream().mapToInt(x -> x.getAge()).boxed().collect(Collectors.toList());
        System.out.println("ages of students = " + ages);
    }
}
