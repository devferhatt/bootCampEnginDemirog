package firstWeekCodes_1_23.if_elseif_else;

public class recapDemo1 {

    public static void main(String[] args) {

        int sayi1 = 266;
        int sayi2 = 25;
        int sayi3 = 26;

        int enBuyuk = sayi1;

        if (enBuyuk < sayi2) {
            enBuyuk = sayi2;

        }
        if (enBuyuk < sayi3) {
            enBuyuk = sayi3;
        }

        System.out.format("En buyuk Sayi %s dir" + enBuyuk);
    }
}

