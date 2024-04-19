package org.example.interview;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class P2_SortEmployeeObject {
    public static void main(String[] args) {
        System.out.println("How to sort the employee list in ascending and descending order using Java-8 streams API?");
        List<Employee> employeeList = new ArrayList<>();
        Employee e1 = new Employee("ABC","Pune",6543);
        Employee e2 = new Employee("XYZ","Nagpur",6576654);
        Employee e3 = new Employee("LMN","Mumbai",9876);
        Employee e4 = new Employee("EFG","Pune",7654);
        Employee e5 = new Employee("DEF","Bangalore",65357);
        Employee e6 = new Employee("LMN","Pune",45687);

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        employeeList.add(e6);

        employeeList
                .stream()
                .sorted(Comparator.comparing(Employee::getName))
                .map(Employee::getName)
                .forEach(System.out::println);
        System.out.println("--------------------------------------------------------------");
        employeeList
                .stream()
                .sorted(Comparator.comparing(Employee::getName).reversed())
                .map(Employee::getName)
                .forEach(System.out::println);

    }
}
