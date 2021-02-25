package br.edu.ifpb.report.database;

public class MysqlDatabaseConnection implements DatabaseConnection {

    public void openConnection() {
        System.out.println("Create mysql connetion");
    }

    public void executeQuery(String query) {
        System.out.println("Run SQL query");
    }

}
