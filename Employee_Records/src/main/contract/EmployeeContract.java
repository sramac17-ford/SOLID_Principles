package main.contract;

import main.employees.Employee;
import main.reports.ContractGenerator;

public class EmployeeContract {

    private Employee employee;

    public EmployeeContract(Employee employee) {
        this.employee = employee;
    }

    public void createContractForEmployee() {
        StringBuilder contractBuilder = new StringBuilder();
        contractBuilder.append("#################################Contract for ").append(employee.getFullName()).append("#################################");
        contractBuilder.append(System.lineSeparator());
        contractBuilder.append("This is a legal contract referring to the employment between the employee").append(employee.getFullName()).append(" and Ford Motor Company ............");
        contractBuilder.append(System.lineSeparator());
        ContractGenerator contractGenerator = new ContractGenerator(contractBuilder.toString());
        System.out.println(contractGenerator.generateTextDocument());
        System.out.println(contractGenerator.generateJsonFile());
        System.out.println(contractGenerator.generatePDF());
    }
}
