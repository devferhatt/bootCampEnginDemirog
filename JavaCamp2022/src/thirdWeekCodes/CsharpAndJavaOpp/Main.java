package thirdWeekCodes.CsharpAndJavaOpp;

public class Main {

    public static void main(String[] args) {

       /*

       CreditManager creditManager = new CreditManager();
        creditManager.Save();
        creditManager.Calculate();

        */

        //Ioc Container
        CustomerManager customerManager = new CustomerManager(new Customer() , new TeacherCreditManager());
        customerManager.GiveCredit();

        /*

        Customer customer = new Customer();
        customer.Id(1);
        customer.FirstName("Ferhat");
        customer.LastName("Ssm");
        customer.NationalIdentity("Turk");
        Bunlar ekrana nasil yaziliyor bul

        */





    }


    static class CreditManager {
        public void Calculate() {
            System.out.println("Hesaplandi");


        }
        //DRY
        public void Save() {
            System.out.println("Kredi Verildi");
        }

    }

    interface ICreditManager {
        void Calculate();
        void Save();

    }
    static abstract class BaseCreditManager implements ICreditManager{

        @Override
        public abstract void Calculate();

        @Override
        public  void Save() {
            System.out.println("Ogretmen Kredi Verildi");

        }

    }


    static class TeacherCreditManager extends BaseCreditManager implements ICreditManager
    {


        @Override
        public void Calculate() {
            //hesaplamalar
            System.out.println("Ogretmen Kredisi Hesaplandi");

        }

        @Override
        public void Save() {
            System.out.println("Ogretmen Kredi Verildi");

        }
    }
    static class MilitaryCreditManager extends BaseCreditManager implements ICreditManager
    {

        @Override
        public void Calculate() {
            System.out.println("Asker Kredisi Hesaplandi");

        }

        @Override
        public void Save() {
            System.out.println("Asker Kredi Verildi");

        }
    }


    static class Customer{

        //constructor
        public Customer(){
            System.out.println("Musteri Nesnesi Baslatildi");
        }
        public void Id(int Id){

        }
        public void FirstName(String FirstName){

        }
        public void LastName(String LastName){

        }
        public void NationalIdentity(String NationalIdentity){

        }



    }

    static class CustomerManager{

        private Customer _customer;
        private ICreditManager _icreditManager;

        //constructor
        public CustomerManager(Customer customer , ICreditManager icreditManager){
            _customer = customer;
            _icreditManager =  icreditManager;

        }

        public void Save(){
            System.out.println("Musteri Kaydedildi : ");
        }
        public void Delete(){
            System.out.println("Musteri Silindi : ");
        }

        public void GiveCredit(){

            _icreditManager.Calculate();
            System.out.println("Kredi Verildi ");

        }



    }






























}


