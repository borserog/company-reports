package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.DatabaseConnector;
import br.edu.ifpb.report.database.MysqlDatabaseConnector;

public class TaxReport extends ReportGenerator {

    public TaxReport() {
        super.setConnector(new MysqlDatabaseConnector());
    }

    public void executeDatabaseQuery() {
        System.out.println("Executing MySQL Query...");
        String query = "SELECT * FROM taxes";
        connector.executeQuery(query);
    }

    public void convertReportOutput() {
        System.out.println("Converting To PDF...");
    }
}
