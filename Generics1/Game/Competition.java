package Generics1.Game;

public class Competition {
    public static void main(String[] args) {
        Scholar scholar1 = new Scholar("Dmitry", 13);
        Scholar scholar2 = new Scholar("Alexander", 15);

        Student student1 = new Student("Olesya", 20);
        Student student2 = new Student("Varya", 21);

        Employee employee1 = new Employee("Andrey", 33);
        Employee employee2 = new Employee("Mikhail", 41);

        Team<Scholar> scholarTeam = new Team<>("School");
        Team<Student> studentTeam = new Team<>("University");
        Team<Employee> employeeTeam = new Team<>("Department");

        scholarTeam.addNewParticipant(scholar1);
        scholarTeam.addNewParticipant(scholar2);

        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

//        scholarTeam.playWith(studentTeam);
//        scholarTeam.playWith(employeeTeam);
//        studentTeam.playWith(employeeTeam);
    }
}
