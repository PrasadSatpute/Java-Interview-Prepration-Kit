package org.example.practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Employee
{
    public String empName;
    public List<String> city;

    public Employee(String empName, List<String> city) {
        this.empName = empName;
        this.city = city;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public List<String> getCity() {
        return city;
    }

    public void setCity(List<String> city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", city=" + city +
                '}';
    }
}

public class Map_FlatMap {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        Employee employee1 = new Employee("ABC",Arrays.asList("Nagpur","Pune"));
        Employee employee2 = new Employee("XYZ",Arrays.asList("Pune","Bangalore","Mumbai"));
        Employee employee3 = new Employee("PQR",Arrays.asList("Nagpur","Pune","Delhi","Hyderabad"));
        Employee employee4 = new Employee("LMN",Arrays.asList("Hyderabad","Bangalore"));
        Employee employee5 = new Employee("GHI",Arrays.asList("Delhi","Mumbai"));
        empList.add(employee1);
        empList.add(employee2);
        empList.add(employee3);
        empList.add(employee4);
        empList.add(employee5);
        System.out.println(empList);

        // Map
        System.out.println("Print all Employee Name in List");
        empList.stream().map(Employee::getEmpName).collect(Collectors.toList()).forEach(System.out::println);

        // Now we need All City in Set order means Nor Repeated
        // Using Map ->
        Set<List<String>> cityListMap = empList.stream().map(Employee::getCity).collect(Collectors.toSet());
        System.out.println(cityListMap); // [[Nagpur, Pune, Delhi, Hyderabad], [Hyderabad, Bangalore], [Nagpur, Pune], [Pune, Bangalore, Mumbai], [Delhi, Mumbai]]

        // Now using FlatMap
        Set<String> cityListFlatMap = empList.stream().flatMap(employee -> employee.getCity().stream()).collect(Collectors.toSet());
        System.out.println(cityListFlatMap); // [Delhi, Nagpur, Pune, Mumbai, Hyderabad, Bangalore]
    }
}
