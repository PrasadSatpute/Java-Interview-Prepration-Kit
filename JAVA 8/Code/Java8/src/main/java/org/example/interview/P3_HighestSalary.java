package org.example.interview;
import java.util.Comparator;
import java.util.List;
public class P3_HighestSalary {
    public static void main(String[] args) {
        System.out.println("Find the highest salary of an employee from the HR department using Java stream API.");
        EmployeeList employeeList = new EmployeeList();
        List<Employee> list = employeeList.getEmployeeList();
        list
                .stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(1)
                .map(Employee::getSalary)
                .forEach(System.out::println);
    }
}
