package main.employees;

public abstract class Employee {

    private static final String EMAIL_DOMAIN = "@ford.com";

    private final String firstName;
    private final String lastName;
    private int fixedPay;
    private int workingHoursPerWeek;

    public Employee(String firstName, String lastName, int fixedPay) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public abstract void applyForLeave(int days) throws Exception;

    public int getWorkingHoursPerWeek() {
        return workingHoursPerWeek;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public int getFixedPay() {
        return fixedPay;
    }
}
