package thirdWeekCodes.thirdWeekCodes_38_.abstractDemo;

public class Main {

    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();

        customerManager.baseDatabaseManager = new MySqlDatabaseManager();
        customerManager.getCustomers();

        customerManager.baseDatabaseManager = new SqlServerDatabaseManager();
        customerManager.getCustomers();

        customerManager.baseDatabaseManager = new OraceDatabaseManager();
        customerManager.getCustomers();














    }
}
