package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectFunction_groupingBy_partitioningBy {
    public static void main(String[] args) {

        Student student1 = new Student("Dmitry", 'm', 24, 6, 9.5);
        Student student2 = new Student("Olesya", 'f', 21, 2, 7.8);
        Student student3 = new Student("Alexander", 'm', 25, 4, 6.3);
        Student student4 = new Student("Nikolay", 'm', 30, 7, 9.8);
        Student student5 = new Student("Ksenia", 'f', 28, 7, 5.5);

        List<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        Map<Integer, List<Student>> map =
                students.stream()
                        .peek(student -> student.setName(student.getName().toUpperCase()))
                        .collect(Collectors.groupingBy(Student::getCourse));

        for (Map.Entry<Integer, List<Student>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println();


        Map<Boolean, List<Student>> map1 = students.stream()
                .collect(Collectors.partitioningBy(student -> student.getCourse() > 4));

        for (Map.Entry<Boolean, List<Student>> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
