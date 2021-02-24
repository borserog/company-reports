package br.edu.ifpb.report.service;

import br.edu.ifpb.report.controller.ExpenseReport;
import br.edu.ifpb.report.controller.TaxReport;

public class ReportService {

    public void generateReport(String type) {
        switch (type) {
            case "expense":
                ExpenseReport expenseReport = new ExpenseReport();
                expenseReport.generateReport();
                break;
            case "taxes":
                TaxReport taxReport = new TaxReport();
                taxReport.generateReport();
                break;
        }
    }

}
