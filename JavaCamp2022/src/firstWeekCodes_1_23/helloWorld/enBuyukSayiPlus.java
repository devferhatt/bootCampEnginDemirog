package firstWeekCodes_1_23.helloWorld;

import java.util.Scanner;

public class enBuyukSayiPlus {

    public static void main(String[] args) {

        //Projenin Daha Gelismis Versiyonu


        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n    -    Bu program girilen tam sayi degerlerinin en buyugunu bastiracaktir...");

        System.out.print("\n    -    Ilk Sayiyi Giriniz : ");
        int ilkSayi = scanner.nextInt();

        System.out.print("\n    -    Ikinci Sayiyi Giriniz : ");
        int ikinciSayi = scanner.nextInt();

        System.out.print("\n    -    Ucuncu Sayiyi Giriniz : ");
        int ucuncuSayi = scanner.nextInt();




        if (ilkSayi > ikinciSayi && ilkSayi > ucuncuSayi) {
            System.out.print("\n    -    En Buyuk Sayi : " + ilkSayi);
                if (ikinciSayi > ucuncuSayi) {
                    System.out.print("    -    Ortanca Sayi : " + ikinciSayi);
                    System.out.print("    -    En Kucuk Sayi : " + ucuncuSayi);
                }
                else if (ucuncuSayi > ikinciSayi) {
                    System.out.print("    -    Ortanca Sayi : " + ucuncuSayi);
                    System.out.print("    -    En Kucuk Sayi : " + ikinciSayi);
                }
        }
        else if (ikinciSayi > ilkSayi && ikinciSayi > ucuncuSayi) {
            System.out.print("\n    -    En Buyuk Sayi : " + ikinciSayi);
                if (ilkSayi > ucuncuSayi) {
                    System.out.print("    -    Ortanca Sayi : " + ilkSayi);
                    System.out.print("    -    En Kucuk Sayi : " + ucuncuSayi);
                }
                else if (ucuncuSayi > ilkSayi) {
                    System.out.print("    -    Ortanca Sayi : " + ucuncuSayi);
                    System.out.print("    -    En Kucuk Sayi : " + ilkSayi);
                }
        }
        else if (ucuncuSayi > ikinciSayi && ucuncuSayi > ilkSayi) {
            System.out.print("\n    -    En Buyuk Sayi : " + ucuncuSayi);
                if (ikinciSayi > ilkSayi) {
                    System.out.print("    -    Ortanca Sayi : " + ikinciSayi);
                    System.out.print("    -    En Kucuk Sayi : " + ilkSayi);
                }
                else if (ilkSayi > ikinciSayi) {
                    System.out.println("    -    Ortanca Sayi : " + ilkSayi);
                    System.out.print("    -    En Kucuk Sayi : " + ikinciSayi);
                }
        }
        else{
            System.out.println("\n\n    -    Lutfen Tam Sayi Degerler Girdiginizden Emin Olun...");
        }




    }


}