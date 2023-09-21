import java.util.*;
import java.util.stream.Collectors;

public class CompareToTesting {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(6, "Dmitry", "Starostin", 1000);
        Employee emp2 = new Employee(15, "Alexander", "Butorin", 900);
        Employee emp3 = new Employee(9, "Olesya", "Afanasyeva", 950);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sorting");
        System.out.println(list);
        System.out.println("After Sorting");
//        Collections.sort(list, new SalaryComparator());
        Collections.sort(list);
        System.out.println(list);
    }
}

    class Employee implements Comparable<Employee> {
        int id;
        String name;
        String surname;
        int salary;

        public Employee(int id, String name, String surname, int salary) {
            this.id = id;
            this.name = name;
            this.surname = surname;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", salary=" + salary +
                    '}';
        }

        @Override
        public int compareTo(Employee emp) {
//        if (this.id == o.id) return 0;
//        else if (this.id > o.id) return 1;
//        else return -1;
//  //          return this.id - o.id;
        int res =  this.name.compareTo(emp.name);
        if (res == 0) res = this.surname.compareTo(emp.surname);
        return res;
        }
    }

    class SalaryComparator implements Comparator<Employee>{
        @Override
        public int compare(Employee emp1, Employee emp2) {
            return emp1.salary-emp2.salary;
        }
    }

class IdComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.id-emp2.id;
    }
}
