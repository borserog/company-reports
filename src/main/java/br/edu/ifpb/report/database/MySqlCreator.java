package br.edu.ifpb.report.database;

public class MySqlCreator extends ConnectionCreator {
    @Override
    public DatabaseConnection createDatabaseConnection() {
        return new MysqlDatabaseConnection();
    }
}
