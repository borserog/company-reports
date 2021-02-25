package br.edu.ifpb.report.database;

public class PostgreSQLConnectionCreator extends ConnectionCreator {
    @Override
    public DatabaseConnection createDatabaseConnection() {
        return new PostgreSQLDatabaseConnection();
    }
}
