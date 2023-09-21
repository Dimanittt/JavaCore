package StreamAPI;

//import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class FlatMapFunction {
    public static void main(String[] args) {

        Student student1 = new Student("Dmitry", 'm', 24, 6, 9.5);
        Student student2 = new Student("Olesya", 'f', 21, 2, 7.8);
        Student student3 = new Student("Alexander", 'm', 25, 4, 6.3);
        Student student4 = new Student("Nikolay", 'm', 30, 7, 9.8);
        Student student5 = new Student("Ksenia", 'f', 28, 9, 5.5);

        Faculty faculty1 = new Faculty("Economics");
        Faculty faculty2 = new Faculty("Applied Math");

        faculty1.addStudentToFaculty(student1);
        faculty1.addStudentToFaculty(student2);
        faculty1.addStudentToFaculty(student3);

        faculty2.addStudentToFaculty(student4);
        faculty2.addStudentToFaculty(student5);

        List<Faculty> faculties = new ArrayList<>();
        faculties.add(faculty1);
        faculties.add(faculty2);

        faculties.stream().flatMap(faculty -> faculty.getStudentList().stream()).forEach(System.out::println);
        System.out.println();
        faculties.stream().map(faculty -> faculty.getStudentList().stream()).forEach(System.out::println);
    }
}

class Faculty {
    String name;
    List<Student> studentList;

    public Faculty(String name) {
        this.name = name;
        this.studentList = new ArrayList<>();
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addStudentToFaculty(Student student){
        this.studentList.add(student);
    }
}
