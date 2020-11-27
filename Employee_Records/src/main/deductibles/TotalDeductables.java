package main.deductibles;

import main.employees.Employee;
import main.employees.Intern;

public class TotalDeductables {

    private final double INCOME_TAX = 20.00;
    private final double PF = 2.5;
    private final int INSURANCE_PERMANENT_EMPLOYEE = 750;
    private final int INSURANCE_INTERN = 750;

    public double calculateDeductable(Employee employee) {
        if (employee instanceof Intern) {
            return INSURANCE_INTERN +
                    (employee.getFixedPay() * INCOME_TAX) / 100 +
                    (employee.getFixedPay() * PF) / 100;
        } else {
            return INSURANCE_PERMANENT_EMPLOYEE +
                    (employee.getFixedPay() * INCOME_TAX) / 100 +
                    (employee.getFixedPay() * PF) / 100;
        }
    }
}
