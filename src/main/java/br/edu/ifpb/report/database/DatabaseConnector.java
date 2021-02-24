package br.edu.ifpb.report.database;

public interface DatabaseConnector {
    void openConnection();
    void executeQuery(String query);
}
