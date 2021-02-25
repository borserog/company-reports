package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.ConnectionCreator;
import br.edu.ifpb.report.database.PostgreSQLConnectionCreator;

public class ExpenseReport extends Report {

    public ConnectionCreator connectionCreator = new PostgreSQLConnectionCreator();

    public ExpenseReport() {
        super.setConnector(connectionCreator.createDatabaseConnection());
    }

    public void executeDatabaseQuery() {
        System.out.println("Executing Postgres Query...");
        String query = "SELECT * FROM expenses";
        super.connector.executeQuery(query);
    }

    public void convertReportOutput() {
        System.out.println("Converting To XLS...");
    }
}
