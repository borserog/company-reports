package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.ConnectionCreator;
import br.edu.ifpb.report.database.MySqlCreator;

public class TaxReport extends Report {

    public ConnectionCreator connectionCreator = new MySqlCreator();

    public TaxReport() {
        super.setConnector(connectionCreator.createDatabaseConnection());
    }

    public void executeDatabaseQuery() {
        System.out.println("Executing MySQL Query...");
        String query = "SELECT * FROM taxes";
        super.connector.executeQuery(query);
    }

    public void convertReportOutput() {
        System.out.println("Converting To PDF...");
    }
}
