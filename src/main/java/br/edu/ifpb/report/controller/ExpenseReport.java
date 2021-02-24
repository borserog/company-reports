package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.PostgreSQLDatabaseConnector;

public class ExpenseReport extends ReportGenerator {

    public ExpenseReport() {
        super.setConnector(new PostgreSQLDatabaseConnector());
    }

    public void executeDatabaseQuery() {
        System.out.println("Executing Postgres Query...");
        String query = "SELECT * FROM expenses";
        connector.executeQuery(query);
    }

    public void convertReportOutput() {
        System.out.println("Converting To XLS...");
    }
}
