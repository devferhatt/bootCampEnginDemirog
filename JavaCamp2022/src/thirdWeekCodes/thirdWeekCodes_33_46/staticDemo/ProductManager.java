package thirdWeekCodes.thirdWeekCodes_38_.staticDemo;

public class ProductManager {

    public  void add(Product product){

        //ProductValodator valodator = new ProductValodator();

            if (ProductValodator.isValid(product)){
                System.out.println("Eklendi.");

            }

            else {
                System.out.println("Urun Bilgileri Gecersizdir. ");
            }


    }
}
