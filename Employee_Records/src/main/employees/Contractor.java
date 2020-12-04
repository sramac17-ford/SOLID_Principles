package main.employees;

public class Contractor extends Employee {

    public Contractor(String firstName, String lastName, int fixedPay) {
        super(firstName, lastName, fixedPay);
    }

    @Override
    public void applyForLeave(int days) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Contract employees cannot apply leave");
    }

}
