package thirdWeekCodes.thirdWeekCodes_38_.Interfaces;

public class Main {

    public static void main(String[] args) {

        /*

        ICustomerDal iCustomerDal = new OracleCustomerDal();
        iCustomerDal.add();

        IRepsitory iRepsitory = new MySqlCustomerDal();
        iRepsitory.addd();

        */




//      ICustomerDal iCustomerDal = new MySqlCustomerDal();




        ICustomerDal [] iCustomerDal = {new MySqlCustomerDal() , new OracleCustomerDal(), new SqlserverManager()};
        for (ICustomerDal iCustomerDalfor : iCustomerDal) {
            iCustomerDalfor.add();
        }





        IRepsitory [] iRepsitory = {new MySqlCustomerDal(), new OracleCustomerDal()};
        for (IRepsitory iRepsitoryfor : iRepsitory){
            iRepsitoryfor.add1();
        }



       /*


        ICustomerDal iCustomerDal1 = new MySqlCustomerDal();

        customerManager.iCustomerDal = new SqlserverManager();
        iCustomerDal.add();

        IRepsitory iRepsitory = new OracleCustomerDal();
        iRepsitory.add1();

        ICustomerDal iCustomerDal3 = new OracleCustomerDal();
        iCustomerDal3.add();


        */



    }


}
