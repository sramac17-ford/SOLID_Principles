package main.reports;

public interface ReportGenerator {

    String generatePDF();

    String generateTextDocument();

    String generateJsonFile();
}
