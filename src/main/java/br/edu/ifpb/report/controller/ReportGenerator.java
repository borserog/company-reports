package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.DatabaseConnector;

public abstract class ReportGenerator {

    protected DatabaseConnector connector;

    public void generateReport() {
        createDatabaseConnection(connector);
        executeDatabaseQuery();
        convertReportOutput();
    }

    public void createDatabaseConnection(DatabaseConnector connector) {
        System.out.println("Creating Database Connection...");
        connector.openConnection();
    }

    protected abstract void convertReportOutput();

    protected abstract void executeDatabaseQuery();

    public void setConnector(DatabaseConnector connector) {
        this.connector = connector;
    }
}
