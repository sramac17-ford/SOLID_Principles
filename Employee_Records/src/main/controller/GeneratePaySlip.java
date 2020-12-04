package main.controller;

import main.deductibles.TotalDeductables;
import main.employees.Employee;
import main.reports.PaySlipGenerator;
import main.reports.ReportGenerator;
import main.repository.EmployeeRepository;

import java.time.Month;
import java.util.ArrayList;

public class GeneratePaySlip {

    public static void main(String[] args) {
        EmployeeRepository employeeRepository = new EmployeeRepository();

        ArrayList<Employee> employeesList = employeeRepository.getEmployees();

        for (Employee e : employeesList) {
            double netPay = e.getFixedPay() - new TotalDeductables().calculateDeductable(e);
            ReportGenerator paySlipGenerator = new PaySlipGenerator(e.getFullName(), netPay, Month.JANUARY);
            System.out.println(paySlipGenerator.generateTextDocument());
        }
    }
}
