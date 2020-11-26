package main.controller;

import main.deductibles.TotalDeductables;
import main.employees.Employee;
import main.repository.EmployeeRepository;

import java.util.ArrayList;

public class CalculatePayableSalary {

    public static void main(String[] args) {
        EmployeeRepository employeeRepository = new EmployeeRepository();

        ArrayList<Employee> employeesList = employeeRepository.getEmployees();
        TotalDeductables totalDeductables = new TotalDeductables();

        for (Employee e : employeesList) {
            double deductable = totalDeductables.calculateDeductable(e);
            double totalPay = e.getFixedPay() - deductable;
            System.out.println("The payable salary for employee " + e.getFullName() + " is " + totalPay);
        }
    }

}
