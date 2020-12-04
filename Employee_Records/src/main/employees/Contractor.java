package main.employees;

public class Contractor {

    private final String firstName;
    private final String lastName;
    private final int fixedPay;

    public Contractor(String firstName, String lastName, int fixedPay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fixedPay = fixedPay;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getFixedPay() {
        return fixedPay;
    }
}
