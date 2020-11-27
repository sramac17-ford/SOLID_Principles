package main.employees;

public class PermanentEmployee extends Employee {

    public PermanentEmployee(String firstName, String lastName, int fixedPay) {
        super(firstName, lastName, fixedPay);
    }

    @Override
    public void applyForLeave(int days) {
        System.out.println("Total 24 Leaves for Permanent Employees. Request approved");
    }
}
