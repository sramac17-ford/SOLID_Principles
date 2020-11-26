package main.employees;

public class PermanentEmployee extends Employee {

    public PermanentEmployee(String firstName, String lastName, int pay) {
        super(firstName, lastName, pay);
        this.setWorkingHoursPerWeek(40);
    }

    @Override
    public void applyForLeave(int days) {
        System.out.println("Total 24 Leaves for Permanent Employees. Request approved");
    }
}
