package com.collection;
import java.util.ArrayList;
import java.util.List;
public class EmployeeList {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(1001, "John", "Developer"));
        employees.add(new Employee(1886, "Riya", "Developer"));
        employees.add(new Employee(6723, "Smith", "Project Manager"));
        employees.add(new Employee(8954, "Pooja", "Tester"));

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
