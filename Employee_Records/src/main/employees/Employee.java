package main.employees;

public class Employee {

    private static final String EMAIL_DOMAIN = "@ford.com";

    private final String firstName;
    private final String lastName;
    private int fixedPay;
    private int workingHoursPerWeek;
    private boolean isFullTimer;

    public Employee(String firstName, String lastName, int fixedPay, boolean isFullTimer) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isFullTimer = isFullTimer;
        setMonthlyIncome(fixedPay);
    }

    public String getEmail() {
        return firstName + "_" + lastName + EMAIL_DOMAIN;
    }

    public void setMonthlyIncome(int monthlyIncome) {
        if (monthlyIncome < 0) {
            throw new IllegalArgumentException("Income must be positive");
        }
        this.fixedPay = monthlyIncome;
    }

    public void setWorkingHoursPerWeek(int hours) {
        this.workingHoursPerWeek = hours;
    }

    public void applyForLeave(int days) {
        if(isFullTimer) {
            System.out.println("Total 10 Leaves for Interns. Request approved");
        } else {
            System.out.println("Total 24 Leaves for Permanent Employees. Request approved");
        }
    }

    public int getWorkingHoursPerWeek() {
        return workingHoursPerWeek;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public int getFixedPay() {
        return fixedPay;
    }

    public boolean isFullTimer() {
        return isFullTimer;
    }

    public void setFullTimer(boolean fullTimer) {
        isFullTimer = fullTimer;
    }
}
