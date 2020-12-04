package main.reports;

import java.time.Month;

public class PaySlipGenerator implements TextReportGenerator {

    private final String employeeName;
    private final double netMonthlyPay;
    private final Month month;

    public PaySlipGenerator(String fullName, double netPay, Month month) {
        this.employeeName = fullName;
        this.netMonthlyPay = netPay;
        this.month = month;
    }

    @Override
    public String generateTextDocument() {
        StringBuilder paySlipContent = new StringBuilder();
        paySlipContent.append("**************************Payslip for the month of ").append(month).append("**************************");
        paySlipContent.append(System.lineSeparator());
        paySlipContent.append("MONTH: ").append(this.month);
        paySlipContent.append(System.lineSeparator());
        paySlipContent.append("NAME: ").append(this.employeeName);
        paySlipContent.append(System.lineSeparator());
        paySlipContent.append("INCOME: ").append(this.netMonthlyPay);
        paySlipContent.append(System.lineSeparator());

        return paySlipContent.toString();
    }
}
