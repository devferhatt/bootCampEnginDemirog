package thirdWeekCodes.thirdWeekCodes_38_.polymorphismDemo;

public class Main {
    public static void main(String[] args) {

       /* BaseLogger [] loggers = new BaseLogger[] { new FileLogger(), *//*new EmailLogger()*//* new DatabaseLogger(), new CustomerManager(), new ConsoleLogger() };
       for (BaseLogger logger:loggers){
           logger.log1("Log Mesaji ! ");
       }*/


        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());

        customerManager.add();




















































    }
}
