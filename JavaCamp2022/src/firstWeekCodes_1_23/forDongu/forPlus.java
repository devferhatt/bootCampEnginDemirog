package firstWeekCodes_1_23.forDongu;

public class forPlus {
    public static void main(String[] args) {
        //1'den 60'a Cift sayilar
        for(int i = 0; i<=60; i+=2){
            System.out.println("  i : " + i);
       }

        //1'den 60'a 7'ye bolunen
        for(int i = 0; i<=60; i++){
            if(i % 7 == 0){
                System.out.println(" i : " + i);
            }

        }

        //60'dan 1'e tek olup 3'e tam bolunen sayilar
        for(int i = 60; i>=0; i--){
            if(i % 3 ==0  && i % 2 ==1){
                System.out.println("  i : " + i );
            }
        }

    }


}
