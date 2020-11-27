package main.controller;

import main.employees.Employee;
import main.employees.PermanentEmployee;
import main.repository.EmployeeRepository;

public class SaveEmployee {

    public static void main(String[] arguments) {
        EmployeeRepository employeeRepository = new EmployeeRepository();

        Employee newEmployee = new PermanentEmployee("Jacob", "Elias", 125000);
        employeeRepository.addEmployee(newEmployee);
        newEmployee = new PermanentEmployee("Marin", "Rose", 90000);
        employeeRepository.addEmployee(newEmployee);
        newEmployee = new PermanentEmployee("Charlie", "Owen", 55000);
        employeeRepository.addEmployee(newEmployee);
        newEmployee = new PermanentEmployee("Amy", "Deck", 155000);
        employeeRepository.addEmployee(newEmployee);
    }
}
