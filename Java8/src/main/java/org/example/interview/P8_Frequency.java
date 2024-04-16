package org.example.interview;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class P8_Frequency {
    public static void main(String[] args) {
        System.out.println("Find the occurrence of names of employees from the List<Employee>, and find the frequency of each name.");
        List<Employee> employeeList = new EmployeeList().getEmployeeList();
        for (Employee employee1 : employeeList) {
            String city = employee1.getCity();
            System.out.println(city);
        }
        System.out.println("--------------------------------------------------------------");
        Map<String, Integer> nameFrequencyMap = new HashMap<>();
        for (Employee employee : employeeList) {
            String name = employee.getName();
            nameFrequencyMap.put(name, nameFrequencyMap.getOrDefault(name, 0) + 1);
        }
        System.out.println("Name frequency: " + nameFrequencyMap);

        System.out.println("----------------------Best Solution----------------------------------------");

        Map<String, Long> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
        System.out.println(collect);
    }
}
