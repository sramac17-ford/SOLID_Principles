package main.repository;

import main.employees.Employee;
import main.employees.Intern;
import main.employees.PermanentEmployee;
import main.reports.ContractGenerator;

import java.util.ArrayList;

public class EmployeeRepository {

    private static final ArrayList<Employee> employeeList = new ArrayList<>();

    public EmployeeRepository() {
        employeeList.add(new PermanentEmployee("John", "Doe", 75000));
        employeeList.add(new PermanentEmployee("Jason", "Bourne", 95000));
        employeeList.add(new PermanentEmployee("Xavier", "Abraham", 65000));

        employeeList.add(new Intern("Rebecca", "Johnson", 45000));
        employeeList.add(new Intern("Michael", "Richards", 40000));
    }

    public ArrayList<Employee> getEmployees() {
        return employeeList;
    }

    public void addEmployee(Employee employee) {
        try {
            employeeList.add(employee);
            issueContract(employee.getFullName());
            System.out.println("Employee added successfully");
        } catch (NullPointerException exception) {
            System.out.println("Employee could not be added since null value was passed");
        }
    }

    private void issueContract(String fullName) {
        StringBuilder contractBuilder = new StringBuilder();
        contractBuilder.append("#################################Contract for ").append(fullName).append("#################################");
        contractBuilder.append(System.lineSeparator());
        contractBuilder.append("This is a legal contract referring to the employment between the employee").append(fullName).append(" and Ford Motor Company ............");
        contractBuilder.append(System.lineSeparator());
        ContractGenerator contractGenerator = new ContractGenerator(contractBuilder.toString());
        System.out.println(contractGenerator.generateTextDocument());
        System.out.println(contractGenerator.generateJsonFile());
        System.out.println(contractGenerator.generatePDF());
    }

}
