package br.edu.ifpb.report.database;

public interface DatabaseConnection {
    void openConnection();
    void executeQuery(String query);
}
