package thirdWeekCodes.thirdWeekCodes_38_.staticDemo;

public class ProductValodator {
    public static boolean isValid(Product product){


            if (product.price > 0 && !product.name.isEmpty()){
                return true;
            }
            else {
                return false;
            }

    }
}
