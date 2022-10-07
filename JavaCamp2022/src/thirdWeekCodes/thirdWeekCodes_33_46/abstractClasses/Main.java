package thirdWeekCodes.thirdWeekCodes_38_.abstractClasses;

public class Main {

    public static void main(String[] args) {
//        GameCalculator[] process = new GameCalculator[] { new MenCalculator() , new WomenCalculator() , new KidsCalculator() } ;
//        WomenCalculator womenCalculator = new WomenCalculator();

        /*for (GameCalculator processs : process){
            System.out.println(processs.());
        }*/
//        GameCalculator[] process1 = new GameCalculator[] {new MenCalculator() , new WomenCalculator() , new OlderGameCalculator() , new KidsCalculator()}

        GameCalculator gameCalculator0 = new WomenCalculator();
        gameCalculator0.hesapla();
        gameCalculator0.gamerOver();

        GameCalculator gameCalculator1 = new KidsCalculator();
        gameCalculator1.hesapla();

        GameCalculator gameCalculator2 = new OlderGameCalculator();
        gameCalculator2.hesapla();
        gameCalculator2.gamerOver();



    }




}
