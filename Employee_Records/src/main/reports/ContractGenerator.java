package main.reports;

import java.util.Arrays;

public class ContractGenerator implements ReportGenerator {

    private String contractContent;

    public ContractGenerator(String contractContent) {
        this.contractContent = contractContent;
    }

    @Override
    public String generatePDF() {
        return Arrays.toString(this.contractContent.getBytes());
    }

    @Override
    public String generateTextDocument() {
        return "Contract for the Employment : " + this.contractContent;
    }

    @Override
    public String generateJsonFile() {
        return "{'EmployeeContract':'" + this.contractContent + "'}";
    }
}
