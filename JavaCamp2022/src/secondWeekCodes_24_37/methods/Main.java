package methods;

public class Main {

    public static void main(String[] args) {

        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();

    }

    public static void sayiBulmaca() {

        int[] sayilar = new int[] { 1, 3, 4, 6, 7, 4, 2, 1, 2 };
        int aranacakSayi = 3;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacakSayi) {
                varMi = true;
                break;
            }

        }
        if (varMi) {
            mesajVer("Sayı mevcuttur " + aranacakSayi);
        } else {
            System.out.println("Sayı mevcut değildir: " + aranacakSayi);
        }
    }

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }

}