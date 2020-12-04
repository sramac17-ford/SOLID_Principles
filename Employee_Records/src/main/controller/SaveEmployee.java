package main.controller;

import main.employees.Employee;
import main.employees.PermanentEmployee;
import main.logger.ConsoleLogger;
import main.repository.EmployeeRepository;

public class SaveEmployee {

    public static void main(String[] arguments) {
        EmployeeRepository employeeRepository = new EmployeeRepository();

        Employee newEmployee = new PermanentEmployee("Jacob", "Elias", 125000);
        try {
            employeeRepository.addEmployee(newEmployee);
            ConsoleLogger.logMessage("Employee added to the database successfully");
        } catch (NullPointerException exception) {
            ConsoleLogger.logError("Exception occurred", exception);
        }
    }
}
