package main.controller;

import main.employees.Employee;
import main.repository.EmployeeRepository;

import java.util.ArrayList;

public class EmployeeLeaveRequest {

    public static void main(String[] args) throws Exception {

        EmployeeRepository repository = new EmployeeRepository();

        ArrayList<Employee> employees = repository.getEmployees();

        for (Employee employee : employees) {
            employee.applyForLeave(3);
        }
    }
}
