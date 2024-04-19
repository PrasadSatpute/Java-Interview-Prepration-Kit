package org.example.interview;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class P6_CountByDepartment {
    public static void main(String[] args) {
        System.out.println("Find the employee count in each department in the employee list using Java 8 Stream API.");
        List<Employee> employeeList = new EmployeeList().getEmployeeList();
        Map<String, Long> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getCity, Collectors.counting()));
        System.out.println(collect);
    }
}
