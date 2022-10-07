package thirdWeekCodes.thirdWeekCodes_38_.abstractDemo;

public class CustomerManager {

    BaseDatabaseManager baseDatabaseManager;
    public void getCustomers(){

        //BaseDatabaseManager[] process = new BaseDatabaseManager[]{new OraceDatabaseManager() , new SqlServerDatabaseManager()};
        /*OraceDatabaseManager oraceDatabaseManager = new OraceDatabaseManager();
        oraceDatabaseManager.getData();*/

        baseDatabaseManager.getData();
    }
}
