package RegEx;

public class StringMethods4 {

    static void employeeInfo(Employee employee){
        System.out.printf("%03d \t %-12s \t %-12s \t %,.1f \n", employee.id, employee.name, employee.surname, employee.salary*(1+ employee.bonusPct));
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Dmitry", "Starostin", 10000, 0.15);
        Employee employee2 = new Employee(12, "Olesya", "Afanasyeva", 9000, 0.1);
        Employee employee3 = new Employee(123, "Nikolay", "Miironov", 8000, 0.08);

        employeeInfo(employee1);
        employeeInfo(employee2);
        employeeInfo(employee3);

        String newString = String.format("%03d \t %-12s \t %-12s \t %,.1f \n", 1, "Dmitry", "Starostin", 11500f);
        System.out.println("\nnewString:\n" + newString);

    }
}

class Employee {
    int id;
    String name;
    String surname;
    int salary;
    double bonusPct;

    public Employee(int id, String name, String surname, int salary, double bonusPct) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonusPct = bonusPct;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", bonusPct=" + bonusPct +
                '}';
    }
}