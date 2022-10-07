package thirdWeekCodes.thirdWeekCodes_38_.Interfaces;

public class CustomerManager {
    private ICustomerDal iCustomerDal;

    public CustomerManager(ICustomerDal iCustomerDal)   {
        this.iCustomerDal = iCustomerDal;
    }

    public void add(){
        //Is Kodlari
        iCustomerDal.add();

    }



}
