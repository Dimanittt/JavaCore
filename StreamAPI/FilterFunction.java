package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class FilterFunction {
    public static void main(String[] args) {
        List<Student> students1 = new ArrayList<>();

        Student student1 = new Student("Dmitry", 'm', 24, 6, 9.5);
        Student student2 = new Student("Olesya", 'f', 21, 2, 7.8);
        Student student3 = new Student("Alexander", 'm', 25, 4, 6.3);
        Student student4 = new Student("Nikolay", 'm', 30, 7, 9.8);
        Student student5 = new Student("Ksenia", 'f', 28, 9, 5.5);

        students1.add(student1);
        students1.add(student2);
        students1.add(student3);
        students1.add(student4);
        students1.add(student5);

        System.out.println();
        System.out.println("Initial list: ");
        students1.forEach(x -> System.out.println(x));
        System.out.println();

        System.out.println("Filtred list with stream().filter(...)");
        students1.stream().filter(x -> 27 > x.getAge()).forEach(x -> System.out.println(x));




    }
}

