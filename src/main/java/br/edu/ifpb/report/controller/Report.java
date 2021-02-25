package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.DatabaseConnection;

public abstract class Report {

    protected DatabaseConnection connector;

    public void generateReport() {
        createDatabaseConnection(connector);
        executeDatabaseQuery();
        convertReportOutput();
    }

    public void createDatabaseConnection(DatabaseConnection connector) {
        System.out.println("Creating Database Connection...");
        connector.openConnection();
    }

    protected abstract void convertReportOutput();

    protected abstract void executeDatabaseQuery();

    public void setConnector(DatabaseConnection connector) {
        this.connector = connector;
    }
}
