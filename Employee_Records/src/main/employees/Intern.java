package main.employees;

public class Intern extends Employee {

    public Intern(String firstName, String lastName, int pay) {
        super(firstName, lastName, pay);
        this.setWorkingHoursPerWeek(20);
    }

    @Override
    public void applyForLeave(int days) {
        System.out.println("Total 10 Leaves for Interns. Request approved");
    }
}
