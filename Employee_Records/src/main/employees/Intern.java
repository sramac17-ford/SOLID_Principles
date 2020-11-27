package main.employees;

public class Intern extends Employee {

    public Intern(String firstName, String lastName, int fixedPay) {
        super(firstName, lastName, fixedPay);
    }

    @Override
    public void applyForLeave(int days) {
        System.out.println("Total 10 Leaves for Interns. Request approved");
    }

}
