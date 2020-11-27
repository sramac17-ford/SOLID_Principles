package main.controller;

import main.employees.Employee;
import main.repository.EmployeeRepository;

public class SaveEmployee {

    public static void main(String[] arguments) {
        EmployeeRepository employeeRepository = new EmployeeRepository();

        Employee newEmployee = new Employee("Jacob", "Elias", 125000, true);
        employeeRepository.addEmployee(newEmployee);
        newEmployee = new Employee("Marin", "Rose", 90000, true);
        employeeRepository.addEmployee(newEmployee);
        newEmployee = new Employee("Charlie", "Owen", 55000, true);
        employeeRepository.addEmployee(newEmployee);
        newEmployee = new Employee("Amy", "Deck", 155000, true);
        employeeRepository.addEmployee(newEmployee);
    }
}
