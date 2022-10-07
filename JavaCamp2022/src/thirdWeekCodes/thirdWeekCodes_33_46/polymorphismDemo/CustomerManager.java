package thirdWeekCodes.thirdWeekCodes_38_.polymorphismDemo;

public class CustomerManager extends BaseLogger{
   private BaseLogger logger;

   public CustomerManager(BaseLogger logger){
       this.logger = logger;

   }

    public void add(){
        System.out.println("musteri eklendi !");
        DatabaseLogger databaseLogger = new DatabaseLogger();
        this.logger.log("log mesaji ");

    }

}

