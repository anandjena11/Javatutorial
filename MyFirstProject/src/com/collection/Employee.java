package com.collection;

public class Employee {
    private int empId;
    private String name;
    private String designation;
    public Employee(int empId, String name, String designation) {
        this.empId = empId;
        this.name = name;
        this.designation = designation;
    }
    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", name=" + name + ", designation="
                + designation + "]";
    }
}
