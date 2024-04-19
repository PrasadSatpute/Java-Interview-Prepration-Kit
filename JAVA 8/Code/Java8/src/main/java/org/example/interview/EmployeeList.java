package org.example.interview;
import java.util.ArrayList;
import java.util.List;
public class EmployeeList {

    List<Employee> employeeList = new ArrayList<>();
    public EmployeeList() {
        Employee e1 = new Employee("ABC","Pune",6543);
        Employee e2 = new Employee("XYZ","Nagpur",6576654);
        Employee e3 = new Employee("LMN","Mumbai",9876);
        Employee e4 = new Employee("EFG","Pune",7654);
        Employee e5 = new Employee("DEF","Bangalore",65357);
        Employee e6 = new Employee("LMN","Pune",45687);
        Employee e7 = new Employee("ABC","Pune",45687);
        Employee e8 = new Employee("EFG","Nagpur",7654);
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        employeeList.add(e6);
        employeeList.add(e7);
        employeeList.add(e8);
        setEmployeeList(employeeList);
    }
    public List<Employee> getEmployeeList() {
        return employeeList;
    }
    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
