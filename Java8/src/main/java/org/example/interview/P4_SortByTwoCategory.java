package org.example.interview;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
public class P4_SortByTwoCategory {
    public static void main(String[] args) {
        System.out.println("Find all employees who live in ‘Pune’ city, sort them by their name, and print the names of employees using Stream API.");
        List<Employee> employeeList = new EmployeeList().getEmployeeList();
        Optional<String> name = employeeList
                .stream()
                .filter(str -> str.getCity().equalsIgnoreCase("Pune"))
                .sorted(Comparator.comparing(Employee::getName)).peek(System.out::println)
                .max(Comparator.comparing(Employee::getSalary))
                .map(Employee::getName);

        System.out.println(name.get());
    }
}
