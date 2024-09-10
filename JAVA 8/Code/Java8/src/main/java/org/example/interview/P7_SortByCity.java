package org.example.interview;
import java.util.Comparator;
import java.util.List;

public class P7_SortByCity {
    public static void main(String[] args) {
        System.out.println("Find employees based on location or city and sort in an alphabetical manner using stream API.");
        List<Employee> employeeList = new EmployeeList().getEmployeeList();
        employeeList
                .stream()
                .sorted(Comparator
                        .comparing(Employee::getCity)).peek(System.out::println)
                .map(Employee::getCity)
                .forEach(System.out::println);
    }
}
