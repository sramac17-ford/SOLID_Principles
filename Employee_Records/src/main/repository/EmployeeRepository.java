package main.repository;

import main.employees.Employee;
import main.employees.Intern;
import main.employees.PermanentEmployee;

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

    public void addEmployee(Employee employee) throws NullPointerException {
        if (employee != null) {
            employeeList.add(employee);
        } else {
            throw new NullPointerException("Employee cannot be null");
        }
    }

}
